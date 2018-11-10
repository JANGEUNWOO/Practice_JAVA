package sec03_exam_Multitype_parameter;

public class ProductExample {

	public static void main(String[] args) {

		// Product<Tv,String> product1=new Product<Tv,String>(); //JDK.1.6까지
		// 멀티 타입파라메터도 아래와 같이 가능하다. (파라메타의 갯수는 unlimited하다.)
		Product<Tv, String> pro1 = new Product<>(); // JDK 1.7이후

		pro1.setT(new Tv(2016, 06));
		pro1.setM("LG OLED 스마트 Tv");

		Tv tv = pro1.getT();
		String str1 = pro1.getM();
		System.out.println("내 티비는" + tv.getYear() + "년" + tv.getMonth() + "월 출시된" + str1 + "이다.");
		System.out.println();

		Product<Car, String> pro2 = new Product<>();
		pro2.setT(new Car("삼성", 2010, 05));
		pro2.setM(" SM5신형");

		Car car = pro2.getT();
		String str2 = pro2.getM();

		// System.out.Println(str1);
		System.out.println(
				"내 애매는" + car.getYear() + "년" + car.getMonth() + "월 출시된" + car.getBrand() + "의" + str2 + "이다.");

	}

}
