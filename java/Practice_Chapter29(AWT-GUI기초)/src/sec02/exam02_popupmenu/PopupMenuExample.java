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
      
      PopupMenu pMenu = new PopupMenu("����");
      MenuItem miCut = new MenuItem("�߶󳻱�");
      MenuItem miCopy = new MenuItem("�����ϱ�");
      MenuItem miPaste = new MenuItem("�ٿ��ֱ�");
      
      //�˾� �޴��� �޴������۵��� �߰��Ѵ�.
      pMenu.add(miCut);
      pMenu.add(miCopy);
      pMenu.add(miPaste);
      
      //�˾� �޴��� �����ӿ� �߰��Ѵ�.
      f.add(pMenu);
      
      //�ݱ� �̺�Ʈ ó��
      f.addWindowListener(new WindowAdapter() {
         @Override
         public void windowClosing(WindowEvent e ) {
            System.exit(0);
         }
      });
      
      //�����ӿ� �̺�Ʈ ó���� ���ؼ� �����ʸ� �߰��Ͽ���.
      //���콺�����Ŭ������ �߰��Ͽ� �������̵��� �ϴ� �͸� �ڽ� ��ü�� ����� �ִ�.
      f.addMouseListener(new MouseAdapter() {
         @Override
         public void mousePressed(MouseEvent e) {
            if(e.getModifiers() == MouseEvent.BUTTON3_MASK) {
               pMenu.show(f, e.getX(), e.getY());
               System.out.println("���콺 ������ x ��ǥ : " + e.getX() + "���콺 ������ y��ǥ : " + e.getY());
            }
         }
      });
      f.setVisible(true);
   }
}
