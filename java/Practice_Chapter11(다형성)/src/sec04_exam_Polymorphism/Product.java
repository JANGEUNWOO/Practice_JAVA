package sec04_exam_Polymorphism;
//����Ŭ����
public class Product {
    
	int price;     //��ǰ�� ����
	int bonusPoint;   //��ǰ���� �� �����ϴ� ���ʽ�����
	
	//������
	public Product(int price) {
		this.price=price;
		//���ʽ������� ��ǰ������ 10%
		this.bonusPoint=(int)(price/10.0);
	}
	
}
