package sec01.exam07_textfield;

	import java.awt.FlowLayout;
	import java.awt.Frame;
	import java.awt.Label;
	import java.awt.TextField;
public class TextfieldExample {
	
	 public static void main(String[] args) {
	      
	      Frame f = new Frame("login");
	      f.setSize(400, 130);
	      f.setLayout(new FlowLayout(FlowLayout.LEFT));
	      
	      Label lid = new Label("���̵�:", Label.RIGHT); //������ ����������
	      Label lpwd = new Label("��й�ȣ:", Label.RIGHT);
	      
	      //�� 10���� ���ڸ� �Է��� �� �ִ� �ؽ�Ʈ �ʵ� ����
	      TextField id = new TextField(10);
	      TextField pwd = new TextField(10);
	      //�Է��� �� ��� * �� ���̵��� �Ѵ�. (���ڹ��� ����) ��й�ȣ ������ ���
	      pwd.setEchoChar('*');
	      //pwd.setEchoChar('-');
	      char ch = pwd.getEchoChar();
	      System.out.println("������ ���ڹ��� :" +ch);
	      
	      //������ ������Ʈ���� frame��  ���Խ�Ų��.
	      f.add(lid); f.add(id); f.add(lpwd); f.add(pwd);
	      f.setVisible(true);
	      

	}
}