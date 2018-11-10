package sec02_array_equals;

import java.util.Arrays;

public class EqualsExample {

	public static void main(String[] args) {
		
		int[][] original=new int[][] {
			{1,2},
			{3,4}
		};
		
		//얕은 복사 값 비교
		System.out.println("얕은 복제후 비교");
		//2차원 뱌열 값 복제
		int[][] cloned1=Arrays.copyOf(original, original.length);
		//Object의 equals번지 비교
		
		System.out.println("배열번지비교:"+original.equals(cloned1));
		System.out.println("original배열 번지:"+original);
		System.out.println("cloned1 배열 번지:"+cloned1);
		System.out.println();
		System.out.println("1차배열 항목값 비교:"+Arrays.equals(original, cloned1));
		System.out.println("original[0]배열 번지:"+original[0]);
		System.out.println("cloned[0]배열 번지:"+cloned1[0]);
		System.out.println("original[1]배열 번지:"+original[1]);
		System.out.println("cloned[1]배열 번지:"+cloned1[1]);
		System.out.println();
		System.out.println("중첩 배열 항목값 비교"+Arrays.deepEquals(original,cloned1));
		System.out.println("original[0][0]값:"+original[0][0]);
		System.out.println("original[0][0]값:"+original[0][0]);
		System.out.println("original[1][0]값:"+original[1][0]);
		System.out.println("original[1][0]값:"+original[1][0]);
		System.out.println("original[1][1]값:"+original[1][1]);
		System.out.println("original[1][1]값:"+original[1][1]);
		
		
		//깊은 복사후 비교
		System.out.println("\n[같은 복제후 비교]");
		int[][] cloned2=Arrays.copyOf(original, original.length);
		cloned2[0]=Arrays.copyOf(original[0], original[0].length);
		cloned2[1]=Arrays.copyOf(original[1], original[1].length);
		
		System.out.println("배열번지비교:"+original.equals(cloned2));
		System.out.println("original배열 번지:"+original);
		System.out.println("cloned2 배열 번지:"+cloned2);
		System.out.println();
		System.out.println("1차배열 항목값 비교:"+Arrays.equals(original, cloned2));
		System.out.println("original[0]배열 번지:"+original[0]);
		System.out.println("cloned2[0]배열 번지:"+cloned2[0]);
		System.out.println("original[1]배열 번지:"+original[1]);
		System.out.println("cloned2[1]배열 번지:"+cloned2[1]);
		System.out.println();
		System.out.println("중첩 배열 항목값 비교"+Arrays.deepEquals(original,cloned2));
		System.out.println("original[0][0]값:"+original[0][0]);
		System.out.println("original[0][0]값:"+original[0][0]);
		System.out.println("original[0][1]값:"+original[0][1]);
		System.out.println("original[0][1]값:"+original[0][1]);
		System.out.println("original[1][0]값:"+original[1][0]);
		System.out.println("original[1][0]값:"+original[1][0]);
		System.out.println("original[1][1]값:"+original[1][1]);
		System.out.println("original[1][1]값:"+original[1][1]);
		
				
								
		
		
	}

}
