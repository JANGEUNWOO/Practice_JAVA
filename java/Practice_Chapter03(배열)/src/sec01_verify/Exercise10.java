package sec01_verify;

import java.util.Scanner;

public class Exercise10 {

	public static void main(String[] args) {
		
        Scanner sc=new Scanner(System.in);
		
		
		System.out.print("요소수 입력 :");
		int num=sc.nextInt();
		int[] arr=new int[num];
		
	    for(int i=0;i<arr.length;i++) {
	       arr[i]=(int)(Math.random()*99)+1;
	     
	       System.out.println("a["+i+"] :"+arr[i]);
	       
	    }
	    
	    
	    
        sc.close();
	}

}
