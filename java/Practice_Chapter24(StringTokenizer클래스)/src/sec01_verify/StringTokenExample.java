package sec01_verify;

import java.util.StringTokenizer;

public class StringTokenExample {

	public static void main(String[] args) {
		
		
		StringTokenizer st = new StringTokenizer("ȫ�浿/��ȭ/ȫ��/����/����", "/"); 
		while(st.hasMoreTokens()) {
	         String str = st.nextToken();
	         System.out.println(str);
	    }

  }
}
