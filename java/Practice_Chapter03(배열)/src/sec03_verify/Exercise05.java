package sec03_verify;

import java.util.Arrays;

public class Exercise05 {

	public static void main(String[] args) {
		
		
		int[][] arr=new int[][] {
			
			{50,63,72},
			{79,43}
			
		};
		System.out.println("반수 :"+arr.length);
		for(int i=0;i<arr.length;i++) {
			if(i==1){
				System.out.println("");
			}
				System.out.println(i+1+"반의 인원 : "+arr[i].length);
				
			for(int j=0;j<arr[i].length;j++) {
				System.out.println((i+1+"반 ")+(j+1+"번의 점수 :")+arr[i][j]);	
			}
			
			
		}
		
		int sum=0;
		double avg=0;
		for(int i=0;i<arr.length;i++) {
	     for(int j=0;j<arr[i].length;j++) {
	    	
	    	 sum+=arr[i][j];
	    	
	     }
	     System.out.println(sum);
		}
	   
	    
	    
		
		
		
	}

}
