package sec03_eaxm_constructor;

public class CarExample {

	public static void main(String[] args) {
		
		//차를 주문해서 자기가 직접 색깔도 바르고, 기아도 만들고,
		//문도 4개로 만드는 것!
		Car c1=new Car(); //Car인스턴스 생성
		
		/*
		 c1.color="white";
		 c1.gearType="auto";
		 c1.door=4;
		 */
		
		//차를 주문할 때 색성, 기아, 문갯수를 지정해주는 형태
		Car c2=new Car("파랑", "오토", 0);//매개변수가 3개인 생성자 로출
		
		//toString매서드가 호출됨.
		System.out.println(c1);
		System.out.println(c2.toString());
	}

}
