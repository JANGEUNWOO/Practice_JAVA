package sec07_exam_button_event;

public class Window {

	//�ʵ�
	public Button btn1=new Button();
	public Button btn2=new Button();
	
	//�ʵ��� �ʱⰪ���� �͸�����ü�� �����ϰ� �ִ�.
	Button.OnclickListenner listenner=new Button.OnclickListenner() {
		
		@Override
		public void OnClick() {
			System.out.println("���α׷� ��ġ�� ����˴ϴ�.");
			
		}
	};
	
	public Window() {
		//ButtonŬ������ �ν��Ͻ��� setOnClickLinstenner ȣ���ϸ鼭 ���� ������ �Ű����� �ѱ��.
		btn1.setOnClickListenner(listenner);
		
		//ButtonŬ������ �ν��Ͻ��� �ٷ� �͸�����ü�� �ѱ��.
		btn2.setOnClickListenner(new Button.OnclickListenner() {
			
			@Override
			public void OnClick() {
				System.out.println("������ �����մϴ�.");
				
			}
		});
	
   }
}
