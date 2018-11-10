package sec01.exam04_list;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.List;
import java.awt.Toolkit;

public class Listexample {

	public static void main(String[] args) {
		
		//드랍다운리스트, 콤보박스라곧 칭함.
		
		Frame f=new Frame("List예제");
		f.setSize(300,200);
		f.setLayout(null);
		
		Toolkit tk=Toolkit.getDefaultToolkit();
		Dimension screenSize=tk.getScreenSize();
		
		f.setLocation(screenSize.width/2-150, (screenSize.height/2)-100);
		f.setVisible(true);//생성한 frame 화면에 보이도록 한다.
        
		//목록을 보여줄 수 있는 List를 만든다. 여기서는 한자이만 선택가능
		//기본적으로 생성자에서는 두번째 매개값은 false로 되어 있다.
		List selectOne=new List();
		selectOne.setLocation(20,40);
		selectOne.setLocation(100,120);
		selectOne.add("학생");
		selectOne.add("선샌님");
		selectOne.add("운전기사");
		selectOne.add("프로그래머");
		selectOne.add("노가다");
		selectOne.add("가수");
		selectOne.add("대통령");
		selectOne.add("피자수집");
		selectOne.add("대교수");
		
		
		//생성자의 두번째 인가값을 true로 설정 list의 목록에서 여러 키를
		//선택할 수 있게 함
		List selectmany=new List(100,true);
		selectmany.setLocation(150,40);
		selectmany.setSize(100,120);
		selectmany.add("1관");
		selectmany.add("3광");
		selectmany.add("비광");
		selectmany.add("똥광");
		selectmany.add("8광");
		selectmany.add("로얄");
		selectmany.add("스트레이드");
		
		f.add(selectOne);
		f.add(selectmany);
		
	}

}
