package sec05_exam_instance_copy;

public class CarExample {

	public static void main(String[] args) {
		
		
		Car c1=new Car();
		Car c2=new Car(c1);  //c1 복사본 c2를 생성한다.
		
		
		c2.door=100;      //c1의 인스턴스변수 door의 값을 변경한다.
		c2.color="노란색"; 
				
		Car c3=new Car(c1);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);

	}

}
