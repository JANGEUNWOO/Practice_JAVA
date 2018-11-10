package sec02.exam01_system_in_out;

import java.io.InputStream;

public class SystemInExample02 {

	public static void main(String[] args) throws Exception {
		// Ű����κ��� �Է��� �ޱ� ���� System.in�ʵ带 InputStream�� �����Ѵ�.
		InputStream is = System.in;
		byte[] dates = new byte[100];
		System.out.print("�̸�:");
		// Ű����� �Է��� �����͸� dates�� ����Ʈ�迭�� �����ϰ� ����
		// ����Ʈ ���� �����Ѵ�
		int nameBytes = is.read(dates);

		// ����Ű(ĳ��������(13)+�����ǵ�(10)�� ������ �������� ���ڿ��� �����
		String name = new String(dates, 0, nameBytes - 2);
		System.out.print("�ϰ� ���� ��:");
		int commentBytes = is.read(dates);
		// -2�� �ϴ� ������?
		String comment = new String(dates, 0, commentBytes - 2);
		System.out.println("�Է��� �̸�:" + name);
		System.out.println("�Է��� �ϰ� ���� ��:" + comment);

	}

}
