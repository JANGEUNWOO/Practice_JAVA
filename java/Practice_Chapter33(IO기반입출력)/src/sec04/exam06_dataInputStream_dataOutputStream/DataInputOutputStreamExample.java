package sec04.exam06_dataInputStream_dataOutputStream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInputOutputStreamExample {

	public static void main(String[] args) throws Exception {
		// �⺻Ÿ���� �����Ͱ� ����Ǳ� ������, .txt�� �������� �ʰ�,
		// .datȮ���ڸ� ����Ͽ� FileOutputStream�� �����Ͽ���.
		FileOutputStream fos = new FileOutputStream("C:/primitive-type_save.dat");

		// File�� ũ�⸦ �˾ƺ��� ���ؼ� �����޴�.
		File file = new File("C:/primitive-type_save.dat");

		// �׸��� �⺻Ÿ���� ����ϱ� ���� ������Ʈ������ DataOutputStream�� �����Ͽ���.
		DataOutputStream dos = new DataOutputStream(fos);

		// ������ ó���� �⺻������ 0����Ʈ�� �����Ѵ�.
		System.out.println("����ũ�� : " + file.length());
		// String�� ���Ͽ� �����ϱ� ���ؼ��� writeUTF�� ����Ѵ�.
		dos.writeUTF("������");
		// ������, �����ϸ鼭 ������ �⺻�� ���Ͻý����� ũ�Ⱑ 2KByte�� �����ϴ� ���� �˼��ִ�.
		System.out.println("����ũ�� : " + file.length());

		dos.writeDouble(100.4); // doubleŸ�� ����
		// System.out.println("����ũ�� : " + file.length());
		dos.writeInt(10); // int Ÿ�� ����
		System.out.println("���� ũ�� : " + file.length());

		dos.writeUTF("�迬��"); // String����
		dos.writeDouble(96.3); // doubleŸ�� ����
		dos.writeInt(27); // intŸ�� ����
		System.out.println("���� ũ��(byte) : " + file.length()); // 46����Ʈ�� ����Ǿ���.

		// �ڿ�����
		dos.flush();
		dos.close();
		fos.close();
		System.out.println();

		// ������ ������ ������ �б� ���� �Ʒ��� ���� FileInputStream�� DataInputStream�� �����ߴ�
		FileInputStream fis = new FileInputStream("C:/primitive-type_save.dat");
		DataInputStream dis = new DataInputStream(fis);
		// �������� �����Ҷ��� ������ �Ȱ��� �о�;� �Ѵ�.
		for (int i = 0; i < 2; i++) {
			String name = dis.readUTF(); // String�б�
			double score = dis.readDouble(); // double�б�
			int order = dis.readInt();
			System.out.println("���� ���ڿ� : " + name);
			System.out.println("���� double�� : " + score);
			System.out.println("���� int�� : " + order);
			System.out.println();
		}
		System.out.println("���� ũ��(byte) : " + file.length()); // 46����Ʈ�� ��������.
		// �ڿ�����
		dis.close();
		fis.close();

	}
}
