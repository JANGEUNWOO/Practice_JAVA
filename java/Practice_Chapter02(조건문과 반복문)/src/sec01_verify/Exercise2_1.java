package sec01_verify;

import java.util.Scanner;

public class Exercise2_1 {

	public static void main(String[] args) {
		
		
		
		char sel;
		System.out.print("�Է� : ");
		
		Scanner sc=new Scanner(System.in);
		
		sel=sc.next().charAt(0);
		
		switch (sel){
		case 'A':
		case 'a':
			System.out.println("���ĳ�");
		    break;
		case 'M':
		case 'm':
			System.out.println("�����̳�");
		    break;
		case 'E':
		case 'e':
			System.out.println("�����̳�");
			break;
		
	    default:
	    	System.out.println("���ڳ�");
	
			
	}
		
		sc.close();
	
	}

}
