package sec02_verify;

import java.util.Scanner;

public class Exercise13 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int i,j,n=sc.nextInt();
		for(i=0; i<n; i++) {
			System.out.println();
			for(j=0; j<n; j++) {
				if(i==j||i+j==(n-1)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
		}
       sc.close();
	}
	}
