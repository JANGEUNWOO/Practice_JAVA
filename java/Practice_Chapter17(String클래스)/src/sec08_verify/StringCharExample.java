package sec08_verify;

import java.util.Scanner;

public class StringCharExample {

	public static void main(String[] args) {
		
		//��ſ� Java Programming 1234 �Է�
	    //��ȯ�� ���ڿ� ==> ��ſ� jAVA pROGRMMING 1234 
		Scanner sc=new Scanner(System.in);
		System.out.println("���ڿ��� �빮�ڴ� �ҹ��ڷ� �ҹ��ڴ� �빮�ڷ� �����մϴ�.");
        System.out.print("���ڿ��� �Է��ϼ��� :");
        String input=sc.nextLine();
        
        for(int i = 0; i < input.length(); i++){
        	String a;
        	if(input.charAt(i) >= 'a' && input.charAt(i) <= 'z'){   // �ҹ����� ���
        	a = Character.toString(input.charAt(i));
        	a = a.toUpperCase();
        	System.out.print(a);
        	}
        	else{                                               // �빮���� ���
        	a = Character.toString(input.charAt(i));
        	a = a.toLowerCase();
        	System.out.print(a);
        	}
        }
   }

}
