package sec01.exam13_Dialog;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class DialogExample_no_event {

	public static void main(String[] args) {
		
		Frame f=new Frame("Parent");
		f.setSize(500,500);
		
		/* 
		 * Parent frame��(��Ӱ��谡 �ƴϴ�!)f�� �ϰ�, mode�� true�� �ؼ� �ʼ�����
		 * dialog�� �Ѵ�. �̷��� �Ǹ� dialogâ�� �ݿ��� frame�� ����� �� �ְ� �ȴ�.
		 * ������ false�� �����ϸ� dialog�� ������� frame�� ������ �� �ִ�.
		 */

		
		Dialog info= new Dialog(f,"infomation",true);//��޷μ���
		info.setSize(150,100);
		
		//parent frame�� �ƴ�, ȭ���� ��ġ�� ������ �ȴ�. ������ dialog����
		//�������� �����̳��̱� ����
		info.setLocation(550,50);
		
		//Dialog�� ���̾ƿ��Ŵ����� ���� �⺻���� BoderLayout�̶� �Ʒ��� ����
		//FlowLayout���� �ٲپ���.
		info.setLayout(new FlowLayout());
		//Dialog�� �����̳ʱ� ������ ������Ʈ�� �Ʒ��� ���� ������ �� �ִ�.
		
		Label msg=new Label("�� ���� �����",Label.CENTER);  //���� �߾�����
		Button ok=new Button("ok");
		info.add(msg);
		info.add(ok);
		//������ ��·�� ó���� ���� �ʾұ� ������ ok��ư�� ������ �ƹ��� ���� �Ͼ�� ����
		
		f.setVisible(true);
		info.setVisible(true); //Dialog�� ȭ�鿡 ���̰� �Ѵ�.
	}

}
