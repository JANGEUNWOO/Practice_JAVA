package sec01_verify;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample01 {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("1차원 배열의 방수를 입력 : ");
		int input=sc.nextInt();
		int[] arr=new int[input];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			System.out.println("arr["+i+"]:"+arr[i]);
		}
		
		Arrays.sort(arr);
		
		System.out.println("입력하신 배열값을 출력합니다.");
		System.out.println(Arrays.toString(arr));
		
		System.out.print("어떤 값을 찾으십니까 >>");
		int input2=sc.nextInt();
		int i=Arrays.binarySearch(arr,input2);
		
		System.out.println(input2+"은 arr배열의 "+i+"번째 방에 있습니다.");

	}

}
