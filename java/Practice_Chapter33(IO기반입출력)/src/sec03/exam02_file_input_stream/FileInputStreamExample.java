package sec03.exam02_file_input_stream;

import java.io.FileInputStream;

public class FileInputStreamExample {

	public static void main(String[] args) {
		try {
			// FileInputStream fis=new FileInputStream("0:\\java�۾�\\Practice_C
			// \�� �̽��ɸ��� ���ڱ� ������ �Ʒ��� ����/�� �ٲ۴�.
			// ���� �ҽ��ڵ带 �ֿܼ� ����غ��� ���α׷��̴�.

			FileInputStream fis = new FileInputStream(
					"D:\\eclipse\\Practice_Chapter31(��Ƽ������)\\src\\sec_verify01\\MovieThread.java");

			int data;
			int i = 0;
			// �� ����Ʈ�� �д´�.
			while ((data = fis.read()) != -1) {
				// �ܼ� ���(���� System.out.println()�� �ؾ� �Ѵ�.
				// ������ ��½�Ʈ���̹Ƿ� write()�ᵵ ����
				System.out.write(data);

				// �ܼ� ��� System.out.println()���, �ѱ��� 2����Ʈ�̱� ������
				// ������. �׷��� ������ ����Ʈ�迭�� �ϴ� ���� ����
				// System.out.println((char)data);
				i++;
			}
			System.out.println("���� ��:" + i);
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

}
