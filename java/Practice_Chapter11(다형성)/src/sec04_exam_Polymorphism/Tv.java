package sec04_exam_Polymorphism;

public class Tv extends Product {

	//����Ŭ������ ������ Product(int price)�� ȣ���Ѵ�.
	
	public Tv() {
		super(300);    //Tv�� ������ 300�������� �Ѵ�.
	}
	
	
	//ObjectŬ������ toString()�� �������̵��Ѵ�.
	@Override
	public String toString() {
		return "Tv";
	}
	
}
