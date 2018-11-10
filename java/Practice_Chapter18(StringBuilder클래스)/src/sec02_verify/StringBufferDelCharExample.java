package sec02_verify;

public class StringBufferDelCharExample {
	
	static String delChar(String src, String delCh) {
		StringBuffer sb= new StringBuffer(src.length());
		for(int i=0;i<src.length();i++) {
			char cr=src.charAt(i);
			
	      if(delCh.indexOf(cr)==-1)
	    	  sb.append(cr);
	      
	    	
		}
		  return sb.toString();
	}

	public static void main(String[] args) {
		
		
		System.out.println("(나는!자바를@사랑^^합니다.)"+" -> " + delChar("(나는! 자바를@ 사랑^^합니다.)","(!@^)"));
		System.out.println("(1 2 3 4\t5)"+" -> " + delChar("(1 2 3 4\t5)"," \t"));
    
	}
}
