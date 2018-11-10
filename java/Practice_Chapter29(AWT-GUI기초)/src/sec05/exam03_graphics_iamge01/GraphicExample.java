package sec05.exam03_graphics_iamge01;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GraphicExample extends Frame implements MouseMotionListener {

   int x = 0;
   int y = 0;
   
   //�ʵ�� Image��ü�� Graphics��ü�� �����ߴ�.
   Image img = null;
   Graphics gImg = null;
   
   //������
   public GraphicExample(String title) {
      super(title);
      //�����ʿ� �̺�Ʈ ���
      this.addMouseMotionListener(this);
      this.addWindowListener(new WindowAdapter() {
         @Override
         public void windowClosing(WindowEvent e) {
            System.exit(0);
         }
      });
      //Frame�� (100, 100)�� ��ġ�� width 500, height 600ũ��� ���̰� �Ѵ�.
      this.setBounds(100, 100, 500, 500);
      this.setVisible(true);
      
      //Image�� Image�� Graphics�� ��Ӻ����� �����ϰ�, �����ڿ��� createImage()�� ���ؼ� Frame��
      //���� ũ���� Image�� �����ϰ�, ������ Image���� getGraphics()�� ȣ���Ͽ� Image�� ���� Graphics�� ��´�.
      //�̷��� �ؼ� ����� Graphics�� drawString()�� ���� �޼��带 ȣ���ؼ� �۾��� ������ Image�� �׷����� �ȴ�.
      
      //�Ʒ��� this�� ���� �ٸ� ���̴� ���� this�� Ŭ���� �ʵ带 ������ this�� Frame�� ����Ų��!!
      this.img = this.createImage(500, 500); //����ȭ���� �� ImageŬ����
      this.gImg = img.getGraphics();
      this.gImg.drawString("���ʹ�ư�� ���� ä�� ���콺�� ������ ������", 10, 50);
      repaint();
   }
   @Override
   public void paint(Graphics g) {
      if(img!=null) {
         // ����ȭ�鿡 �׷��� �׸��� Frame�� �����ϰ� �ִ�.
         // �� �κ��� Image�� �׷��� ������ ��� this(Frame)�� �����ϰ� �ִ�.
         // �Ͽ�, �ٸ� ȭ�鿡 �������ٰ� �ٽ� ������ �״���� ���̴�.
         // ���⼭ ImageObserver�� this�� ������ ���ִµ� ImageObserver �������̽���
         // ��� ������Ʈ Ŭ������ ������ �������̽��ε�, �̹����� �ε��Ǵµ� �ð���
         // �ɸ��� ������ �ε��� ����Ǵ� ���¿� ���� ȭ�鿡 �ٽ� �׷������ �ʿ䰡 �ִ�.
         // �׷��� �̹����� �ε��ǰ� �ִ� ���¸� �˷��� ����� ImageObserver�� �����ؾ� �Ѵ�.
         // �Ͽ� ��� component�ڽ��� �־��ִ� ���̴�.
         System.out.println(Thread.currentThread().getName());
         g.drawImage(img, 0, 0, this);
      }
   }
   @Override
   public void mouseMoved(MouseEvent e) {}
   @Override
   public void mouseDragged(MouseEvent e) {
      if(e.getModifiersEx() == MouseEvent.BUTTON1_DOWN_MASK); {
         this.x = e.getX();
         this.y = e.getY();
         gImg.drawString("*", this.x, this.y);
         repaint();
      }
      
   }
   
}
