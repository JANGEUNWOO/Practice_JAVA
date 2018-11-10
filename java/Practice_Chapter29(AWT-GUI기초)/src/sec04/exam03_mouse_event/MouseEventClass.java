package sec04.exam03_mouse_event;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MouseEventClass extends Frame {
   
   Label location;
   
   public MouseEventClass(String title) {
      super(title); // Frame(String title)�� ȣ���Ѵ�.
      this.setLocation(500, 300);
   }
   
   public void MouseShow() {
      this.location = new Label("");
      this.location.setSize(195, 15);
      this.location.setLocation(50,50);
      
      //Label�� ������ ��������� �Ѵ�.
      this.location.setBackground(Color.yellow);
      this.add(location);
      
      //EventHandler�� �ν��Ͻ��� Frame�� Listener�� ����Ѵ�.
      this.addMouseMotionListener(new EventHandler());
      this.setSize(300, 200);
      this.setLayout(null);
      this.setVisible(true);
      //������ �̺�Ʈ �ۼ� -- �͸��ڽİ�ü�� ����
      WindowAdapter wa = new WindowAdapter() {
         @Override
         public void windowClosing(WindowEvent e) {
            System.exit(0);
         }
      };
      //�����츮���� ���
      this.addWindowListener(wa);
   }
   //��ø Ŭ����--MouseAdapter
   class EventHandler extends MouseAdapter {
      @Override
      public void mouseMoved(MouseEvent e) {
         location.setText("Mouse ��ǥ : (" + e.getX() + ", " + e.getY() + ")");
         
      }
   }
}
