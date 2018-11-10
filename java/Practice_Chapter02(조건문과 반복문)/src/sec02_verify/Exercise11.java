package sec02_verify;

import java.util.Scanner;

public class Exercise11 {

	public static void main(String[] args) {
		
		
		int num;
		int high;
		int low;
		int mine;
		
		
		Scanner sc=new Scanner(System.in);
		
		
		while(true) {
			System.out.println("0~100의 수를 결정하였습니다. 맞추어보세요");
			num=(int)(Math.random()*100);
			//System.out.println(num);
			low=0;
			high=100;
			int i=0;
			
			while(true) {
			    System.out.println(low+"-"+high);
				
			    mine=0;
				mine=sc.nextInt();
				System.out.println("반복횟수는 "+i+"입니다");
				 if(mine==num) {
					
					 System.out.println("정답입니다");
					 
					 break;
				  
				  } 
				 else if(mine>num){
					   System.out.println("더낮게");
					   high=mine;
					   
				  } 
				 else if(mine<num){
			           System.out.println("더높게");
			           low=mine;
		          }
			  i++;
			}
			 System.out.println("종료하시겠습니까?y/n");
			 if(sc.next().equals("y"))
			 
			 
			 break;
		}
			
	  sc.close();
	}

}
