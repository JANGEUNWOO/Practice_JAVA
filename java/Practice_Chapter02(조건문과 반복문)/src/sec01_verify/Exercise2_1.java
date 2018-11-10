package sec01_verify;

import java.util.Scanner;

public class Exercise2_1 {

	public static void main(String[] args) {
		
		
		
		char sel;
		System.out.print("입력 : ");
		
		Scanner sc=new Scanner(System.in);
		
		sel=sc.next().charAt(0);
		
		switch (sel){
		case 'A':
		case 'a':
			System.out.println("오후네");
		    break;
		case 'M':
		case 'm':
			System.out.println("오전이네");
		    break;
		case 'E':
		case 'e':
			System.out.println("저녁이네");
			break;
		
	    default:
	    	System.out.println("잠자네");
	
			
	}
		
		sc.close();
	
	}

}
