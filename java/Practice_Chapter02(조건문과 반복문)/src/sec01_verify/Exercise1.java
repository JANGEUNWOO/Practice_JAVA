package sec01_verify;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		
		double weight=0.0;
		double height=0.0;
		double bmi=0.0;
		
		Scanner sc =new Scanner(System.in);
		
		
		System.out.print("�����Ը� �Է� : ");
		weight=sc.nextDouble();
		
		System.out.print("Ű�� �Է� : ");
		height=sc.nextDouble();
		
		height=height/100;
		bmi=weight/(height*height);
		
		
		if ((bmi >=20) && (bmi < 25)) {
			System.out.println("ǥ���Դϴ�");
		}	
			else {
			
				System.out.println("���߰����� �ʿ��մϴ�");
			
			}
		sc.close();	
	}
	
	

	}


