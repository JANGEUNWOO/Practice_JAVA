package sec_verify02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.util.Arrays;

public class FileCopy {

	public static void main(String[] args) throws Exception {

		InputStream is = new FileInputStream("c:/Tests.txt");

		byte[] readBytes = new byte[30];

		while ((is.read(readBytes)) != -1) {

			String str = new String(readBytes, "UTF-8");
			System.out.println(str);

		}
		is.close();

		OutputStream os = new FileOutputStream("c:/Tests_test.txt"); // �Ϲݿ��� �߻�

		byte[] data1 = Arrays.toString(readBytes).getBytes();
		// ABC��� ���ڿ����� ����Ʈ ����������(���ڵ�)
		System.out.println("�ؽ�Ʈ ���纻�� �����Ǿ����ϴ�.");
		os.write(data1);
		os.flush();
		os.close();

		InputStream iss = new FileInputStream("c:/Tests.txt");

		byte[] readBytess = new byte[30];

		while ((iss.read(readBytess)) != -1) {

			String strr = new String(readBytess, "UTF-8");
			System.out.println(strr);

		}
		iss.close();

		Reader reader = new FileReader("c:/Tests_test.txt");
		int readData;
		char[] cbuf = new char[30];
		String data = "";

		while ((readData = reader.read(cbuf)) != -1) {

			data += new String(cbuf, 0, readData);
		}

		System.out.println(data);
		reader.close();

	}

}
