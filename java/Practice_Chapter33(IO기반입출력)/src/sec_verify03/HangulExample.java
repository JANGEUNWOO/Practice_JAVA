package sec_verify03;

import java.io.FileReader;
import java.io.Reader;

public class HangulExample {

	public static void main(String[] args) throws Exception {

		
		Reader reader = new FileReader("c:/test1.txt");
		int readData;
		char[] cbuf = new char[2]; 
		String data = "";

		
		while ((readData = reader.read(cbuf)) != -1) {
			
			data += new String(cbuf, 0, readData); 
		}

		System.out.println(data); 
		
		reader.close();
	}

}
