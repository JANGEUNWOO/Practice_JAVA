package sec04_verify;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TenButtonFrame {

	public static void main(String[] args) {
		
		Frame f=new Frame("Ten Color Buttons Frame");
		f.setLayout(new GridLayout(1,10));
		
		Button p1=new Button("1");
		p1.setBackground(Color.red);
		
		Button p2=new Button("2");
		p2.setBackground(Color.orange);
		
		Button p3=new Button("3");
		p3.setBackground(Color.yellow);
		
		Button p4=new Button("4");
		p4.setBackground(Color.green);
		
		Button p5=new Button("5");
		p5.setBackground(Color.cyan);
		
		Button p6=new Button("6");
		p6.setBackground(Color.blue);
		
		Button p7=new Button("7");
		p7.setBackground(Color.magenta);
		
		Button p8=new Button("8");
		p8.setBackground(Color.gray);
		
		Button p9=new Button("9");
		p9.setBackground(Color.pink);
		
		Button p10=new Button("10");
		p10.setBackground(Color.LIGHT_GRAY);
		
		
		f.add(p1);
		f.add(p2);
		f.add(p3);
		f.add(p4); 
		f.add(p5);
		f.add(p6);
		f.add(p7); 
		f.add(p8);
		f.add(p9);    
		f.add(p10);
		
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
