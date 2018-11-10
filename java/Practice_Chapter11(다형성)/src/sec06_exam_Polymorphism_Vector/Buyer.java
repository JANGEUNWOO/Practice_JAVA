package sec06_exam_Polymorphism_Vector;

import java.util.Vector;

public class Buyer {

   int money=100000;
   int bonusPoint=0;
   
   //구입한 제품을 저장하는데 사용될 Vector객체 (기본 10개방을 생성)
   Vector item = new Vector();
   
   public void buy(Product p) {
      if(this.money<p.price) {
         System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
         return;
      }
      
      this.money -= p.price;
      this.bonusPoint += p.bonusPoint;
      this.item.add(p); //구입한 제품을 Vector 에 저장
      System.out.println(p.toString()+"을(를) 구입하셨습니다.");
   }
   //구입한 제품을 환불한다.
   public void refund(Product p) {
      //제품을 Vector에서 제거한다.
      if(item.remove(p)) {
         money += p.price;
         bonusPoint -= p.bonusPoint;
         System.out.println(p + "을(를) 환불하셨습니다.");
      }
      //제거에 실패한 경우
      else {
         System.out.println("구입하신 제품 중 해당 제품이 없습니다.");
      }
   }
   
   
   //구매한 물품에 대한 정보를 요약해서 보여 준다.
   public void summary() {
      int sum = 0;
      String itemList = "";
      
      //Vector가 비어있는지 확인한다.
      if(item.isEmpty()) {
         System.out.println("구입하신 제품이 없습니다.");
         return;
      }
      //반복문을 이용해서 구입한 물품의 총 가격과 목록을 만든다.
      for(int i=0; i<item.size(); i++) {
         if(item.get(i) instanceof Product) {
            Product p = (Product)item.get(i);//타입체크
            sum += p.price;
            //삼항 연산자
         itemList += ((i==0)? "" + p : ","+p);
      }
      else {
         System.out.println("Product객체가 아닙니다");
      }
   }
      System.out.println("구입하신 물품의 총금액은 "+sum+"만원입니다.");
      System.out.println("구입하신 제품은 "+itemList+"입니다");
               
      }
   }


