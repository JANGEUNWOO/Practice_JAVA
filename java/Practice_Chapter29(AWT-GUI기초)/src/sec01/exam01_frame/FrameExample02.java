package sec01.exam01_frame;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;

public class FrameExample02 {

	public static void main(String[] args) {
		//�ռ� ���������� �������� ������ܿ� ��ġ������ ������ �߰��� ��ġ ��Ű�� 
		//��ü�̴�.
		
		Frame f=new Frame("Login");
		f.setSize(300,200);
		
		//������ Toolkit��ü�� ��´�.
		Toolkit tk=Toolkit.getDefaultToolkit();
		//ȭ���� ũ�⸦ ���Ѵ�.
		Dimension screenSize= tk.getScreenSize();
		
		//ȭ��ũ���� ���ݰ����� frameũ���� ���ݰ��� �� ��ġ�� �ϸ� 
		//frame�� ȭ�� ��� ��ġ�ϰ� �ȴ�.
		//150, 100�� ���� ������ �������� �������� ������ �A���̴�.
		f.setLocation(screenSize.width/2-150,screenSize.height/2-100);
		f.setVisible(true);

	}

}
