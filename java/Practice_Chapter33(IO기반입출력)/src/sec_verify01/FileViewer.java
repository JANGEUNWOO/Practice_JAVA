package sec_verify01;

import java.io.FileReader;
import java.io.Reader;

public class FileViewer {

	public static void main(String[] args) throws Exception {

		// Reader의 하위클래스인 FileReader를 생성하여 대입.
		Reader reader = new FileReader("c:/Tests.txt");
		int readData;
		char[] cbuf = new char[2]; // 길이가 2이다.
		String data = "";

		// 아래와 같이 StringBuilder클래스를 사용해도 된다.
		// StringBuilder sb=new StringBuilder();

		// read()의 매개타입이 문자 배열이다.
		while ((readData = reader.read(cbuf)) != -1) {
			// sb.append(cbuf);
			data += new String(cbuf, 0, readData); // 읽은 문자를 문자열로 생성
			//System.out.println("읽은 문자 수: " + readData);// 유니코드 출력
		}

		System.out.println(data); // 문자열 출력
		// System.out.println(sb); //문자열 출력
		reader.close();

	}

}
