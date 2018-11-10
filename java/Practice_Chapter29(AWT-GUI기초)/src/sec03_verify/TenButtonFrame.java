package sec03_verify;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TenButtonFrame {

	public static void main(String[] args) {
		
		
		Frame f=new Frame("Ten Color Buttons Frame");
		f.setLayout(new GridLayout(1,10));
		f.setSize(250, 300);
		f.setVisible(true);
		
		Button p1=new Button("1");
		Button p2=new Button("2");
		Button p3=new Button("3");
		Button p4=new Button("4");
		Button p5=new Button("5");
		Button p6=new Button("6");
		Button p7=new Button("7");
		Button p8=new Button("8");
		Button p9=new Button("9");
		Button p10=new Button("10");
		
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
		
		f.addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

	}

}
