package sec01_verify;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample01 {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("1���� �迭�� ����� �Է� : ");
		int input=sc.nextInt();
		int[] arr=new int[input];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			System.out.println("arr["+i+"]:"+arr[i]);
		}
		
		Arrays.sort(arr);
		
		System.out.println("�Է��Ͻ� �迭���� ����մϴ�.");
		System.out.println(Arrays.toString(arr));
		
		System.out.print("� ���� ã���ʴϱ� >>");
		int input2=sc.nextInt();
		int i=Arrays.binarySearch(arr,input2);
		
		System.out.println(input2+"�� arr�迭�� "+i+"��° �濡 �ֽ��ϴ�.");

	}

}
