package sec02.exam01_system_in_out;

import java.io.OutputStream;

public class SystemOutExample {

	public static void main(String[] args) throws Exception {
		// PrintStream(System.out)�� OutputStream�� �ڼ�Ŭ�����̹Ƿ�
		// ������ �����ϴ�.
		OutputStream os = System.out;
		// �ƽ�Ű�ڵ�ǥ�� �����غ����� ����.
		for (byte b = 48; b < 58; b++) {
			System.out.println("�ƽ�Ű�ڵ� write()ȣ ��µ� ���ڰ�:");
			os.write(b);
			System.out.println();
		}

		os.write(13); // �ٹٲ��� ���ؼ� �ƽ�Ű�ڵ尪�� write�ߴ�.
		for (byte b = 97; b < 123; b++) {
			System.out.print("�ƽ�Ű�ڵ� write()ȣ ��µ� ���ڰ�:");
			os.write(b);
			System.out.println();
		}
		os.write(13);
		String hangul = "���� ���������б� �ٴϴ� �л��̴�.";
		// String ���� ����Ʈ�迭�� �޴´�.
		byte[] hangulBytes = hangul.getBytes();
		os.write(hangulBytes);
		os.flush(); // ���۰�������
		os.close(); // �ڿ�����
	}

}
