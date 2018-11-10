package sec01.exam11_Panel;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

public class PanelExample {

	public static void main(String[] args) {
		 
        
		Frame f=new Frame();
		f.setSize(500,500);
		f.setLayout(null);  //frame이 layoutmanager를 사용하지 않도록 한다.
		
		//panel은 종속적인 컨테이너로써 기본적으로 flowlayout()을 사용한다.
		//따라서 panel안에 들어갈 컴포넌트의 위치를 따로 지정해주지 않아도 된다.
		
		Panel p= new Panel();
		p.setBackground(Color.GREEN);  //panel의 배경을 녹색으로
		p.setSize(300,300);
		p.setLocation(50,50);
		
		Button ok =new Button("ok");
		Button cancel=new Button("Cancel");
		
		//현재 버튼들이 Panel컨테이너에 추가가 되기 떄문에 프레임 컨테이너에
		//명령을 받는 것이 아니라 panel컨테이너의 레이아웃매니저에 영향을 받는다.
		
		p.add(ok);  //Button을 Panel에 포함시킨다.
		p.add(cancel); //Button을 panel에 포함시킨다.
		f.add(p); //panel을 frame에 포함시킨다.
		f.setVisible(true);
				
		
	}

}
