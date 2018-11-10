package sec04.exam08_paintframe;

import java.awt.Color;
import java.awt.Graphics;

public class Main {

   public static void main(String[] args) {

      PaintFrame paintFrame = new PaintFrame("PaintFrame");

      Graphics graphics = paintFrame.getGraphics();
      graphics.setColor(Color.red);

      for (int i = 0; true; i += paintFrame.speed) {
         // �Ʒ��� ���� ������ ���� ������ ȭ���� ��� Ŭ����Ǿ� �������� �ʴ´�.
         try {
            Thread.sleep(100); // 0.1�� ���� ������ ������Ų��
         } catch (Exception e) {
         }

         graphics.clearRect(0, 0, 300, 300);// ������ ������ ȭ���� �����.
         // graphics.clearRect(0, 0, 1, 1);//������ Ŭ��� �ϸ� ������� �Ͼ��?

         System.out.println("��ũ�� ���� �� : " + paintFrame.speed + "i�� : " + i);
         graphics.drawString("��~~��!!", i, 150);
         // �Ʒ��� ������ ���� ���� ������ �Ͼ��
         i = (i < 300) ? i : 0;
         // i =(i<10000)?i:0;
         // i =(i<50)?i:0;
      }
   }

}
