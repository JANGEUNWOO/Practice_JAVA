package sec01.exam01_frame;

import java.awt.Frame;

public class FrameExample01 {

	public static void main(String[] args) {
		
		 //Frame ��ü�� �����Ѵ�.
		 Frame frame=new Frame("Login");
		 
		 //Frame�� ũ�⸦ �����Ѵ�.(ComponentŬ������ ���ǵ� �޼���)
		 frame.setSize(300,200);
		 
		 //Frame�� ��ġ�� �����Ѵ�.
		 frame.setLocation(300, 300);
		 
		
		 //������ frame�� ȭ�鼭 ���̵��� �Ѵ�.(ComponentŬ������ ���ǵ� �ż���)
		 frame.setVisible(true);

	}

}
