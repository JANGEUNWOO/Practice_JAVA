package sec01_verify;

import java.util.Arrays;

public class Exercise05 {

	public static void main(String[] args) {
		
		
		int[] numArr=new int[10];
		         
		
		  
		  for(int i=0;i<numArr.length;i++) 
	      {
	         numArr[i]=i;//0~9의 숫자를 순서대로 배열에 넣는다   
	      }
		  System.out.println("원래의 배열 값들을 출력");
		  System.out.println(Arrays.toString(numArr));
	      for(int i=0;i<numArr.length;i++) 
	      {
	        
	    	  int a=(int)(Math.random()*10);//1~10의값을 배열에 저장
	         int tmp=numArr[0];
	         numArr[0]=numArr[a];
	         numArr[a]=tmp;
	         
	      }
	      //배열의 저장된 값들을 출력한다.
	      for(int i=0;i<numArr.length;i++) 
	      {
	         if(i==9); 
	      }
	      System.out.println("값을 임의로 섞은 후 출력");
	      System.out.print(Arrays.toString(numArr));
	      }
		      
			
			
		
	}



