package sec01.exam02_button;

import java.awt.Button;
import java.awt.Frame;

public class ButtonExample02 {

	public static void main(String[] args) {
		// 프레임(독립적 컨테이너 생성)
		// 컨테이너는 컴포넌트를 담을 수 있다.
		// 프레임의 기본적인 레이아웃매니저는 BorderLayout Manager
		Frame f=new Frame("Login");
		f.setSize(500,500);
		f.setLayout(null);
		
		//버튼 생성
		//button위에 "확인"이라는 글자가 나타난다.
		Button b1=new Button("확인");
		Button b2=new Button("취소");
		
		//button2의 크기를 성정한다.
		b1.setSize(100,50);
		b2.setSize(100,50);
		b1.setLocation(110,50);
		b2.setLocation(220,50);
		
		//생성된 Button을 frame에 포함시킨다.
		f.add(b1);
		f.add(b2);
		f.setVisible(true);
		
		/* 
		 * 실험을 지켜보면 분명 버튼의 ㅋ기는 100,50인데 프레임을 다 차지하고 있다.
		 * 이것은 레이아웃매니저가 기본적으로 borderlayout으로 frame이 설정하고 있기 때문이다.
		 * 이것을 setlayout()메서드를 이용해서 바꿀수가 있다.
		 */

	}

}
