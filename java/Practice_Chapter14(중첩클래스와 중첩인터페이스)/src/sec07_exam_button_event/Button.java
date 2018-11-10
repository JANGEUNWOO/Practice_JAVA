package sec07_exam_button_event;

public class Button {


		   //중첩인터페이스
			interface OnclickListenner{
				void OnClick();
			}
			
			//인터페이스 참조변수선언
			OnclickListenner listener;
			
			//setter--매개변수로 인터페이스 타입이 선언되었다면 무슨 의미인가?
			void setOnClickListenner(OnclickListenner listener) {  
				this.listener = listener;
			}
			
			//touch()메서드가 호추도면서 중첩인터페이스를 구현한 객체의 
			//OnClick()메서드가 로출됨.
			
			void touch() {
				listener.OnClick();
			}
			
			
	}
	

