package sec01.exam01_frame;

import java.awt.Frame;

public class FrameExample01 {

	public static void main(String[] args) {
		
		 //Frame 객체를 생성한다.
		 Frame frame=new Frame("Login");
		 
		 //Frame의 크기를 설정한다.(Component클래스에 정의된 메서드)
		 frame.setSize(300,200);
		 
		 //Frame의 위치를 설정한다.
		 frame.setLocation(300, 300);
		 
		
		 //생성한 frame을 화면서 보이도록 한다.(Component클래스에 정의된 매서드)
		 frame.setVisible(true);

	}

}
