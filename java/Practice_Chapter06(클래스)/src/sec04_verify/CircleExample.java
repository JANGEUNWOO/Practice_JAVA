package sec04_verify;

public class CircleExample {

	public static void main(String[] args) {
		
		
		Circle pizza=new Circle();    //CircleŬ������ �ν��Ͻ� pizza����~ circleŬ������ private �ʵ�  ������ ȣ��
		pizza.setRadius(10);              //���� 314  3.14*100�ϸ� �� =<10�� ����
		pizza.setName("�ڹ�����");
		System.out.println(pizza.getName()+"�� ������ : "+pizza.getArea());
		
		Circle donut=new Circle();    
	    donut.setRadius(2);
	    donut.setName("�ڹٵ���");
	    System.out.println(donut.getName()+"�� ������ : "+donut.getArea());
		

	}

}
