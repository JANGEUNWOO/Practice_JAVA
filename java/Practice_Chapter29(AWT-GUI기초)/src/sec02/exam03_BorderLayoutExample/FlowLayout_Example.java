package sec02.exam03_BorderLayoutExample;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FlowLayout_Example {

	public static void main(String[] args) {
		Frame f=new Frame("FlowLayoutTest");
		f.setSize(300,200);
		
		//중앙정렬의 FlowLayOut생성
		f.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		//왼쪽정렬을 하되, 수직, 수평 갭을 10씩 설정
		//f.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
		
		f.add(new Button("첫번째"));
		f.add(new Button("두번째"));
		f.add(new Button("세번째"));
		f.add(new Button("네번째"));
		f.add(new Button("다섯번째"));
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		//마우스로 프레임을 줄였다 늘렸다 해보자.
		f.setVisible(true);

	}

}
