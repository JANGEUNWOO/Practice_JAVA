package sec04_exam_Nested_Interface;

public class ButtonExample {

	public static void main(String[] args) {
		
		
		Button bts=new Button();
		CallListenner c1=new CallListenner();
		MessageListenner s1=new MessageListenner();
		
		//setOnClickListenner()의 매개변수가 무엇인가? 바로 인터페이스이다.
		//그럼 매개변수로 무엇을 넘겨야 하나?
		
		bts.setOnClickListenner(new CallListenner());
		bts.touch();
		//bts.setOnClickListenner(null);
		bts.touch();
		
		
		bts.setOnClickListenner(c1);
		bts.touch();
		
		bts.setOnClickListenner(new MessageListenner());
		bts.touch();
		
		bts.setOnClickListenner(s1);
		bts.touch();

	}

}
