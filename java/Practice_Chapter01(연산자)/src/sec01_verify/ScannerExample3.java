package sec01_verify;

import java.util.Scanner;

public class ScannerExample3 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		double num1=scanner.nextDouble();
		double num2=scanner.nextDouble();
		double result;
		
		System.out.println("num1 �Է� : "+num1);
		System.out.println("num2 �Է� : "+num2);
		result=num1+num2;
		System.out.println("result(���ϱ�) : "+result);
		result=num1-num2;
		System.out.println("result(����) : "+result);
		result=num1/num2;
		System.out.println("result(������) : "+Math.round(result));
		result=num1*num2;
		System.out.println("result(���ϱ�) : "+Math.round(result));
		
		scanner.close();
		

	}

}
