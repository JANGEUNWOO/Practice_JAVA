package sec03_eaxm_constructor;

public class ConstructorExample {

	public static void main(String[] args) {
		
		Data1 d1=new Data1(); //�⺻�����ڸ� ȣ��
		Data2 d2=new Data2(); //exception�߻� ����?
		
		d1.value=10;
		System.out.println(d1.value);
		
		Data2 d3=new Data2(3); //�Ű������� �ִ� �����ڸ� ȣ��
		System.out.println(d3.value);
		

	}

}
