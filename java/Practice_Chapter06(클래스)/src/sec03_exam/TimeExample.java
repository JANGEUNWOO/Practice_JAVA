package sec03_exam;

public class TimeExample {

	public static void main(String[] args) {
		
		Time t1=new Time();
		//Time t2=new Time();
		
		//setter매서드 이용
		t1.setHour(12);
		t1.setMinute(48);
		t1.setSecond(59);
		System.out.println(t1);
		
	/*	//setter매서드 이용
		t2=t1;
		t2.setHour(10);
		t2.setMinute(11);
		t2.setSecond(55);
	/*	
		//Object클래스의 toString()매서드를 호출함
		System.out.println(t1.toString());
		System.out.println(t2);
	*/
		
		
		
	}

}
