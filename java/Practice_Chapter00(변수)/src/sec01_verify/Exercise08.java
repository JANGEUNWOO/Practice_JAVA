package sec01_verify;

import java.util.Scanner;

public class Exercise08 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int fahrenheit=scanner.nextInt();
		float celcius = (float)((fahrenheit - 32)/1.8);
		
		System.out.println("화씨온도를 입력하세요 :"+fahrenheit);
		System.out.println("입력한 화씨온도를 섭씨온도로 변환한 값 : " + celcius);
		
		scanner.close();
		
	}

}
