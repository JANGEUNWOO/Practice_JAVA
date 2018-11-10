package sec04.exam02_outputstreamwriter;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class OutputStreamWriterExample {

	public static void main(String[] args) throws Exception {
		// �������Ͽ� �����ϴ� FileOutputStream�� ���������� ����Ʈ����̴�. �׷����Ʒ��� ����
		// ���ڿ� ����Ʈ�� ��ȯ�ϴ� INputStreamWriter�� ������Ʈ������ �������ָ� �ȴ�.
		FileOutputStream fos = new FileOutputStream("C:/test.txt");
		Writer writer = new OutputStreamWriter(fos); // ������Ʈ�� �����Ѵ�.

		String data = "���ڵ����͸� ������½�ƺ���� ������ ����Ʈ������� ��ȯ�Ⱦ� �����.";
		writer.write(data); // ������Ʈ�� �� ���ڱ�ݽ�Ʈ���� OutputStreamWriter�� data��
		// ������ ����Ʈ ������� ��ȯ������

		writer.flush(); // ���� ���� ����
		writer.close(); // �ڿ� ����
		fos.close();
		System.out.println("���� ������ �������ϴ�.");

	}

}
