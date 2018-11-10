package sec01.exam02_button;

import java.awt.Button;
import java.awt.Frame;

public class ButtonExample01 {

	public static void main(String[] args) {
		
		Frame f=new Frame("Login");
		f.setSize(500,500);
		f.setLayout(null);  //레이아웃 매니저의 설정을 해제한다.
		

		Button b1=new Button("확인");
		b1.setSize(100,50);   //버튼1의 크기를 설정한다.
		b1.setLocation(110,50); //프레임 내에서 버튼1의 위치를 설정한다.
		
		Button b2=new Button("취소");
		b2.setSize(100,50);    //프레임내에서의 버튼2 크기를 설정한다.
		b2.setLocation(220,50);
		
		
		f.add(b1);
		f.add(b2);
		f.setVisible(true);
		f.setResizable(false); //사용자가 프레임의 크 기를 조절할수 없도록 한다.
		

	}

}
