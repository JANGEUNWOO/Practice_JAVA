package sec05_exam_Polymorphism_Array;

public class Computer extends Product {

	//����Ŭ������ ������ Product(int price)�� ȣ���Ѵ�.
	
			public Computer() {
				super(300);   //Tv�� ������ 300�������� �Ѵ�.
			}
			
			
			//ObjectŬ������ toString()�� �������̵��Ѵ�.
			@Override
			public String toString() {
				return "Computer";
			}
	
}
