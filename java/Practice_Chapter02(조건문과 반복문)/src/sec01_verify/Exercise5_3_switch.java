package sec01_verify;

import java.util.Scanner;

public class Exercise5_3_switch {

	public static void main(String[] args) {
		
		int basic;
		double price, tax, total;
		System.out.print("전기사용량을 입력하세요(kw) : ");
        Scanner sc=new Scanner(System.in);
		int amount=sc.nextInt();
		
		
		
		switch(amount/100) {
		case 0:
			basic=370;
		    price=amount*52.0;
		    break;
		case 1:
			basic=660;
			price=((amount-100)*88.5)+5200;
		case 2:
		    basic=1130;
		    price=((amount-200)*127.8)+5200+8850;
		    break;
		case 3:
		    basic=2710;
		    price=((amount-300)*184.3)+5200+8850+12780;
		    break;
		case 4:
			basic=5130;
			price=((amount-400)*274.3)+5200+8850+12780+18430;
			break;
		default:
			basic=9330;
			price=((amount-500)*494.0)+5200+8850+12780+18430+274300;
			break;
		}
	    tax=(basic+price)*0.09;
		total=basic+price-tax;	
		    
		System.out.println("이번달 요금은"+Math.round(total)+"입니다");
		
		sc.close();
	}

}
