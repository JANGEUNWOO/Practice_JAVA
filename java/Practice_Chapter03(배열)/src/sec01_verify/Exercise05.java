package sec01_verify;

import java.util.Arrays;

public class Exercise05 {

	public static void main(String[] args) {
		
		
		int[] numArr=new int[10];
		         
		
		  
		  for(int i=0;i<numArr.length;i++) 
	      {
	         numArr[i]=i;//0~9�� ���ڸ� ������� �迭�� �ִ´�   
	      }
		  System.out.println("������ �迭 ������ ���");
		  System.out.println(Arrays.toString(numArr));
	      for(int i=0;i<numArr.length;i++) 
	      {
	        
	    	  int a=(int)(Math.random()*10);//1~10�ǰ��� �迭�� ����
	         int tmp=numArr[0];
	         numArr[0]=numArr[a];
	         numArr[a]=tmp;
	         
	      }
	      //�迭�� ����� ������ ����Ѵ�.
	      for(int i=0;i<numArr.length;i++) 
	      {
	         if(i==9); 
	      }
	      System.out.println("���� ���Ƿ� ���� �� ���");
	      System.out.print(Arrays.toString(numArr));
	      }
		      
			
			
		
	}



