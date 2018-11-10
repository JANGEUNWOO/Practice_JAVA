package sec03_1_verify;

import java.util.Scanner;

public class GoodsExample {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("몇개의 상품을 입력 받으시겠습니까?");
		int input=sc.nextInt();
	    
		String input1=sc.next();
		int input2=sc.nextInt();
		int input3=sc.nextInt();
		int input4=sc.nextInt();
		
		Goods go=new Goods(input1,input2,input3,input4);
		
		
		String input5=sc.next();
		int input6=sc.nextInt();
		int input7=sc.nextInt();
		int input8=sc.nextInt();
		
		Goods gone=new Goods(input5,input6,input7,input8);
	    
	    
		gone.setName(input5);
		gone.setPrice(input6);
		gone.setNumberOfStock(input7);
        gone.setSold(input8);
		
		System.out.println(go.name+" "+go.price+" "+go.numberOfStock+" "+go.sold);
	    System.out.println(gone.getName()+" "+gone.getPrice()+" "+gone.getNumberOfStock()+" "+gone.getSold());
	
	sc.close();
	}

}
