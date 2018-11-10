package sec03.exam02_file_input_stream;

import java.io.FileInputStream;

public class FileInputStreamExample {

	public static void main(String[] args) {
		try {
			// FileInputStream fis=new FileInputStream("0:\\java작업\\Practice_C
			// \는 이스케리프 문자기 때문에 아래와 같이/로 바꾼다.
			// 현재 소스코드를 콘솔에 출력해보는 프로그램이다.

			FileInputStream fis = new FileInputStream(
					"D:\\eclipse\\Practice_Chapter31(멀티스레드)\\src\\sec_verify01\\MovieThread.java");

			int data;
			int i = 0;
			// 한 바이트씩 읽는다.
			while ((data = fis.read()) != -1) {
				// 콘솔 출력(원래 System.out.println()을 해야 한다.
				// 어차피 출력스트림이므로 write()써도 무방
				System.out.write(data);

				// 콘솔 출력 System.out.println()사용, 한글은 2바이트이기 떄문에
				// 깨진다. 그렇기 때문에 바이트배열로 하는 것이 현명
				// System.out.println((char)data);
				i++;
			}
			System.out.println("루핑 수:" + i);
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

}
