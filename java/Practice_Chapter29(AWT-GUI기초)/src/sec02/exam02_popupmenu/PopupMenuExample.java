package sec02.exam02_popupmenu;

import java.awt.Frame;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class PopupMenuExample {

   public static void main(String[] args) {
      
      Frame f = new Frame("Popupmenu Example");
      f.setSize(500, 500);
      
      PopupMenu pMenu = new PopupMenu("편집");
      MenuItem miCut = new MenuItem("잘라내기");
      MenuItem miCopy = new MenuItem("복사하기");
      MenuItem miPaste = new MenuItem("붙여넣기");
      
      //팝업 메뉴에 메뉴아이템들을 추가한다.
      pMenu.add(miCut);
      pMenu.add(miCopy);
      pMenu.add(miPaste);
      
      //팝업 메뉴를 프레임에 추가한다.
      f.add(pMenu);
      
      //닫기 이벤트 처리
      f.addWindowListener(new WindowAdapter() {
         @Override
         public void windowClosing(WindowEvent e ) {
            System.exit(0);
         }
      });
      
      //프레임에 이벤트 처리를 위해서 리스너를 추가하였다.
      //마우스어댑터클래서를 추가하여 오버라이딩을 하는 익명 자식 객체를 만들고 있다.
      f.addMouseListener(new MouseAdapter() {
         @Override
         public void mousePressed(MouseEvent e) {
            if(e.getModifiers() == MouseEvent.BUTTON3_MASK) {
               pMenu.show(f, e.getX(), e.getY());
               System.out.println("마우스 포인터 x 좌표 : " + e.getX() + "마우스 포인터 y좌표 : " + e.getY());
            }
         }
      });
      f.setVisible(true);
   }
}
