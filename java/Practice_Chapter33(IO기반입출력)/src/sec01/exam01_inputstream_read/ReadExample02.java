package sec01.exam01_inputstream_read;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample02 {

	public static void main(String[] args) throws Exception {

		InputStream is = new FileInputStream("C:/test.txt");
		int readByteNo;

		byte[] readBytes = new byte[8];

		readByteNo = is.read(readBytes, 2, 3);
		System.out.println("���� ����Ʈ ��:" + readByteNo);
		System.out.println();

		for (Byte b : readBytes) {
			System.out.println("���� ����Ʈ:" + b);
		}
		is.close();

		// InputStream�� read(byte[] b)�޼���� ������ ���̻� ���ٸ�,
		// EOF(End of file) == -1���� ������

		/*
		 * while((readByteNo=is.read(readBytes))!=-1) { //���� ����Ʈ �� ����
		 * System.out.println("���� ����Ʈ�� ��:"+readByteNo); //���ڿ��� ���ڵ��� String str=new
		 * String(readBytes,0,readByteNo); //�Ʒ��� ���� �ϸ�, 5����Ʈ �����̹Ƿ� 2��° �����Ҷ� ������ //�����ʹ�
		 * ���⶧���� ���������Ͱ� ��µȴ�.) //String str=new String(readBytes);
		 * System.out.println("���� ���ڿ�:"+str); //���ڿ� ��� //System.out.print(str); //���ڿ� ���
		 * i++;
		 * 
		 * 
		 * System.out.println("���μ�:"+i);
		 */
		// �Ʒ��� ���� �ۼ��ص� �ȴ�. ������� �Ͻø� �˴ϴ�.
		/*
		 * while(true){ readByte=is.read(); if(readByte==-1) //�о��ٸ� -1�� �������� ���� ���̴�.
		 * break; System.out.println("���� ����Ʈ:"+readByte); //�ƽ�Ű�ڵ尪 ���
		 * 
		 */

	}

}
