package sec01_exam_CastingEx;

public class CastingExample2 {

	public static void main(String[] args) {
		
		Car car=new Car();  //Car�ν��Ͻ� ����   Car������ FireEngine���� �ٲٸ� ����Ǯ��
		//Car car=null;    //Car�ν��Ͻ� ����
		
		//����Ÿ���� �ν��Ͻ��� ������ �ڼ�Ÿ���� �ν��Ͻ��� �ٷ�� �ִ�.
		//(�������� ����� ��--->᳷δ� ����), �ݴ�ºҰ���
		//��Car car=new FireEngine();   //�̷������� ������.
		
		//Car2�� null�ʱ�ȭ
		Car car2=null;
		FireEngine fe=new FireEngine();  //fe�� null�ʱ�ȭ
		
		//Car�� drive()�ż��� ȣ��
		
		car.drive();   //��µ�
		//�ڼ�Ÿ���� �ν��Ͻ��� ������ ����Ÿ���� �ν��Ͻ��� �ٷ�� ����.
		//(�������� ����� �-->���δ� �Ұ�).
		//�ݴ�� ���
		//car=fe;
		fe=(FireEngine)car; //�������� ok, ����� ������ �߻�(ClassCastException�߻�) ��??>>
		fe.drive();   //�ּ�ó���ϸ� ��µ�
		car2=fe;
		car2.drive(); //�ּ�ó���ϸ� ��µ�
		fe.water();   //�ּ�ó���ϸ� ��µ�
		
	}

}
