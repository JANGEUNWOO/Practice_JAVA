package sec01.exam04_list;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.List;
import java.awt.Toolkit;

public class Listexample {

	public static void main(String[] args) {
		
		//����ٿ��Ʈ, �޺��ڽ���� Ī��.
		
		Frame f=new Frame("List����");
		f.setSize(300,200);
		f.setLayout(null);
		
		Toolkit tk=Toolkit.getDefaultToolkit();
		Dimension screenSize=tk.getScreenSize();
		
		f.setLocation(screenSize.width/2-150, (screenSize.height/2)-100);
		f.setVisible(true);//������ frame ȭ�鿡 ���̵��� �Ѵ�.
        
		//����� ������ �� �ִ� List�� �����. ���⼭�� �����̸� ���ð���
		//�⺻������ �����ڿ����� �ι�° �Ű����� false�� �Ǿ� �ִ�.
		List selectOne=new List();
		selectOne.setLocation(20,40);
		selectOne.setLocation(100,120);
		selectOne.add("�л�");
		selectOne.add("������");
		selectOne.add("�������");
		selectOne.add("���α׷���");
		selectOne.add("�밡��");
		selectOne.add("����");
		selectOne.add("�����");
		selectOne.add("���ڼ���");
		selectOne.add("�뱳��");
		
		
		//�������� �ι�° �ΰ����� true�� ���� list�� ��Ͽ��� ���� Ű��
		//������ �� �ְ� ��
		List selectmany=new List(100,true);
		selectmany.setLocation(150,40);
		selectmany.setSize(100,120);
		selectmany.add("1��");
		selectmany.add("3��");
		selectmany.add("��");
		selectmany.add("�˱�");
		selectmany.add("8��");
		selectmany.add("�ξ�");
		selectmany.add("��Ʈ���̵�");
		
		f.add(selectOne);
		f.add(selectmany);
		
	}

}
