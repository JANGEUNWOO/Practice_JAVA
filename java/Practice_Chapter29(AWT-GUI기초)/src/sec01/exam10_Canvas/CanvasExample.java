package sec01.exam10_Canvas;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;

public class CanvasExample {

	public static void main(String[] args) {
		
		
		Frame f=new Frame();
		f.setSize(300,200);
		f.setLayout(null);  //Frame의 Layout Manager설정을 해체한다.
		
		Canvas c=new  Canvas();
		
		//Canvas c=new Canvas();
		c.setBackground(Color.GREEN);
		
		//setBounds는 frame의 안의 위치(x,y)를 50,50부터 시작한다.
		c.setBounds(50,50,150,100);
		
		//Canvas를 Frame에 포함시킨다.
		f.add(c);
		f.setVisible(true);

	}
}
