package sec03.exam03_file_Output_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamExample {

	public static void main(String[] args) throws Exception {

		String originalFileName = "D:\\eclipse\\Practice_Chapter33(IO기반입출력)\\src\\sec03\\exam02_file_input_stream\\KakaoTalk_20180823_105218126.jpg";
		String targetFileName = "C:/Temp/김연아.jpg";

		File file = new File(
				"D:\\eclipse\\Practice_Chapter33(IO기반입출력)\\src\\sec03\\exam02_file_input_stream\\KakaoTalk_20180823_105218126.jpg");

		// FileInputStream.FileOutputStream을 얻어서 경로를 준다.
		// 복사는 동영상, 문자파일, 그림파일, 음악파일 등 다 바이트 기반으로 되어있기 때문에 가능하다.
		// 하지만, Reader와 writer는 문자파일만 가능하게끔 특화되어 있다.
		FileInputStream fis = new FileInputStream(originalFileName);
		FileOutputStream fos = new FileOutputStream(targetFileName);

		int readByteNo;
		int i = 0;

		// 바이트배열을 크게잡을수록 복사시간이 빨라진다.
		// Byte[] readBytes=new byte[100];
		byte[] readBytes = new byte[100];
		long currentTime = System.currentTimeMillis(); // 현재 시점을 저장한다.

		// 100바이트만큼 읽고 루핑한다.
		while ((readByteNo = fis.read(readBytes)) != -1) {
			fos.write(readBytes, 0, readByteNo); // 읽은 바이트 수만큼 출력스트림으로 보낸다.
			i++;
		}
		fos.flush(); // 강제로 버퍼 비운다.

		long endTime = System.currentTimeMillis(); // 복사한후 시점을 저장한다.
		System.out.println("루핑수:" + i + "복사시간:" + (endTime - currentTime) + "ms" + "\t복사한 파일의 크기:"
				+ file.length() / 1024 + "kbyte");

		fos.close(); // 자원해제
		fis.close(); // 자원해제
		System.out.println(file.getName() + "파일의 복사가 완료됨");
	}

}
