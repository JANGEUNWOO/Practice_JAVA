package sec06_verify;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Arrays;

public class RandomLaberFrame {

	public static void main(String[] args) {
			
		
		Frame f=new Frame("Random Labels");
		f.setSize(500,500);
		f.setVisible(true);
		f.setLayout(null);
		
		Label[] j1 = new Label[20];
		
		for(int i=0;i<20;i++) {
			
			j1[i]=new Label(Integer.toString(i));
			int x = (int)(Math.random()*200)+50;
			int y = (int)(Math.random()*200)+50;
			j1[i].setSize(25, 25);
			j1[i].setLocation(x, y);
			j1[i].setBackground(Color.BLUE);
			f.add(j1[i]);

		}
		
		f.addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

	}

}
