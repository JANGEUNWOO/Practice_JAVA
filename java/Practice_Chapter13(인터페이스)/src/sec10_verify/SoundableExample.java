package sec10_verify;

import java.util.Scanner;

public class SoundableExample {

	public static void main(String[] args) {
		
		
		Soundable soundable=new Soundable() {
            Scanner scanner=new Scanner(System.in);
            String input=scanner.nextLine();
			   
            @Override
			public void sound() {
            	System.out.println("ù��° �͸�����ü:"+input);
				System.out.println(input+"�� ���� ����ϴ�.");
			}
		    
		};    
            
		Soundable soundable2=new Soundable() {
			Scanner scanner=new Scanner(System.in);
            String input2=scanner.nextLine();
			
            @Override
            public void sound() {
				System.out.println("�ι�° �͸�����ü:"+input2);
				System.out.println(input2+"�� ���� ����ϴ�.");
			}
		

	    };
	   
	  soundable.sound();
	  soundable2.sound();
	

   }
}
