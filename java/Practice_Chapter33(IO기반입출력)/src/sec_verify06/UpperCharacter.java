package sec_verify06;

import java.io.FileReader;

public class UpperCharacter {

	public static void main(String[] args) throws Exception {
		FileReader fr=new FileReader("D:\\eclipse\\Practice_Chapter33(IO기반입출력)\\src\\sec_verify06\\sample.txt");
		 int readCharNo;
	        
	        char[] cbuf=new char[100];
	        int i=0;
	     
	        while((readCharNo=fr.read(cbuf))!=-1) {
	        	String data=new String(cbuf,0,readCharNo);
	        	System.out.print(data.toUpperCase());
	        	
	        }
	        //System.out.write(13);
	        fr.close();
		
	}

}
