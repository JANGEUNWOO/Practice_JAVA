package sec03_newinstance;

public class NewInstanceExample {

	public static void main(String[] args) throws Exception {
		
		//여기 들어가는 매개값에 따라 시행되는 메서드가 달라짐에 주목하자.
        //Class clazz= Class.forName("java.lang.String");
		
		//SendAction객체생성
		Class clazz=Class.forName("sec03_newinstance.SendAction");
		
	    //String str=(String)clazz.newInstance();
		//str="스트링타입";
		//System.out.println(str);
		
		//ReceiveAction 객체생성
		//Class clazz=Class.forName("sec03_newInstance.ReceiveAction");
		
		//Class clazz=Class.forName("sec06.exam03_newinstance.ReceiveAction");
		
		//인터페이스 타입으로 강제형변환(다형성)
		Action action=(Action)clazz.newInstance();
		//Object obj=clazz.newInstance();
		//Action action1=(Action)obj;
		
		action.execute();   //생성된 동적객체 오버라이딩 된 메서드 호출
		//action.execute();
	}

}
