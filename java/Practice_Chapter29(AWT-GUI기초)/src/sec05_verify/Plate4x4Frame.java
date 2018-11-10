package sec05_verify;

import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Arrays;

public class Plate4x4Frame {

	public static void main(String[] args) {
		
		
		Frame f=new Frame("Ten Color Buttons Frame");
		f.setLayout(new GridLayout(4,4));
		f.setSize(250, 300);
		f.setVisible(true);
		
		for(int i=0;i<16;i++) {
			Label pi=new Label(Integer.toString(i));
		    
			f.add(pi);
		    
			if(i==0) {
		    	pi.setBackground(Color.red);
		    }
		    if(i==1) {
		    	pi.setBackground(Color.orange);
		    }
		    if(i==2) {
		    	pi.setBackground(Color.yellow);
		    }
		    if(i==3) {
		    	pi.setBackground(Color.green);
		    }
		    if(i==4) {
		    	pi.setBackground(Color.cyan);
		    }
		    if(i==5) {
		    	pi.setBackground(Color.blue);
		    }
		    if(i==6) {
		    	pi.setBackground(Color.magenta);
		    }
		    if(i==7) {
		    	pi.setBackground(Color.gray);
		    }
		    if(i==8) {
		    	pi.setBackground(Color.pink);
		    }
		    if(i==9) {
		    	pi.setBackground(Color.LIGHT_GRAY);
		    }
		    if(i==10) {
		    	pi.setBackground(Color.WHITE);
		    }
		    if(i==11) {
		    	pi.setBackground(Color.DARK_GRAY);
		    }
		    if(i==12) {
		    	pi.setBackground(Color.black);
		    }
		    if(i==13) {
		    	pi.setBackground(Color.ORANGE);
		    }
		    if(i==14) {
		    	pi.setBackground(Color.BLUE);
		    }
		    if(i==15) {
		    	pi.setBackground(Color.red);
		    }
		    if(i==16) {
		    	pi.setBackground(Color.MAGENTA);
		    }
		 
		}
		
		f.addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

	}
}
