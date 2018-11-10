package sec01.exam02_outputstream_write;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class WriteExample01 {

	public static void main(String[] args) throws Exception {
		
		OutputStream os=new FileOutputStream("C:/test.txt"); //일반예외 발생
		
		byte[] data="abc".getBytes(); //ABC라는 문자열에서 바이트 ㅂ열을 얻어낸다(인코딩)
		
		System.out.println(Arrays.toString(data));
		
		//3번 루핑
		for(int i=0;i<data.length;i++) {
			os.write(data[i]);
			
			os.flush();
			os.close();
		}
		
	}

}
