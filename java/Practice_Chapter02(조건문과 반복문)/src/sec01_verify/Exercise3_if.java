package sec01_verify;

import java.util.Scanner;

public class Exercise3_if {

	public static void main(String[] args) {
		
		
		int num1, num2, res, op=0;
		System.out.print("�ΰ��� ������ �Է��ϼ��� : ");
		Scanner sc=new Scanner(System.in);
		num1=sc.nextInt();
		num2=sc.nextInt();
        
		System.out.print("�����ȣ�� �Է��ϼ���(1:���ϱ�,2:����,3:���ϱ�,4:������,5:������): ");
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
	    	System.out.println("������");
	    }
		sc.close();
       }	
	}

	


