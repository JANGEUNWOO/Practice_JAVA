package sec02_exam;

public class TvtestExample2 {

	public static void main(String[] args) {
		
		
		Tv t;            //Tv�ν��Ͻ��� �����ϱ� ���� ���� t�� ����
		t=new Tv();      //TV�ν��Ͻ��� �����Ѵ�.
		t.channel=7;     //Tv�ν��Ͻ��� ������� channel�� ���� 7�� �Ѵ�.
		t.channelDown(); //Tv�ν��Ͻ��� �޼��� channelDown()�� ȣ���Ѵ�.
		System.out.println("���� ü����"+t.channel+"�Դϴ�.");
		

	}

}
