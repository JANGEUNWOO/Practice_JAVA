package sec01_verify;

import java.util.Scanner;

public class Exercise3_if {

	public static void main(String[] args) {
		
		
		int num1, num2, res, op=0;
		System.out.print("두개의 정수를 입력하세요 : ");
		Scanner sc=new Scanner(System.in);
		num1=sc.nextInt();
		num2=sc.nextInt();
        
		System.out.print("연산기호를 입력하세요(1:더하기,2:빼기,3:곱하기,4:나누기,5:나머지): ");
		res=sc.nextInt();
		if(res==1) {
			op=num1+num2;
			System.out.println(num1+"+"+num2+"="+op);
		} else if(res==2) {
			op=num1-num2;
			System.out.println(num1+"-"+num2+"="+op);
		} else if(res==3) {
			op=num1*num2;
			System.out.println(num1+"*"+num2+"="+op);
		} else if(res==4) {
			op=num1/num2;
			System.out.println(num1+"/"+num2+"="+op);
	    } else if(res==5) {
	    	System.out.println("나머지");
	    }
		sc.close();
       }	
	}

	


