package sec01_verify;

import java.util.Scanner;

public class ScannerExample4_String {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		String input=scanner.nextLine();
		
		
		System.out.println("input �Է� : "+input);
		System.out.println("�Է��� ���ڿ��� "+input+" �Դϴ�.");
        
		scanner.close();
	}

}
