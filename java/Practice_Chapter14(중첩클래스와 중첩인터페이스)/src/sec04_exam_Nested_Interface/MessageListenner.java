package sec04_exam_Nested_Interface;

public class MessageListenner implements Button.OnclickListenner{
	
	@Override
	public void OnClick() {
		System.out.println("메세지를 보냅니다.");
	}
	
}
