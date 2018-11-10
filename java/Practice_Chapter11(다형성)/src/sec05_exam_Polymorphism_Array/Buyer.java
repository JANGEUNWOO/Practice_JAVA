package sec05_exam_Polymorphism_Array;

public class Buyer {
	int money=1000;   //소유금액
	int bonusPoint=0; //보너스 점수
	
	Product[] item=new Product[10];//구입한 제품을 저장하기 위한 배열
	int i=0; //Product배열에 사용될 카운터.
	
	
	public void buy(Product p) {
		
		if(this.money<p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			this.money=0;
			return;
		}
	
	this.money-=p.price;  //가진돈에서 구입한 제품의 가격을 뺀다.
	this.bonusPoint+=p.bonusPoint; //
	this.item[i++]=p; //제품을 Product[] item에 저장한다.
	System.out.println(p+"을 구입하셨습니다.");
	}	
	//구매한 물품에 대한 정보를 요약해서 보여준다.
	public void summary() {
		int sum=0; //구입한 물품의 가격합계
		String itemList="";//구입한 물품목록
		
	//반복문을 이용해서 구입한 물품의 총 가격과 목록을 만든다.
	for(int i=0;i<item.length;i++) {
		if(item[i]==null)
			break;
		sum+=this.item[i].price;
		
		if(i==9)
			itemList +=this.item[i];
		else
			itemList +=this.item[i]+",";
	}
	
	
	System.out.println("구입하신 물품의 총금액은"+sum+"만원입니다.");
	System.out.println("구입하신 물품의 포인트는"+itemList+"입니다.");
    }
	
}