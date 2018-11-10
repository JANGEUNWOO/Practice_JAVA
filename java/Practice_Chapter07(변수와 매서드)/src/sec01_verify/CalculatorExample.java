package sec01_verify;

public class CalculatorExample {

	public static void main(String[] args) {
		
		
		Calculator mymy=new Calculator();
		mymy.powerOn();
		
		int result1=mymy.plus(5, 6);
		System.out.println("resultA:"+result1);
		
		double result2=mymy.divide(10, 4);
		System.out.println("resultB:"+result2);
		
		mymy.poweroff();

	}

}
