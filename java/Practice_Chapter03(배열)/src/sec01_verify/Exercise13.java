package sec01_verify;

import java.util.Arrays;

public class Exercise13 {

	public static void main(String[] args) {
		 int[] arr=new int[10];
	      int max=0;
	      int number=0;
	      for(int i=1; i<=100; i++) {
	         int num=(int)(Math.random()*10);
	         System.out.printf((i%10!=0)?"%3d":"%3d\n",num);
	         arr[num]++;
	         
	      }
	System.out.println(Arrays.toString(arr));

	for(int i=0; i<arr.length;i++) {
	   if(max<arr[i]) {
	      max=arr[i];
	      number=i;
	   }
	}
	System.out.printf("���� ���� ������ ���� : %d�� %d�� �Դϴ�.",number,max);


	}

}
