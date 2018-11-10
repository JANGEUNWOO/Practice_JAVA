package sec01_verify;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		
		
		
		
		Scanner sc=new Scanner(System.in);
		
	    int num=sc.nextInt();
	    int[] arr=new int[num];
	    
		System.out.println("배열수 입력"+num);
	    
        for(int i=0;i<arr.length;i++) {
        	arr[i]=(int)(Math.random()*10)+1;
        	System.out.println("arr["+i+"]="+arr[i]);
        }
	sc.close();
	
	}

}
