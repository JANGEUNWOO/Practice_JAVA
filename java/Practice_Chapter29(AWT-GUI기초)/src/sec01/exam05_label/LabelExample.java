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
		
		Toolkit tk=Toolkit.getDefaultToolkit();  //������ Toolkit ��ü�� ��´�.
		Dimension screenSize=tk.getScreenSize();  //ȭ���� ũ�⸦ ����
		
		f.setLocation(screenSize.width/2-150, (screenSize.height/2)-100);
		f.setVisible(true);
		
		Label id=new Label("ID:");  //Label�� �����ϰ� ũ��� ��ġ�� ����
		id.setBounds(50,50,30,10); //50,50��ġ�� ũ�Ⱑ ����30, ���� 10
		
		Label ped=new Label("Password:");
		ped.setBounds(50,65,100,10);
		
		//������ Label�� Frame�� ���Խ�Ų��.
		f.add(id);
		f.add(ped);
		f.setVisible(true);
		//Frame ũ�� ���� �Ұ��ϰ� �ϴ� �޼��尡 setResizeable(false)�̴�. 
		f.setResizable(false);

	}

}
