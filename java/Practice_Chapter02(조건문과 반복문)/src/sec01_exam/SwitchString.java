package sec01_exam;

import java.util.Scanner;

public class SwitchString {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		String position=null;
		
		System.out.print("������ �Է��ϼ���>>");
		position=scan.nextLine();
		
		switch(position) {
		case"����":
			System.out.println("500����");
			break;
				
		case"����":
		    System.out.println("400����");
		    break;
		
		case"�븮":
			System.out.println("250����");
			break;
		
		case"���":
			System.out.println("150����");
			break;
			
	    default:
	    	System.out.println("300����");
	    	
		}
       scan.close();
	}

}
