package sec01_verify;

import java.util.*;

public class Exercise06 {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.print("요소수 입력 :");
		int num=sc.nextInt();
		int[] arr=new int[num];
		
	    for(int i=0;i<arr.length;i++) {
	       arr[i]=(int)(Math.random()*10)+1;
	     
	       System.out.print("a["+i+"] :");
	       for(int j=0; j<arr[i]; j++)       //a[i]의 값만큼 '*'을 찍는다.
		   System.out.print("*");
		   System.out.println();
	    }
		
        sc.close();
	}

}
