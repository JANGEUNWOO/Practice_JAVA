package sec01.exam02_outputstream_write;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample03 {

	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("C:/test.txt"); // �Ϲݿ��� �߻�

		byte[] data = "abc������".getBytes(); // ABC��� ���ڿ����� ����Ʈ ������ ����(���ڵ�)

		//byte[] data="abc".getBytes();

		// ����Ʈ�迭�� �ѹ��� ��Ʈ������ ������. ������ �����ε����� 1�̰� ���̸� 2��ŭ�� ������.
		System.out.println("data����Ʈ�迭�� ũ��:" + data.length);
		os.write(data);
		os.flush();
		os.close();

	}

}
