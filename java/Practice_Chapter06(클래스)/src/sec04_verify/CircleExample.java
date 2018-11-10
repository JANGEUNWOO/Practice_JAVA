package sec04_verify;

public class CircleExample {

	public static void main(String[] args) {
		
		
		Circle pizza=new Circle();    //Circle클래스의 인스턴스 pizza생성~ circle클래스의 private 필드  데이터 호출
		pizza.setRadius(10);              //값이 314  3.14*100하면 됨 =<10의 제곱
		pizza.setName("자바피자");
		System.out.println(pizza.getName()+"의 면적은 : "+pizza.getArea());
		
		Circle donut=new Circle();    
	    donut.setRadius(2);
	    donut.setName("자바도넛");
	    System.out.println(donut.getName()+"의 면적은 : "+donut.getArea());
		

	}

}
