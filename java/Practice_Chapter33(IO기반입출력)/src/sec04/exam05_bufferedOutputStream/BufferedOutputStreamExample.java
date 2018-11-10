package sec04.exam05_bufferedOutputStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedOutputStreamExample {

	public static void main(String[] args) throws Exception{
		
		
		FileInputStream fis=null;
		FileOutputStream fos=null;
		BufferedInputStream bis=null;
		BufferedOutputStream bos=null;
		
		int data=0;
		long start=0;
		long end=0;
		
		//���Է½�Ʈ���� FileInputStream ���� ������ bufferedInputStream������Ʈ���� �����Ͽ���.
		fis=new FileInputStream("D:\\\\eclipse\\\\Practice_Chapter33(IO��������)\\\\src\\\\sec03\\\\exam03_file_Output_stream\\\\KakaoTalk_20180823_105218126.jpg");
		//fis=new FileInputStream("");
		bis=new BufferedInputStream(fis);
		fos=new FileOutputStream("D:\\\\eclipse\\\\Practice_Chapter33(IO��������)\\\\src\\\\sec03\\\\exam03_file_Output_stream\\\\KakaoTalk_20180823_105218126.jpg");
		//fos=new FileOutputStream("");
		
		start=System.currentTimeMillis(); //�о���� �� �ð� ����
		
		while((data=bis.read())!=-1){
			fos.write(data);
		}
		
		fos.flush();
		end=System.currentTimeMillis(); //�о�� �� �ð� ����
		
		//�ڿ�����
		fos.close();
		bis.close();
		fis.close();
		System.out.println("BufferedOutputStream ������� �ʾ��� �� :"+(end-start)+"ms");
		System.out.println();
		
		fis=new FileInputStream("D:\\\\eclipse\\\\Practice_Chapter33(IO��������)\\\\src\\\\sec03\\\\exam03_file_Output_stream\\\\KakaoTalk_20180823_105218126.jpg");
		//fis=new FileInputStream("");
		bis=new BufferedInputStream(fis);
		fos=new FileOutputStream("D:\\\\eclipse\\\\Practice_Chapter33(IO��������)\\\\src\\\\sec03\\\\exam03_file_Output_stream\\\\KakaoTalk_20180823_105218126.jpg");
		//fos=new FileOutputStream("");
		bos=new BufferedOutputStream(fos);
		start=System.currentTimeMillis();
		
		while((data=bis.read())!=-1){
			fos.write(data);
		}
		fos.flush();
		end=System.currentTimeMillis(); //�о�� �� �ð� ����
		
		//�ڿ�����
		fos.close();
		bis.close();
		fis.close();
		
	}

}
