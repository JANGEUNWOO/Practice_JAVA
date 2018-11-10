package sec02_verify;


import java.util.Scanner;

public class Computer {

	
	Scanner num=new Scanner(System.in);
	int sum1(int[] values) {
		int sum=0;
		
		for(int i=0;i<values.length;i++) {
			System.out.print("values["+i+"]=");
			values[i]=num.nextInt();
			sum+=values[i];
		}
		return sum;
	
		
	}
	 
}
