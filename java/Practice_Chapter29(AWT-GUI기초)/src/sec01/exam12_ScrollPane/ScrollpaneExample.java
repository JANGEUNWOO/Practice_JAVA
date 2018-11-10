package sec01.exam12_ScrollPane;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.ScrollPane;

public class ScrollpaneExample {

	public static void main(String[] args) {
		
		
		Frame f=new Frame("ScrollPaneExample");
		f.setSize(300,300);
		
		ScrollPane sp=new ScrollPane();  //ScrollPane생성
		Panel p=new Panel();
		p.setBackground(Color.GREEN); //panel의 배경을 green으로 함
		for(int i=0;i<30;i++) {
			p.add(new Button("가"+i));
		}
		
		/*Scrollpane은 종속적 컨테이너로 단 하나의 컴포넌트에 포함시킬수 있다.
		 * 크기를  줄였다 늘렸다 하면 스크롤바가 자동 생성되는 것을 볼 수 있다.
		 * 내용은 Panel안에 4개의 버튼을 포함하였고, 그 Panel을 다시 SCrollpane컨터에너에 
		 * 포함시켰고 다시 SCrollpane컨테이너를 frame컨테이너에 포함시킨 것이다.
		 * 예제11과 비교해보면 그 차이를 느낄 수 있다. 스크롤이 생기면서 화면을 줄여도 컴포넌트들을 볼수가 있다.
		 */
		sp.add(p); //panel을 Scrollpane에 포함시킨다.
        f.add(sp); //scrollpane을 frame에 포함시킨다.
        f.setVisible(true);
	}

}
