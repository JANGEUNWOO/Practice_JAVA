package sec01_verify;

import java.util.Scanner;

public class ScannerExample4_String {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		String input=scanner.nextLine();
		
		
		System.out.println("input 입력 : "+input);
		System.out.println("입력한 문자열은 "+input+" 입니다.");
        
		scanner.close();
	}

}
