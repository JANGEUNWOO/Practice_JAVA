package sec04_verify;

import java.util.Scanner;

public class ComputerExample {

	public static void main(String[] args) {
		
		int r;
		Scanner scanner=new Scanner(System.in);
		System.out.print("구하고자하는 원의 반지름을 입력하세요 : ");
		r=scanner.nextInt();
		
		Calculator cr=new Calculator();
		System.out.println("Calculator 객체의 areaCircle()실행");
		System.out.println("원면적은:"+cr.areaCircle(r));
		System.out.println();
		
		
		Computer c=new Computer();
		System.out.println("Computer 객체의 areaCircle()실행");
		System.out.println("원면적은:"+c.areaCircle(r));
		
		
		double pp=3.145648393;
		System.out.printf("%.3f",pp);

		scanner.close();

	}

}
