package sec05.exam02_graphics_awt_thread;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GraphicExample extends Frame implements MouseMotionListener {

   int x = 0;
   int y = 0;
   
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
   }
   
   // AWT������� ��� ���󽺷���� �����ϴٰ� GUI���ø����̼� ���α׷��� ���۵Ǹ�,
   // �ڵ����� Paint()�� ȣ���Ѵ�. AWT�����忡 ���� �ڵ������� ȭ���� ���ŵǴ� ��Ȳ��
   // �Ʒ��� ���� �����ߴ�.
   // 1. ó�� ȭ�鿡 ��Ÿ�� ��
   // 2. �ٸ� ȭ�鿡 ������ �ִ� �κ��� �ٽ� ȭ�鿡 ��Ÿ�� ��
   // 3. ������ȭ �Ǿ� �ִٰ� ���� ũ��� ȭ�鿡 ��Ÿ�� ��
   // ������, ���� ��Ȳ �̿ܿ��� ȭ���� �ٽ� �׷������� ��û�� �� �ִ�. �� ����� �ٷ�
   // repaint()�� ȣ���ϴ� ���̴�. ����ڰ� repaint()�� ȣ���ϸ� AWT�����忡�� �ٽ� ȭ���� �׸���� ��û�ϴ� ���̴�.
   // AWT������� update()�� ȣ���ϰ� update()�� �ٽ� paint()�� ȣ���ϴ� ������ ���̴�.
   
   // repaint() - AWT�����忡�� ȭ���� ������ ���� ��û��. 0.1�ʸ��� Ȯ���ؼ� ��û�� ������ update()�� ȣ��
   // update(Graphics g) - ȭ���� ����� paint(Graphics g)�� ȣ���Ѵ�.
   
   // ��� ������ �����Ͽ� UI���� �����尡 ��� �����̴����� �˰� ���α׷����� �ؾ� �� ���̴�.
   
   @Override
   public void paint(Graphics g) {
      System.out.println("paint()�� �����̴� ������ : " + Thread.currentThread().getName());
      g.drawString("���콺�� ������������", 10, 50);
      g.drawString("*", this.x, this.y);
   }
   @Override
   public void mouseMoved(MouseEvent e) {
      this.x = e.getX();
      this.y = e.getY();
      //repaint()�� �ּ�ó���ϸ� '*'�� ��� �Ǵ��� ���� Ȯ���غ���.
      this.repaint();            //AWT�����忡�� ȭ�� ���� ���, �ڵ� update()ȣ��. �ٽ� paint()ȣ��
   }
   
   //update()�� ���� ȭ���� �������� �����, paint()�� ȣ���ϴµ� ������ �������̵��ؼ� ������ �ʰ�
   //paint()�� ȣ���Ͽ���. ȭ���� ������ٰ� �ٽ� Ȱ��ȭ�Ǹ�, paint()�� ȣ��Ǿ����Ƿ� ȭ�鿡��
   //�ִ� ������ �������. �� ������ Frame�� ���� �׷ȱ� �����̴�. ���� �������� ���� ImageŬ������
   //����� ����ȭ�鿡 �׸��� �׸��� ����ȭ�� Component�� �����ϸ� �������� ���� ���̴�.
   @Override
   public void update(Graphics g) {
      System.out.println("update()�� �����̴� ������ : " + Thread.currentThread().getName());
      paint(g);
   }
   @Override
   public void mouseDragged(MouseEvent e) {}
}
