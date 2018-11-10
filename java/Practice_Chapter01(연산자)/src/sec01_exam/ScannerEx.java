package sec01_exam;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		
        Scanner scanner=new Scanner(System.in);
        
        //num에다가 4바이트 메모리공간에 숫자(int)형을 받겠다.
        System.out.println("두자리 정수를 하나 입력해주세요.");
        int num=scanner.nextInt();  //nextInt()키보드로부터 데이터 받는 메서드
        System.out.printf("num=%d %n",num);
        
        //dnum에다가 8바이트 메모리공간에 실수(double형)를 받겠다.
        System.out.println("두자리 실수를 하나 입력해주세요");
        double dnum=scanner.nextDouble();
        System.out.println("dnum = "+dnum);
        
       
        System.out.print("원하는 숫자를 입력해주십시오.");
        String input=scanner.nextLine(); //next(공백포함)
        int num1=Integer.parseInt(input);
        
        System.out.println("String으로 입력한 내용"+input);
        System.out.println("input을 정수로 변환한 내용"+num1);
        
        //리소스 해제(입력스트림) 키보드나 마우스 등
        scanner.close();
        
        		
	}

}
