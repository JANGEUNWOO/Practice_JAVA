package sec04_exam_Nested_Interface;

public class CallListenner implements Button.OnclickListenner{

	
	//ButtonŬ������ ��ø�������̽��� OnClickListenner�� �߻�޼��带 �������Ѵ�.
	
	@Override
	public void OnClick() {
		System.out.println("��ȭ�� �̴ϴ�.");
	}
	
}
