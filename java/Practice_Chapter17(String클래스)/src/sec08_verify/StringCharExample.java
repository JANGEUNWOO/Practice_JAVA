package sec08_verify;

import java.util.Scanner;

public class StringCharExample {

	public static void main(String[] args) {
		
		//즐거운 Java Programming 1234 입력
	    //변환된 문자열 ==> 즐거운 jAVA pROGRMMING 1234 
		Scanner sc=new Scanner(System.in);
		System.out.println("문자열을 대문자는 소문자로 소문자는 대문자로 변경합니다.");
        System.out.print("문자열을 입력하세요 :");
        String input=sc.nextLine();
        
        for(int i = 0; i < input.length(); i++){
        	String a;
        	if(input.charAt(i) >= 'a' && input.charAt(i) <= 'z'){   // 소문자일 경우
        	a = Character.toString(input.charAt(i));
        	a = a.toUpperCase();
        	System.out.print(a);
        	}
        	else{                                               // 대문자일 경우
        	a = Character.toString(input.charAt(i));
        	a = a.toLowerCase();
        	System.out.print(a);
        	}
        }
   }

}
