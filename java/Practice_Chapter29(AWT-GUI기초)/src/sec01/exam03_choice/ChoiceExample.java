package sec01.exam03_choice;

import java.awt.Choice;
import java.awt.Frame;

public class ChoiceExample {

	public static void main(String[] args) {
		
		
		Frame f=new Frame("choice(����)");
		f.setSize(300,200);
		f.setLayout(null); //layout����
		
		//Choice��ü�� ������ ���� choice�� ��Ͽ� ��Ÿ�� ������ �߰��Ѵ�.
        Choice day=new Choice();
        day.add("SUN");
        day.add("mon");
        day.add("tue");
        day.add("wed");
        day.add("tur");
        day.add("fri");
        day.add("sat");
        
        day.setSize(100,50);
        day.setLocation(100,70); //�������� �����쿡 ���� ����� ��ġ
        
        f.add(day);
        f.setVisible(true);
	}

}
