package sec03_verify;

import java.util.Arrays;

public class ReferenceParamArrayExample {

	public static void main(String[] args) {
		
		int[]arr=new int[] {3,2,1,6,5,4};
		 
		 System.out.println("���� �� �迭���Դϴ�.");
		 printArr(arr);
		 System.out.println(Arrays.toString(arr));
		 System.out.println("");
	     
		 System.out.println("���� �� �迭���Դϴ�.");
		 sortArr(arr);
	     System.out.println(Arrays.toString(arr));
	     System.out.println("");
	     
	     System.out.println("�迭�� �հ��Դϴ�.");
	     System.out.println( "sum="+Arrsum(arr));
	}
		
	    
	    public static void printArr(int[] arr) {
			
			for(int i=0;i<arr.length;i++) {           //�迭 ���� �� ��Ÿ��
				System.out.print(arr[i]);
		    }
		    
	    }
		

		public static void sortArr(int[] arr) {
			//Arrays.sort(arr);
			for(int i=0;i<arr.length;i++)
		      {
		         for(int j=0;j<arr.length-1;j++)  //����� ������ �ʱ� ���� -ó��
		         {
		            //���� ����(����)
		            if(arr[j]>arr[j+1]) {    //�ε�ȣ�� ������ ������ �������� �������� ��ȯ
		               int tmp=arr[j];
		               arr[j]=arr[j+1];
		               arr[j+1]=tmp;    //������ �ֽ� ������ �ٲٱ� ���� ������ temp�� ����
		                     
		            }
		         }
		      }
			
		}
		
		
		public static int Arrsum(int[] arr) {
			   int sum=0;
			for(int i=0;i<arr.length;i++) {
				
				sum+=arr[i];
			    
			}
			return sum;
			
		}
         
		
		
		
		
	}


