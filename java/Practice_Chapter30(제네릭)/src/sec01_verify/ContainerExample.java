package sec01_verify;

public class ContainerExample {

	public static void main(String[] args) {
		
		Container<String> ct1=new Container<String>();
		
		ct1.setT("홍길동");
		System.out.println("<T>타입파라메터에 <String>으로 객체 생성 후 저장값 :"+ct1.getT());
		
		
		Container<Integer> ct2=new Container<Integer>();
		ct2.setT(100);
		System.out.println("<T>타입파라메터에 <Integer>으로 객체 생성 후 저장값 :"+ct2.getT());

	}

}
