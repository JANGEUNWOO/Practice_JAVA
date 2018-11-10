package sec02_verify;

import java.util.Scanner;

public class ComputerExample {

	public static void main(String[] args) {
		
		
		
		
		System.out.print("1차원 배열을 만듭니다. 배열수를 입력:");
		//Call by reference 개념이 들어간다!!
		//배열명은 주소 .. 잊지 말자..
		//기본형 매개변수 참조형 매개변수 구분 화실히!!!
		
		Scanner sc=new Scanner(System.in);
		int ab=sc.nextInt();
		int[] values=new int[ab];
		
		
		Computer com=new Computer();
		System.out.println("해당 배열 방에 정수를 입력하세요.");
		System.out.println("Computer인스턴스 멤버메서드 sum을 호출한 결과는"+com.sum1(values)+"입니다.");
		
		
		

	}

}
