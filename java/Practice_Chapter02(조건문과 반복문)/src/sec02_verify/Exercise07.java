package sec02_verify;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		
		
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.print("당신이 원하는 단은?");
		int num;
		num=sc.nextInt();
		
		for(int i=1;i<10;i++) {
			System.out.println(num+"*"+i+"="+num*i);
	
			
		}
		
		sc.close();
		

	}

}
