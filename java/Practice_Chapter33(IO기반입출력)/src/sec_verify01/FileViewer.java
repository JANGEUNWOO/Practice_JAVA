package sec_verify01;

import java.io.FileReader;
import java.io.Reader;

public class FileViewer {

	public static void main(String[] args) throws Exception {

		// Reader�� ����Ŭ������ FileReader�� �����Ͽ� ����.
		Reader reader = new FileReader("c:/Tests.txt");
		int readData;
		char[] cbuf = new char[2]; // ���̰� 2�̴�.
		String data = "";

		// �Ʒ��� ���� StringBuilderŬ������ ����ص� �ȴ�.
		// StringBuilder sb=new StringBuilder();

		// read()�� �Ű�Ÿ���� ���� �迭�̴�.
		while ((readData = reader.read(cbuf)) != -1) {
			// sb.append(cbuf);
			data += new String(cbuf, 0, readData); // ���� ���ڸ� ���ڿ��� ����
			//System.out.println("���� ���� ��: " + readData);// �����ڵ� ���
		}

		System.out.println(data); // ���ڿ� ���
		// System.out.println(sb); //���ڿ� ���
		reader.close();

	}

}
