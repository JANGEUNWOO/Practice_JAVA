package sec02_verify;

public class PhoneExample {

	public static void main(String[] args) {
		
		SmartPhone sp=new SmartPhone("������");
		System.out.println(sp.getOwner());
		sp.turnOn();
		sp.internetSearch();
		sp.turnOff();
		

	}

}
