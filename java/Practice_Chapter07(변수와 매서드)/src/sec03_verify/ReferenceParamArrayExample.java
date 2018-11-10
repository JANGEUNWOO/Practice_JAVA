package sec03_verify;

import java.util.Arrays;

public class ReferenceParamArrayExample {

	public static void main(String[] args) {
		
		int[]arr=new int[] {3,2,1,6,5,4};
		 
		 System.out.println("정렬 전 배열값입니다.");
		 printArr(arr);
		 System.out.println(Arrays.toString(arr));
		 System.out.println("");
	     
		 System.out.println("정렬 후 배열값입니다.");
		 sortArr(arr);
	     System.out.println(Arrays.toString(arr));
	     System.out.println("");
	     
	     System.out.println("배열의 합계입니다.");
	     System.out.println( "sum="+Arrsum(arr));
	}
		
	    
	    public static void printArr(int[] arr) {
			
			for(int i=0;i<arr.length;i++) {           //배열 안의 값 나타냄
				System.out.print(arr[i]);
		    }
		    
	    }
		

		public static void sortArr(int[] arr) {
			//Arrays.sort(arr);
			for(int i=0;i<arr.length;i++)
		      {
		         for(int j=0;j<arr.length-1;j++)  //빈방을 비교하지 않기 위해 -처리
		         {
		            //버블 소팅(정렬)
		            if(arr[j]>arr[j+1]) {    //부등호를 역으로 돌리면 오름차순 내림차순 전환
		               int tmp=arr[j];
		               arr[j]=arr[j+1];
		               arr[j+1]=tmp;    //우유와 주스 각잔을 바꾸기 위해 빈잔인 temp를 만듬
		                     
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


