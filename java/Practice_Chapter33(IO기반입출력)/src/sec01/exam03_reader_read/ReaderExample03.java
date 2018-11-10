package sec01.exam03_reader_read;

import java.io.FileReader;
import java.io.Reader;

public class ReaderExample03 {

	public static void main(String[] args) throws Exception {

		Reader reader = new FileReader("c:/test.txt");
		char[] cbuf = new char[4]; // ���̰� 4�̴�.

		// c:/test.txt������ 1�ε��� ��ġ���� 2���ڸ� ��� ������
		int readData = reader.read(cbuf, 1, 2);

		System.out.println("���� ���� ��:" + readData);
		// ��°���� 0�ε����� �׳� ������ ������ 2,3�ε����� �ִ� �͸�
		// �д� ���� �˼��� �ִ�.

		for (int i = 0; i < cbuf.length; i++) {
			System.out.println(i + "��° ����:" + cbuf[i]);
		}

		reader.close();

	}

}
