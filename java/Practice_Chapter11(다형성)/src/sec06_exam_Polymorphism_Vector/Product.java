package sec06_exam_Polymorphism_Vector;

public class Product {

	int price;     //제품의 가격
	int bonusPoint;   //제품구매 시 제공하는 보너스점수
	
	//생성자
	public Product(int price) {
		this.price=price;
		this.bonusPoint=(int)(price/10.0);
	}
	
	
	public Product(){
		this.price=0;
		this.bonusPoint=0;
	}
	
	
}
