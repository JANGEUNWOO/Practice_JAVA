package sec02.exam01_system_in_out;

import java.io.InputStream;

public class SystemInExample01 {

	public static void main(String[] args) throws Exception {

		System.out.println("==�޴�==");
		System.out.println("1.���� ��ȸ");
		System.out.println("2.���� ���");
		System.out.println("3.���� �Ա�");
		System.out.println("4.���� �ϱ�");
		System.out.println("�޴��� �����ϼ���:");

		// �⺸��κ��� �Է��� �ޱ� ���� System.in �ʵ带 InputStream�� �����Ѵ�.
		InputStream is = System.in;

		// �ѹ���Ʈ�� �д´� �ٽ� ������ڸ� int���� ������ 1����Ʈ�� �޴� ���̴�.
		int inputint = is.read();
		System.out.println("Ű����κ��� �Է��� �ƽ�Ű�ڵ�:" + inputint);

		char inputChar = (char) inputint; // �ƽ�Ű�ڵ带 ����Ÿ������ �������� ���� Ÿ�� ��ȯ

		// ����� ��Ŭ������ �ְܼ� ���������Ʈ���� ������ �غ���
		// �׺�������� bin������ ��θ� �Ӽ����� ������
		// ��Ű���� ���ϸ��� �Է��ϵ��� ����

		switch (inputChar) {
		case '1':
			System.out.println("���� ��ȸ�� ������");
			break;
		case '2':
			System.out.println("���� ����� ������");
			break;
		case '3':
			System.out.println("���� �Ա��� ������");
			break;
		case '4':
			System.out.println("���� �ϱ⸦ ����");
			break;
		}

	}

}
