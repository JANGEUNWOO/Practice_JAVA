package sec01.exam04_writer_write;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample04 {

	public static void main(String[] args) throws Exception {

		Writer writer = new FileWriter("c:/test.txt"); // �������� ����� �ڵ�
		String str = "�ȳ� �ڹ� ���α׷�!";

		// �Ű������� StringŸ�����̴�. �Ͽ� STring�� ���Ͽ� �״�� �����ϰ� �ȴ�.
		writer.write(str);

		// �����ε����� 3, ���ڼ��� 2���� �����
		// writer.write(str,3,2);

		writer.flush();
		writer.close();

	}

}
