package sec03_verify;

public class CarExample {

	public static void main(String[] args) {
		
		
		Car cr=new Car();
		System.out.println("car1.company : "+cr.company);
		
		Car qe=new Car("�ڰ���");
		System.out.println("car2.company : "+qe.company);
		System.out.println("car2.company : "+qe.model);
		System.out.println();
		Car rq=new Car("�ڰ���","����");
		System.out.println("car3.company : "+rq.company);
		System.out.println("car3.company : "+rq.model);
		System.out.println("car3.company : "+rq.color);
		System.out.println();
		
		Car fa=new Car("�ý�","����",200);
		System.out.println("car4.company : "+fa.company);
		System.out.println("car4.company : "+fa.model);
		System.out.println("car4.company : "+fa.color);
		System.out.println("car4.company : "+fa.maxSpeed);
		

	}

}
