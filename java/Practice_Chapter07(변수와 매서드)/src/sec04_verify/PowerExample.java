package sec04_verify;

import java.util.Scanner;

public class PowerExample {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int x;
		int n;
		long result=0;
		System.out.println("���������� ���� ����մϴ�.");
		
		System.out.print("�����ϰ� ���� ���� �Է� :");
		x=sc.nextInt();
		System.out.print("����� ���ұ��?:");
		n=sc.nextInt();
		
		
		for(int i=1;i<=n;i++) {
			result+=power(x,i);
		}
		
		System.out.printf("%d�� %d�� ���������� %d�Դϴ�",x,n,result);
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
