package sec02.exam03_BorderLayoutExample;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class BorderLayout_Example {

	public static void main(String[] args) {
		
		Frame f=new Frame("BorderLayoutTest");
		f.setSize(300,300);
		//Frame은 기본적으로 BorderLayout로 설정되어 있으므로 따로 설정하자
		f.setLayout(new BorderLayout(10,10));
		Button north=new Button("North");
		Button south=new Button("North");
		Button east=new Button("North");
		Button west=new Button("North");
		Button center=new Button("North");
		
		/*Frame의 5개의 각 영역에 Button을 하나씩 추가한다.
		 * 아래는 borderLayout의 상수들로 각각의 영역에 버튼을 추가하였다.
		 * f.add("North",north)나 혹은 f.add(north,"North")와 같이 쓸 수도 있다.
		 * 하지만, 아래와 같이 적는 것이 가독성이 좋다.
		 */

		f.add(BorderLayout.NORTH, north);
		f.add(BorderLayout.SOUTH, south);
		f.add(BorderLayout.EAST, east);
		f.add(BorderLayout.WEST, west);
		f.add(BorderLayout.CENTER, center);
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		f.setVisible(true);
		
	}

}
