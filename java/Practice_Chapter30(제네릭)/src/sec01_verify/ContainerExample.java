package sec01_verify;

public class ContainerExample {

	public static void main(String[] args) {
		
		Container<String> ct1=new Container<String>();
		
		ct1.setT("ȫ�浿");
		System.out.println("<T>Ÿ���Ķ���Ϳ� <String>���� ��ü ���� �� ���尪 :"+ct1.getT());
		
		
		Container<Integer> ct2=new Container<Integer>();
		ct2.setT(100);
		System.out.println("<T>Ÿ���Ķ���Ϳ� <Integer>���� ��ü ���� �� ���尪 :"+ct2.getT());

	}

}
