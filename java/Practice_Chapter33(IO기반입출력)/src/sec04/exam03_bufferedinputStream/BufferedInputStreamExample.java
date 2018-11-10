package sec04.exam03_bufferedinputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamExample {

	public static void main(String[] args) throws Exception {
		long start=0;
		long end=0;
		
		//����Ʈ ������� �ӵ��� ���̸� ���� ���� ���α׷��̴�.
		//(������ pc������ 233������ ���̰� ����. ���� pc�� ��翡 ���� ���̴� ������ ��)
		FileInputStream fis1=new FileInputStream("D:\\eclipse\\Practice_Chapter33(IO��������)\\src\\sec03\\exam03_file_Output_stream\\KakaoTalk_20180823_105218126.jpg");
		
		System.out.println("����Ʈ ��� �б� ����");
		start=System.currentTimeMillis(); //�б��� �ð� ����
		//�׳� �б⸸ �Ѵ�.
		while(fis1.read()!=-1) {
			
		}
		
		System.out.println("����Ʈ ��� �б� ��");
		end=System.currentTimeMillis(); //�� ������ ����
		System.out.println("���۸� ������� �ʾ����� (����Ʈ ���):"+(end-start)+"ms");
		fis1.close();
		
		System.out.println();
		//���Է� ��Ʈ�� FileInputStream���ٰ� �ӵ���� ������Ʈ���� BufferedInputStream�� ������
		//Ȥ �߸� �����Ҽ��� �ִµ� BufferedInputStream�� ������Ʈ���̱� ������ ������
		// �о�ü��� ����.
		
		FileInputStream fis2=new FileInputStream("D:\\eclipse\\Practice_Chapter33(IO��������)\\src\\sec03\\exam03_file_Output_stream\\KakaoTalk_20180823_105218126.jpg");
		BufferedInputStream bis=new BufferedInputStream(fis2);
		
		System.out.println("���� ��� �б� ����");
		start=System.currentTimeMillis();
		
		while(bis.read()!=-1) {
			
		}
		System.out.println("���� ��� �б� ��");
		end=System.currentTimeMillis(); //�� ������ ����
		System.out.println("���۸� ������� �ʾ����� (���� ���):"+(end-start)+"ms");
		fis2.close();

	}

}
