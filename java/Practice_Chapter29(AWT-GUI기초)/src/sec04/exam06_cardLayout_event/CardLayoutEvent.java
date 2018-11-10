package sec04.exam06_cardLayout_event;

import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CardLayoutEvent extends Frame{
   Button first, prev, next, last;
   //강의 때도 설명했지만, Panel은 종속적인 컨테이너이다. 컨테이너이기 때문에
   //컴포넌트들을 포함할 수 있다. 하지만, 타이틀 바나 버튼만 없을 뿐이다.
   Panel buttons;
   Panel slide;   //슬라이드 형식으로 만들 panel컨테이너
   Panel card1, card2, card3, card4, card5;   // slide에 포함될 Panel들
   CardLayout card;
   
   public CardLayoutEvent(String title) {
      super(title);   //조상인 Frame의 생성자 Frame(String title)을 호출
   }
   public void CardShow() {
      
      //화면을 담을 Panel을 담는다.
      this.slide = new Panel();
      //LayoutManager중 앞서 강의도 했지만, CardLayout매니저는
      //슬라이드 형태로 책처럼 넘기는 매니저이다.
      this.card = new CardLayout();
      //Panel컨테이너인 slide에 레이아웃매니저는 원래 FlowLayout인데
      //CardLayout으로 설정하고 있다.
      this.slide.setLayout(card);
      //버튼을 담을 Panel을 만든다.
      this.buttons = new Panel();
      //Button패널의 레이아웃 설정함.
      this.buttons.setLayout(new FlowLayout());
      
      this.first = new Button("<<");
      this.prev = new Button("<");
      this.next = new Button(">");
      this.last = new Button(">>");
      
      //Button패널에 위의 4가지 버튼을 추가함.
      this.buttons.add(first);
      this.buttons.add(prev);
      this.buttons.add(next);
      this.buttons.add(last);
      //각각의 Panel을 5개 만들고 있다.
      this.card1 = new Panel();
      card1.setBackground(Color.gray);
      card1.add(new Label("첫 번째 페이지입니다."));
      
      this.card2 = new Panel();
      card2.setBackground(Color.orange);
      card2.add(new Label("두 번째 페이지입니다."));
      
      this.card3 = new Panel();
      card3.setBackground(Color.blue);
      card3.add(new Label("세 번째 페이지입니다."));
      
      this.card4 = new Panel();
      card4.setBackground(Color.cyan);
      card4.add(new Label("네 번째 페이지입니다."));
      
      this.card5 = new Panel();
      card5.setBackground(Color.pink);
      card5.add(new Label("다섯 번째 페이지입니다."));
      
      //slide(Panel)에 card1(Panel)을 "1"이란 이름으로 추가한다.
      this.slide.add(card1, "1");
      this.slide.add(card2, "2");
      this.slide.add(card3, "3");
      this.slide.add(card4, "4");
      this.slide.add(card5, "5");
      /* 이벤트 처리 부분 */
      //버튼에 이벤트 리스너를 추가한다.
      this.first.addActionListener(new ActionListener() {         
         @Override
         public void actionPerformed(ActionEvent e) {
            //CardLayout의 첫 번째 slide(Panel)이 보이도록 한다.
            card.first(slide);            
         }
      });
      this.prev.addActionListener(new ActionListener() {         
         @Override
         public void actionPerformed(ActionEvent e) {
            //현재 slide의 이전 slide(Panel)이 보이도록 한다.
            card.previous(slide);            
         }
      });
      this.next.addActionListener(new ActionListener() {         
         @Override
         public void actionPerformed(ActionEvent e) {
            //현재 slide의 다음 slide(Panel)이 보이도록 한다.
            card.next(slide);            
         }
      });
      this.last.addActionListener(new ActionListener() {         
         @Override
         public void actionPerformed(ActionEvent e) {
            //CardLayout의 마지막 slide(Panel)이 보이도록 한다.
            card.last(slide);            
         }
      });
      this.add("South", buttons);
      this.add("Center", slide);
      this.setSize(500, 500);
      this.setLocation(300, 100);
      this.setVisible(true);
      
      WindowAdapter wa = new WindowAdapter() {
         @Override
         public void windowClosing(WindowEvent e) {
            System.exit(0);
         }   
      };
      this.addWindowListener(wa);   
      //실행을 하게 되면, 첫번째 슬라이드(card1)가 나타나게 한다.
      card.show(slide, "1");
   }
}
