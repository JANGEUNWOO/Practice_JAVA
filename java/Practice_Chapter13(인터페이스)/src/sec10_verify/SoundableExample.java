package sec10_verify;

import java.util.Scanner;

public class SoundableExample {

	public static void main(String[] args) {
		
		
		Soundable soundable=new Soundable() {
            Scanner scanner=new Scanner(System.in);
            String input=scanner.nextLine();
			   
            @Override
			public void sound() {
            	System.out.println("첫번째 익명구현객체:"+input);
				System.out.println(input+"에 물을 담습니다.");
			}
		    
		};    
            
		Soundable soundable2=new Soundable() {
			Scanner scanner=new Scanner(System.in);
            String input2=scanner.nextLine();
			
            @Override
            public void sound() {
				System.out.println("두번째 익명구현객체:"+input2);
				System.out.println(input2+"에 물을 담습니다.");
			}
		

	    };
	   
	  soundable.sound();
	  soundable2.sound();
	

   }
}
