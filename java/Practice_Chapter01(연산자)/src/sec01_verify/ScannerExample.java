package sec01_verify;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int num1=scanner.nextInt();
		int num2=scanner.nextInt();
		int result=num1+num2;
        System.out.println("num1 입력 : "+num1);
        System.out.println("num2 입력 : "+num2);
        System.out.println("result : "+result);
	
		scanner.close();
	}
	

}
