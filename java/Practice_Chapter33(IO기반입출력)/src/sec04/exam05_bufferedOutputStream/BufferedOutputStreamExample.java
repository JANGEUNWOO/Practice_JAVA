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
		
		//주입력스트림은 FileInputStream 으로 설정후 bufferedInputStream보조스트림을 연결하였다.
		fis=new FileInputStream("D:\\\\eclipse\\\\Practice_Chapter33(IO기반입출력)\\\\src\\\\sec03\\\\exam03_file_Output_stream\\\\KakaoTalk_20180823_105218126.jpg");
		//fis=new FileInputStream("");
		bis=new BufferedInputStream(fis);
		fos=new FileOutputStream("D:\\\\eclipse\\\\Practice_Chapter33(IO기반입출력)\\\\src\\\\sec03\\\\exam03_file_Output_stream\\\\KakaoTalk_20180823_105218126.jpg");
		//fos=new FileOutputStream("");
		
		start=System.currentTimeMillis(); //읽어오기 전 시간 저장
		
		while((data=bis.read())!=-1){
			fos.write(data);
		}
		
		fos.flush();
		end=System.currentTimeMillis(); //읽어온 후 시간 저장
		
		//자원해제
		fos.close();
		bis.close();
		fis.close();
		System.out.println("BufferedOutputStream 사용하지 않았을 때 :"+(end-start)+"ms");
		System.out.println();
		
		fis=new FileInputStream("D:\\\\eclipse\\\\Practice_Chapter33(IO기반입출력)\\\\src\\\\sec03\\\\exam03_file_Output_stream\\\\KakaoTalk_20180823_105218126.jpg");
		//fis=new FileInputStream("");
		bis=new BufferedInputStream(fis);
		fos=new FileOutputStream("D:\\\\eclipse\\\\Practice_Chapter33(IO기반입출력)\\\\src\\\\sec03\\\\exam03_file_Output_stream\\\\KakaoTalk_20180823_105218126.jpg");
		//fos=new FileOutputStream("");
		bos=new BufferedOutputStream(fos);
		start=System.currentTimeMillis();
		
		while((data=bis.read())!=-1){
			fos.write(data);
		}
		fos.flush();
		end=System.currentTimeMillis(); //읽어온 후 시간 저장
		
		//자원해제
		fos.close();
		bis.close();
		fis.close();
		
	}

}
