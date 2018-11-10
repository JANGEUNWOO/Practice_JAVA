package sec01.exam02_outputstream_write;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample03 {

	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("C:/test.txt"); // 일반예외 발생

		byte[] data = "abc가나다".getBytes(); // ABC라는 문자열에서 바이트 ㅂ열을 얻어낸다(인코딩)

		//byte[] data="abc".getBytes();

		// 바이트배열을 한번에 스트림으로 보낸다. 하지만 시작인덱스가 1이고 길이를 2만큼만 보낸다.
		System.out.println("data바이트배열의 크기:" + data.length);
		os.write(data);
		os.flush();
		os.close();

	}

}
