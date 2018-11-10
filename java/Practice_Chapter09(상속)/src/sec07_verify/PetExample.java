package sec07_verify;

public class PetExample {

	

	public static void main(String[] args) {
		
		
		Dog D=new Dog();
		Bird B=new Bird();
		D.move();
		B.move();
		D.name="누렁이";
		D.weight=10;
		System.out.println("강아지의 이름은 "+D.name+"고, 몸무게는 "+D.weight+"kg입니다.");
		
		B.type="앵무새";
		B.flightYN=true;
		
		if(B.getFlight()) {
			System.out.println("새의 종류는 "+B.type+"고, 날수있습니다.");
		}else {
			System.out.println("새의 종류는 "+B.type+"고, 날수없습니다.");
		}
	}

}
