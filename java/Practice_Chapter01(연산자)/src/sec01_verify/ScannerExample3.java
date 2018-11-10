package sec01_verify;

import java.util.Scanner;

public class ScannerExample3 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		double num1=scanner.nextDouble();
		double num2=scanner.nextDouble();
		double result;
		
		System.out.println("num1 입력 : "+num1);
		System.out.println("num2 입력 : "+num2);
		result=num1+num2;
		System.out.println("result(더하기) : "+result);
		result=num1-num2;
		System.out.println("result(빼기) : "+result);
		result=num1/num2;
		System.out.println("result(나누기) : "+Math.round(result));
		result=num1*num2;
		System.out.println("result(곱하기) : "+Math.round(result));
		
		scanner.close();
		

	}

}
