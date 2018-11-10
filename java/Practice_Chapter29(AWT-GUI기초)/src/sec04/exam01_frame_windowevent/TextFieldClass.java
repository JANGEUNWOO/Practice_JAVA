package sec04.exam01_frame_windowevent;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TextFieldClass extends Frame {

   Label lid;
   Label lpwd;
   TextField tfId;
   TextField tfPwd;
   Button ok;
   
   //생성자
   public TextFieldClass(String title) {
      super(title);       //frame(String title)을 호출한다.
   }
   
   public void textFieldShow() {
      this.lid = new Label("ID : ", Label.RIGHT); //Label의 텍스트 정렬을 오른쪽으로.
      this.lpwd = new Label("Password : ", Label.RIGHT);
      
      //10개의 글자를 입력할 수 있는 텍스트필드 생성
      this.tfId = new TextField(10);
      this.tfPwd = new TextField(10);
      this.tfPwd.setEchoChar('*');         //입력한 값 대신 '*'이 보이게 함
      this.ok = new Button("OK");
      
      //윈도우 창에 이벤트 처리를 위해 Listener를 추가
      this.addWindowListener(new WindowEventHandler());
      
      //아래와 같이 익명 구현객체로 만들면, 즉 인터페이스로 만들면
      //추상메서드를 전부 오버라이딩 해야한다.
      
      /*this.addWindowListener(new WindowListener() {   
         @Override
         public void windowOpened(WindowEvent e) {}
         
         @Override
         public void windowIconified(WindowEvent e) {}
         
         @Override
         public void windowDeiconified(WindowEvent e) {}
         
         @Override
         public void windowDeactivated(WindowEvent e) {}
         
         @Override
         public void windowClosing(WindowEvent e) {}
         
         @Override
         public void windowClosed(WindowEvent e) {}
         
         @Override
         public void windowActivated(WindowEvent e) {}
      });*/
      
      //OK버튼과 텍스트필드에 이벤트처리를 위한 Listener를 추가한다.
      this.tfId.addActionListener(new EventHandler());
      
      //아래와 같이 익명구현객체로 만들어도 된다. 물론 코드의 양이 적을 때 말이다.
      /*this.tfId.addActionListener(new ActionListener() {
         
         @Override
         public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            
         }
      });*/
      
      this.tfPwd.addActionListener(new EventHandler());
      this.ok.addActionListener(new EventHandler());
      
      this.setLayout(new FlowLayout());
      this.add(lid);
      this.add(tfId);
      this.add(lpwd);
      this.add(tfPwd);
      this.add(ok);
      
      //this.tfId.setText("아이디 입력");       //기본 텍스트 지정
      //this.tfId.setBackground(Color.BLUE);      //컴포넌트 배경색 지정
      this.setSize(450, 100);
      this.setLocation(500, 300);
      this.setVisible(true);         //frame이 화면에 보이게 한다.
      
   }
   
   //중첩클래스 EventHandler작성
   class EventHandler implements ActionListener {

      @Override
      public void actionPerformed(ActionEvent e) {
         String id = tfId.getText();
         String password = tfPwd.getText();
         //만약 db연동이라면 이부분에서 값을 비교하고 처리하면 될 것이다.
         if(!id.equals("perpear")) {
            System.out.println("입력하신 id가 유효하지 않습니다. 다시 입력해 주세요.");
            //id를 다시 입력할 수 있도록, focus를 tfId로 옮긴다.
            tfId.requestFocus();
            tfId.selectAll();      //tfid에 입력된 text가 선택되도록 한다.
         }
         else if (!password.equals("12345")) {
            System.out.println("입력하신 비밀번호가 틀렸습니다. 다시 입력해 주시기 바랍니다.");
            
            //id를 다시 입력할 수 있도록 focus를 tfid로 옮긴다.
            tfPwd.requestFocus();
            tfPwd.selectAll();
         }
         else {
            System.out.println(id + "님, 성공적으로 로그인 되었습니다.");
         }
      }
      
   }
   //중첩클래스 -- 윈도우 X버튼 눌렀을때 종료, 이번에는 windowsadapter이용
   class WindowEventHandler extends WindowAdapter {
      @Override
      public void windowClosing(WindowEvent e) {
         System.out.println("윈도우 이벤트 발생");
         e.getWindow().setVisible(true);   //화면 숨기기, 메모리 정리 안됨.
         e.getWindow().dispose();      //메모리 정리
         System.exit(0);               //프로그램 종료
      }
   }
}
