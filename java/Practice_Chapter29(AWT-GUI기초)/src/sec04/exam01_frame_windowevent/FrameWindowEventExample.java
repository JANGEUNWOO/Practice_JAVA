package sec04.exam01_frame_windowevent;

import java.awt.Frame;

public class FrameWindowEventExample {

	public static void main(String[] args) {
		
		
		Frame f=new Frame();
		f.setSize(300, 200);
		f.setLocation(500,500);
		
		/*
		 * �� ���ο��� �̺�Ʈ�� �߻��ϸ� ó���� EventHandlerŬ������ �����Ͽ�
		 * �����ʿ� ����ϰ� �ִ�. �����ʰ� �����ΰ�? ��� ���̴�. �� �̺�Ʈ�� �����ϰ� �ִ� ��
		 */
		
		f.addWindowListener(new EventHandler());
		f.setVisible(true);
		
		/*
		 * ��������� �۷ν� ǥ�����ڸ�
		 * �ϴ� ����ڰ� �ݱ�(x)��ư�� ��������
		 * 1. WindowEvent�� �߻��ϰ� (windowListener �ν��Ͻ��� ����),
		 * 2. Frame�� WindowListener�� ��ϵǾ� �ִ� �̺�Ʈ�ڵ鷯��
		 *   windowClosing�޼��带 ȣ���Ѵ�. �� �޼��� �������� �̺�Ʈ
		 *   �߻��� ������ windowEvent�ν��Ͻ��� ������ ��� ����� �� �־
		 *   windowEvent�ν��Ͻ��� �޼������ ����Ҽ� �ִ� ���̴�.
		 */
		
		

	}

}
