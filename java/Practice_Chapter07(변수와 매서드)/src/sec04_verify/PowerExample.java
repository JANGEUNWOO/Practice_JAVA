package sec04_verify;

import java.util.Scanner;

public class PowerExample {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int x;
		int n;
		long result=0;
		System.out.println("제곱까지의 합을 계산합니다.");
		
		System.out.print("제곱하고 싶은 수를 입력 :");
		x=sc.nextInt();
		System.out.print("몇승을 더할까요?:");
		n=sc.nextInt();
		
		
		for(int i=1;i<=n;i++) {
			result+=power(x,i);
		}
		
		System.out.printf("%d의 %d승 까지의합은 %d입니다",x,n,result);
		sc.close();
		
	
	}

	
	static long power(int x,int n) {
		if(n==1) {
			return x;
		}
		
		else {
			return x*power(x,n-1);
		}
		
	}
}
