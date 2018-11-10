package sec06_exam_Polymorphism_Vector;

import java.util.Vector;

public class Buyer {

   int money=100000;
   int bonusPoint=0;
   
   //������ ��ǰ�� �����ϴµ� ���� Vector��ü (�⺻ 10������ ����)
   Vector item = new Vector();
   
   public void buy(Product p) {
      if(this.money<p.price) {
         System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
         return;
      }
      
      this.money -= p.price;
      this.bonusPoint += p.bonusPoint;
      this.item.add(p); //������ ��ǰ�� Vector �� ����
      System.out.println(p.toString()+"��(��) �����ϼ̽��ϴ�.");
   }
   //������ ��ǰ�� ȯ���Ѵ�.
   public void refund(Product p) {
      //��ǰ�� Vector���� �����Ѵ�.
      if(item.remove(p)) {
         money += p.price;
         bonusPoint -= p.bonusPoint;
         System.out.println(p + "��(��) ȯ���ϼ̽��ϴ�.");
      }
      //���ſ� ������ ���
      else {
         System.out.println("�����Ͻ� ��ǰ �� �ش� ��ǰ�� �����ϴ�.");
      }
   }
   
   
   //������ ��ǰ�� ���� ������ ����ؼ� ���� �ش�.
   public void summary() {
      int sum = 0;
      String itemList = "";
      
      //Vector�� ����ִ��� Ȯ���Ѵ�.
      if(item.isEmpty()) {
         System.out.println("�����Ͻ� ��ǰ�� �����ϴ�.");
         return;
      }
      //�ݺ����� �̿��ؼ� ������ ��ǰ�� �� ���ݰ� ����� �����.
      for(int i=0; i<item.size(); i++) {
         if(item.get(i) instanceof Product) {
            Product p = (Product)item.get(i);//Ÿ��üũ
            sum += p.price;
            //���� ������
         itemList += ((i==0)? "" + p : ","+p);
      }
      else {
         System.out.println("Product��ü�� �ƴմϴ�");
      }
   }
      System.out.println("�����Ͻ� ��ǰ�� �ѱݾ��� "+sum+"�����Դϴ�.");
      System.out.println("�����Ͻ� ��ǰ�� "+itemList+"�Դϴ�");
               
      }
   }


