package sec01.exam13_Dialog;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class DialogExample_no_event {

	public static void main(String[] args) {
		
		Frame f=new Frame("Parent");
		f.setSize(500,500);
		
		/* 
		 * Parent frame을(상속관계가 아니다!)f로 하고, mode을 true로 해서 필수응답
		 * dialog로 한다. 이렇게 되면 dialog창이 닫여야 frame을 사용할 수 있게 된다.
		 * 하지만 false로 설정하면 dialog에 상관없이 frame을 움직일 수 있다.
		 */

		
		Dialog info= new Dialog(f,"infomation",true);//모달로설정
		info.setSize(150,100);
		
		//parent frame이 아닌, 화면이 위치의 기준이 된다. 이유는 dialog역시
		//독립적인 컨테이너이기 때문
		info.setLocation(550,50);
		
		//Dialog의 레이아웃매니저도 역시 기본값은 BoderLayout이라 아래와 같이
		//FlowLayout으로 바꾸었다.
		info.setLayout(new FlowLayout());
		//Dialog도 컨테이너기 때문에 컴포넌트를 아래와 같이 포함할 수 있다.
		
		Label msg=new Label("이 라벨은 모달임",Label.CENTER);  //글자 중앙정렬
		Button ok=new Button("ok");
		info.add(msg);
		info.add(ok);
		//지금은 어쨌든 처리를 하지 않았기 때문에 ok버튼을 눌러도 아무런 일이 일어나지 않음
		
		f.setVisible(true);
		info.setVisible(true); //Dialog를 화면에 보이게 한다.
	}

}
