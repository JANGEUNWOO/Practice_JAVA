package sec01_verify;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		
		double weight=0.0;
		double height=0.0;
		double bmi=0.0;
		
		Scanner sc =new Scanner(System.in);
		
		
		System.out.print("몸무게를 입력 : ");
		weight=sc.nextDouble();
		
		System.out.print("키를 입력 : ");
		height=sc.nextDouble();
		
		height=height/100;
		bmi=weight/(height*height);
		
		
		if ((bmi >=20) && (bmi < 25)) {
			System.out.println("표준입니다");
		}	
			else {
			
				System.out.println("제중관리가 필요합니다");
			
			}
		sc.close();	
	}
	
	

	}


