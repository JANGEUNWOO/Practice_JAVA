package sec01_verify;

import java.util.Scanner;

public class ScannerExample2 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		double num1=scanner.nextDouble();
		double num2=scanner.nextDouble();
		int result=(int)num1-(int)num2;
		
		System.out.println("num1 입력 : "+num1);
		System.out.println("num2 입력 : "+num2);
		System.out.println(result);
		
		scanner.close();
	

	}

}
