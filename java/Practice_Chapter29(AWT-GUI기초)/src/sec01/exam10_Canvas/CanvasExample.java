package sec01.exam10_Canvas;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;

public class CanvasExample {

	public static void main(String[] args) {
		
		
		Frame f=new Frame();
		f.setSize(300,200);
		f.setLayout(null);  //Frame�� Layout Manager������ ��ü�Ѵ�.
		
		Canvas c=new  Canvas();
		
		//Canvas c=new Canvas();
		c.setBackground(Color.GREEN);
		
		//setBounds�� frame�� ���� ��ġ(x,y)�� 50,50���� �����Ѵ�.
		c.setBounds(50,50,150,100);
		
		//Canvas�� Frame�� ���Խ�Ų��.
		f.add(c);
		f.setVisible(true);

	}
}
