package sec01_verify;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		
		int tot=0;
		int subject1=0;
		int subject2=0;
		int subject3=0;
		double avg=0.0;
		char grade;
		System.out.print("세과목 점수를 입력하시오:");
		
		
		Scanner sc=new Scanner(System.in);
		
		subject1=sc.nextInt();
		subject2=sc.nextInt();
		subject3=sc.nextInt();
		
		tot=subject1+subject2+subject3;
		avg=tot/(double)3;
		
	
		if (avg>=90) {
			grade='A';
		    } else if (avg>=80) {
				grade='B';
			} else if (avg>=70) {
				grade='C';
			} else {
			    grade='D';
		    }
				
		System.out.print("당신의 평균 : "+avg+"당신의 학점 : "+grade);
		
		sc.close();

	}

}
