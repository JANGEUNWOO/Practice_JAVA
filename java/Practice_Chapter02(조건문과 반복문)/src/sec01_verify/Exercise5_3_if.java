package sec01_verify;

import java.util.Scanner;

public class Exercise5_3_if {

	public static void main(String[] args) {
		
		
		int amount, basic;
		double price, tax, total;

		System.out.printf("전기 사용량을 입력하세요(kw) : ");
		Scanner sc = new Scanner(System.in);
		amount=sc.nextInt();
		
		if (amount > 500) 
			basic = 9330;
		else if (amount > 400) 
			basic = 5130;
		else if (amount > 300)
			 basic = 2710;
		else if (amount > 200)
			 basic = 1130;
		else if (amount > 100) 
			basic = 660;
		else basic = 370;


		
		if(amount <= 100)
		{
			price = amount * 52.0;
		}
		else if(amount <= 200)
		{
			price = 100 * 52.0;
			price += (amount - 100) * 88.5;
		}
		else if(amount <= 300)
		{
			price = (100 * 52.0) + (100 * 88.5);
			price += (amount - 200) * 127.8;
		}
		else if(amount <= 400)
		{
			price = (100 * 52.0) + (100 * 88.5) + (100 * 127.8);
			price += (amount - 300) * 184.3;
		}
		else if(amount <= 500)
		{
			price = (100 * 52.0) + (100 * 88.5) + (100 * 127.8) + (100 * 184.3);
			price += (amount - 400) * 274.3;
		}
		else
		{
		     price = (100 * 52.0) + (100 * 88.5) + (100 * 127.8) + (100 * 184.3) + (100 * 274.3);
			price += (amount - 500) * 494.0;
		}

		tax = (basic + price) * 0.09;
		total = basic + price + tax;

		System.out.print("이번 달 요금은 "+total+"원입니다.\n");

	sc.close();
	

	}

}
