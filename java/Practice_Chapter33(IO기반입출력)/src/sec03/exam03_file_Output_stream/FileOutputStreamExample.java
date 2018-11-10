package sec03.exam03_file_Output_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamExample {

	public static void main(String[] args) throws Exception {

		String originalFileName = "D:\\eclipse\\Practice_Chapter33(IO��������)\\src\\sec03\\exam02_file_input_stream\\KakaoTalk_20180823_105218126.jpg";
		String targetFileName = "C:/Temp/�迬��.jpg";

		File file = new File(
				"D:\\eclipse\\Practice_Chapter33(IO��������)\\src\\sec03\\exam02_file_input_stream\\KakaoTalk_20180823_105218126.jpg");

		// FileInputStream.FileOutputStream�� �� ��θ� �ش�.
		// ����� ������, ��������, �׸�����, �������� �� �� ����Ʈ ������� �Ǿ��ֱ� ������ �����ϴ�.
		// ������, Reader�� writer�� �������ϸ� �����ϰԲ� Ưȭ�Ǿ� �ִ�.
		FileInputStream fis = new FileInputStream(originalFileName);
		FileOutputStream fos = new FileOutputStream(targetFileName);

		int readByteNo;
		int i = 0;

		// ����Ʈ�迭�� ũ���������� ����ð��� ��������.
		// Byte[] readBytes=new byte[100];
		byte[] readBytes = new byte[100];
		long currentTime = System.currentTimeMillis(); // ���� ������ �����Ѵ�.

		// 100����Ʈ��ŭ �а� �����Ѵ�.
		while ((readByteNo = fis.read(readBytes)) != -1) {
			fos.write(readBytes, 0, readByteNo); // ���� ����Ʈ ����ŭ ��½�Ʈ������ ������.
			i++;
		}
		fos.flush(); // ������ ���� ����.

		long endTime = System.currentTimeMillis(); // �������� ������ �����Ѵ�.
		System.out.println("���μ�:" + i + "����ð�:" + (endTime - currentTime) + "ms" + "\t������ ������ ũ��:"
				+ file.length() / 1024 + "kbyte");

		fos.close(); // �ڿ�����
		fis.close(); // �ڿ�����
		System.out.println(file.getName() + "������ ���簡 �Ϸ��");
	}

}
