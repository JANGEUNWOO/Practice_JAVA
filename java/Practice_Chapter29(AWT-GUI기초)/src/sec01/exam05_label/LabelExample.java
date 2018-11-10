package sec01.exam05_label;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Toolkit;

public class LabelExample {

	public static void main(String[] args) {
		
		
		Frame f=new Frame("Login:");
		f.setSize(300,200);
		f.setLayout(null);
		
		Toolkit tk=Toolkit.getDefaultToolkit();  //구현된 Toolkit 객체를 얻는다.
		Dimension screenSize=tk.getScreenSize();  //화면의 크기를 구함
		
		f.setLocation(screenSize.width/2-150, (screenSize.height/2)-100);
		f.setVisible(true);
		
		Label id=new Label("ID:");  //Label을 생성하고 크기와 위치를 지정
		id.setBounds(50,50,30,10); //50,50위치에 크기가 가로30, 세로 10
		
		Label ped=new Label("Password:");
		ped.setBounds(50,65,100,10);
		
		//생성한 Label을 Frame에 포함시킨다.
		f.add(id);
		f.add(ped);
		f.setVisible(true);
		//Frame 크기 조절 불가하게 하는 메서드가 setResizeable(false)이다. 
		f.setResizable(false);

	}

}
