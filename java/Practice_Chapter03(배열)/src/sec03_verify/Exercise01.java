package sec03_verify;

import java.util.Random;
import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		
        
		  
			   Scanner s=new Scanner(System.in);   
			   Random r=new Random();
			   
			   System.out.print("��Ҽ��� �Է��ϼ��� : ");
			   int count=s.nextInt();
			   String[][] a=new String[count][10];

			   for(int i=0,j=0;i<a.length;i++)
			   {
			      j=r.nextInt(10)+1; //1~10�����ǰ�
			      System.out.println("j��:"+j);
			      for(int z=0; z<j;z++)
			      {
			         a[i][z]="*\t";
			      }
			   }
			   //a.length�� �Է��� �� ���� ���̸� �ǹ���
			   for(int i=0;i<a.length;i++)
			   {
			      for(int z=0;z<a[i].length;z++)
			      {
			         System.out.println("a["+i+"]["+z+"]"+a[i][z]);
			      }
			   }
			   
			   //�迭����ŭ ������ ����
			   for(int i=9;i>=0;i--)
			   {
			      if(i!=0)
			      {
			         for(int j=0;j<a.length;j++)
			         {
			            if(a[j][i]==null)
			               System.out.print("\t");
			               else
			                  System.out.print(a[j][i]);
			            }
			         }
			      else {
			         for(int j=0;j<a.length;j++)
			         System.out.print("-\t");
			         System.out.println();
			         for(int j=0;j<a.length;j++)
			         System.out.print((j%10)+"\t");
			         }
			      System.out.println();
			      }
			   s.close();
			  
	
	}
			   
}
