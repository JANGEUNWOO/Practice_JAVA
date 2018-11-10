package sec04.exam08_paintframe;

import java.awt.Color;
import java.awt.Graphics;

public class Main {

   public static void main(String[] args) {

      PaintFrame paintFrame = new PaintFrame("PaintFrame");

      Graphics graphics = paintFrame.getGraphics();
      graphics.setColor(Color.red);

      for (int i = 0; true; i += paintFrame.speed) {
         // 아래와 같이 정지를 하지 않으면 화면이 계속 클리어되어 보이지가 않는다.
         try {
            Thread.sleep(100); // 0.1초 동안 실행을 지연시킨다
         } catch (Exception e) {
         }

         graphics.clearRect(0, 0, 300, 300);// 지정된 영역의 화면을 지운다.
         // graphics.clearRect(0, 0, 1, 1);//좌측과 클리어를 하면 어떤현상이 일어나나?

         System.out.println("스크롤 바의 값 : " + paintFrame.speed + "i값 : " + i);
         graphics.drawString("안~~녕!!", i, 150);
         // 아래를 조절해 보면 많은 현상이 일어난다
         i = (i < 300) ? i : 0;
         // i =(i<10000)?i:0;
         // i =(i<50)?i:0;
      }
   }

}
