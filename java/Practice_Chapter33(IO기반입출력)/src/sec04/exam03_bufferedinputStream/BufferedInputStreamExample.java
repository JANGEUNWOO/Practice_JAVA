package sec04.exam03_bufferedinputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamExample {

	public static void main(String[] args) throws Exception {
		long start=0;
		long end=0;
		
		//바이트 기반으로 속도의 차이를 보기 위한 프로그램이다.
		//(선생님 pc에서는 233배정도 차이가 난다. 역시 pc의 사양에 따라 차이는 존재할 것)
		FileInputStream fis1=new FileInputStream("D:\\eclipse\\Practice_Chapter33(IO기반입출력)\\src\\sec03\\exam03_file_Output_stream\\KakaoTalk_20180823_105218126.jpg");
		
		System.out.println("바이트 기반 읽기 시작");
		start=System.currentTimeMillis(); //읽기전 시간 저장
		//그냥 읽기만 한다.
		while(fis1.read()!=-1) {
			
		}
		
		System.out.println("바이트 기반 읽기 끝");
		end=System.currentTimeMillis(); //다 읽은후 저장
		System.out.println("버퍼를 사용하지 않았을때 (바이트 기반):"+(end-start)+"ms");
		fis1.close();
		
		System.out.println();
		//주입력 스트림 FileInputStream에다가 속도향상 보조스트리밍 BufferedInputStream을 연결함
		//혹 잘못 이해할수도 있는데 BufferedInputStream은 보조스트림이기 때문에 파일을
		// 읽어올수가 없다.
		
		FileInputStream fis2=new FileInputStream("D:\\eclipse\\Practice_Chapter33(IO기반입출력)\\src\\sec03\\exam03_file_Output_stream\\KakaoTalk_20180823_105218126.jpg");
		BufferedInputStream bis=new BufferedInputStream(fis2);
		
		System.out.println("버퍼 기반 읽기 시작");
		start=System.currentTimeMillis();
		
		while(bis.read()!=-1) {
			
		}
		System.out.println("버퍼 기반 읽기 끝");
		end=System.currentTimeMillis(); //다 읽은후 저장
		System.out.println("버퍼를 사용하지 않았을때 (버퍼 기반):"+(end-start)+"ms");
		fis2.close();

	}

}
