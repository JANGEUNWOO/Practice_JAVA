package sec07_exam_button_event;

public class Window {

	//필드
	public Button btn1=new Button();
	public Button btn2=new Button();
	
	//필드의 초기값으로 익명구현객체를 생성하고 있다.
	Button.OnclickListenner listenner=new Button.OnclickListenner() {
		
		@Override
		public void OnClick() {
			System.out.println("프로그램 설치가 진행됩니다.");
			
		}
	};
	
	public Window() {
		//Button클래스의 인스턴스로 setOnClickLinstenner 호출하면서 위에 새엉된 매개값을 넘긴다.
		btn1.setOnClickListenner(listenner);
		
		//Button클래스의 인스턴스로 바로 익명구현객체를 넘긴다.
		btn2.setOnClickListenner(new Button.OnclickListenner() {
			
			@Override
			public void OnClick() {
				System.out.println("게임을 시작합니다.");
				
			}
		});
	
   }
}
