package sec01.exam06_checkbox;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class CheckboxExample {

	public static void main(String[] args) {
		Frame f=new Frame("체크박스 예제");
		f.setSize(305,250);
        
		
		/* frame의 layoutmanager를 flowlayout으로 설정한다.
		 * flowlayout방식은 배치의 한 방식으로 좌측에서 우측으로 컴포넌트를 정렬시킨다.
		 * 지금은 왼쪽 정렬을 선택했다.
		 */
		
		f.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		//checkbox를 개별적으로 생성하면 다중 선택이 되어야 한다.
		Label q1=new Label("1.당신의 관심분야는 ?(여러개 선택가능)");
		
		Checkbox news=new Checkbox("news",true);
		Checkbox sports=new Checkbox("sports");
		Checkbox movies=new Checkbox("movies");
		Checkbox music=new Checkbox("music");
		f.add(q1); f.add(news); f.add(sports); f.add(movies); f.add(music);
		
		
		Label q2=new Label("2.얼마나 자주 극장에 가십니까?");
		CheckboxGroup group1=new CheckboxGroup();
		
		Checkbox movie1=new Checkbox("한달에 한번 갑니다.",group1,true);
		Checkbox movie2=new Checkbox("일주일에 한번 갑니다.",group1,false);
		Checkbox movie3=new Checkbox("일주일에 두번 갑니다.",group1,false);
		
		f.add(q2); f.add(movie1); f.add(movie2); f.add(movie3);
		
		Label q3=new Label("3. 하루에 얼마나 컴퓨터를 사용하십니까");
		CheckboxGroup group2=new CheckboxGroup();
		
		Checkbox com1=new Checkbox("5시간 이하",group2,true);
		Checkbox com2=new Checkbox("10시간 이하",group2,false);
		Checkbox com3=new Checkbox("15시간 이하",group2,false);
		
		f.add(q3); f.add(com1); f.add(com2); f.add(com3);
		f.setVisible(true);
	}

}
