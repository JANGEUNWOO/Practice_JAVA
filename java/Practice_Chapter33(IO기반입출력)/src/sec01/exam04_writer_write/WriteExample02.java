package sec01.exam04_writer_write;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample02 {

	public static void main(String[] args) throws Exception {
		
		
		Writer writer = new FileWriter("C:/test.txt");
		char[] data = "홍길동".toCharArray(); // 문자열을 문자배열로 리턴
		
		//write()의 매개변수 타입이 문자배열이다. 호출하고 예오가 바생지 않았다면
		//정상적으로 실행이 된것이다.
		//이전, 코드보다 문바배열 자체를 매개값으로 보내기 떄문에, 훨씬 효율적임..
		
		writer.write(data);
		
		writer.flush(); // 강제로 비우기
		writer.close(); // 자원 해제

	}

}
