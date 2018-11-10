package sec01_verify;

public class CarExample {

	public static void main(String[] args) {
		
		Car car1=new Car();
		
		car1.setCompany("현기차");
		System.out.println("제조회사: "+car1.getCompany());
		
		car1.setCar("그랜저");
		System.out.println("모델: "+car1.getCar());
		
		car1.setColor("검정");
		System.out.println("색깔: "+car1.getColor());
		
		car1.setMaxSpeed(350);
		System.out.println("최고속도: "+car1.getMaxSpeed());
		
		car1.setNowSpeed(0);
		System.out.println("현재속도: "+car1.getNowSpeed());
		
		car1.setFixedSpeed(60);
		System.out.println("수정된속도: "+car1.getFixedSpeed());
		
		

	}

}
