package sec02_verify;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyBorderLayoutFrame {

	public static void main(String[] args) {
		
		
		Frame f=new Frame("BorderLayoutTest");
		f.setLayout(new BorderLayout());
		f.setSize(200,200);
		f.setVisible(true);
		
		Button north =new Button("North");
		Button south =new Button("South");
		Button west =new Button("West");
		Button east =new Button("East");
		Button center =new Button("Center");
		
		f.add(north,"North");
		f.add(south, "South");
		f.add(west,"West");
		f.add(east, "East");
		f.add(center,"Center");
		
		f.addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		

	}

}
