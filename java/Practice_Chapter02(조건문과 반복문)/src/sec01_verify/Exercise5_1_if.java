package sec01_verify;

import java.util.Scanner;

public class Exercise5_1_if {

	public static void main(String[] args) {
		
       int score;
       
       Scanner sc=new Scanner(System.in);
       score=sc.nextInt();
       System.out.print("������ �Է��ϼ��� :  "+score);
       
       if(score>=95) {
    	   System.out.println("����� ������ : A+");
    } else if(score>=90) {
    	   System.out.println("����� ������ : A");
    } else if(score>=85) {
    	   System.out.println("����� ������ : B+");
    } else if(score>=80) {
    	   System.out.println("����� ������ : B+");
    } else {
    	   System.out.println("�����");
    }
	
	 sc.close();
	}
      
  }


