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
			System.out.println("0~100�� ���� �����Ͽ����ϴ�. ���߾����");
			num=(int)(Math.random()*100);
			//System.out.println(num);
			low=0;
			high=100;
			int i=0;
			
			while(true) {
			    System.out.println(low+"-"+high);
				
			    mine=0;
				mine=sc.nextInt();
				System.out.println("�ݺ�Ƚ���� "+i+"�Դϴ�");
				 if(mine==num) {
					
					 System.out.println("�����Դϴ�");
					 
					 break;
				  
				  } 
				 else if(mine>num){
					   System.out.println("������");
					   high=mine;
					   
				  } 
				 else if(mine<num){
			           System.out.println("������");
			           low=mine;
		          }
			  i++;
			}
			 System.out.println("�����Ͻðڽ��ϱ�?y/n");
			 if(sc.next().equals("y"))
			 
			 
			 break;
		}
			
	  sc.close();
	}

}
