package sec01.exam01_frame;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;

public class FrameExample02 {

	public static void main(String[] args) {
		//앞선 예제에서는 프레임이 좌측상단에 위치했지만 지금은 중간에 위치 시키는 
		//매체이다.
		
		Frame f=new Frame("Login");
		f.setSize(300,200);
		
		//구현된 Toolkit객체를 얻는다.
		Toolkit tk=Toolkit.getDefaultToolkit();
		//화면의 크기를 구한다.
		Dimension screenSize= tk.getScreenSize();
		
		//화면크기의 절반값에서 frame크기의 절반값을 뺀 위치로 하면 
		//frame이 화면 가운데 위치하게 된다.
		//150, 100을 빼는 이유는 프레임의 사이즈의 절반을 뺸것이다.
		f.setLocation(screenSize.width/2-150,screenSize.height/2-100);
		f.setVisible(true);

	}

}
