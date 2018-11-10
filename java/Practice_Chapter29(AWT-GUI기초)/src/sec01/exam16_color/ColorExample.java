package sec01.exam16_color;

import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class ColorExample {

	public static void main(String[] args) {
		// Frame의 레이아웃을 GridLayout으로 설정하였다.
		Frame f=new Frame("Color example");
		f.setLayout(new GridLayout(14,2));
		
		//수평, 수직 갭을 생성자로 통헤서 5픽셀만큼 설정함
		
		//f.setlayout(new gridlayout(14,2,5,5));
		
		Panel p1=new Panel();
		p1.setBackground(Color.black);
		
		Panel p2=new Panel();
		p2.setBackground(Color.blue);
		
		Panel p3=new Panel();
		p3.setBackground(Color.green);
		
		Panel p4=new Panel();
		p4.setBackground(Color.red);
		
		Panel p5=new Panel();
		p5.setBackground(Color.orange);
		
		Panel p6=new Panel();
		p6.setBackground(Color.pink);
		
		Panel p7=new Panel();
		p7.setBackground(Color.magenta);
		
		Panel p8=new Panel();
		p8.setBackground(Color.white);
		
		Panel p9=new Panel();
		p9.setBackground(Color.yellow);
		
		Panel p10=new Panel();
		p10.setBackground(Color.DARK_GRAY);
		
		Panel p11=new Panel();
		p11.setBackground(Color.LIGHT_GRAY);
		
		Panel p12=new Panel();
		p12.setBackground(Color.GRAY);
		
		Panel p13=new Panel();
		p13.setBackground(Color.blue);
		
		Panel p14=new Panel();
		p14.setBackground(new Color(50,100,100));
		
		f.add(new Label("1"));    f.add(p1);
		f.add(new Label("2"));    f.add(p2);
		f.add(new Label("3"));    f.add(p3);
		f.add(new Label("4"));    f.add(p4);
		f.add(new Label("5"));    f.add(p5);
		f.add(new Label("6"));    f.add(p6);
		f.add(new Label("7"));    f.add(p7);
		f.add(new Label("8"));    f.add(p8);
		f.add(new Label("9"));    f.add(p9);
		f.add(new Label("10"));    f.add(p10);
		f.add(new Label("11"));    f.add(p11);
		f.add(new Label("12"));    f.add(p12);
		f.add(new Label("13"));    f.add(p13);
		f.add(new Label("14"));    f.add(p14);
		f.setSize(250, 300);
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	
	}

}
