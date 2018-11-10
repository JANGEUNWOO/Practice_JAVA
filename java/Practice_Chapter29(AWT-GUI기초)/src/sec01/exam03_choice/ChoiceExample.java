package sec01.exam03_choice;

import java.awt.Choice;
import java.awt.Frame;

public class ChoiceExample {

	public static void main(String[] args) {
		
		
		Frame f=new Frame("choice(선택)");
		f.setSize(300,200);
		f.setLayout(null); //layout해제
		
		//Choice객체를 생성한 다음 choice의 목록에 나타날 값들을 추가한다.
        Choice day=new Choice();
        day.add("SUN");
        day.add("mon");
        day.add("tue");
        day.add("wed");
        day.add("tur");
        day.add("fri");
        day.add("sat");
        
        day.setSize(100,50);
        day.setLocation(100,70); //프레임이 윈도우에 대한 상대적 위치
        
        f.add(day);
        f.setVisible(true);
	}

}
