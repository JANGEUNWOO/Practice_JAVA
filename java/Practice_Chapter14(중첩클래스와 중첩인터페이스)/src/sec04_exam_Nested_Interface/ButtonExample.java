package sec04_exam_Nested_Interface;

public class ButtonExample {

	public static void main(String[] args) {
		
		
		Button bts=new Button();
		CallListenner c1=new CallListenner();
		MessageListenner s1=new MessageListenner();
		
		//setOnClickListenner()�� �Ű������� �����ΰ�? �ٷ� �������̽��̴�.
		//�׷� �Ű������� ������ �Ѱܾ� �ϳ�?
		
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
