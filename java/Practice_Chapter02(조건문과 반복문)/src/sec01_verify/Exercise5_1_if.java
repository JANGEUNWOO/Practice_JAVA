package sec01_verify;

import java.util.Scanner;

public class Exercise5_1_if {

	public static void main(String[] args) {
		
       int score;
       
       Scanner sc=new Scanner(System.in);
       score=sc.nextInt();
       System.out.print("점수를 입력하세요 :  "+score);
       
       if(score>=95) {
    	   System.out.println("당신의 학점은 : A+");
    } else if(score>=90) {
    	   System.out.println("당신의 학점은 : A");
    } else if(score>=85) {
    	   System.out.println("당신의 학점은 : B+");
    } else if(score>=80) {
    	   System.out.println("당신의 학점은 : B+");
    } else {
    	   System.out.println("재수강");
    }
	
	 sc.close();
	}
      
  }


