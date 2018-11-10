package sec01_exam;

public class IfExample {

	public static void main(String[] args) {
		
		int score=93;
		//몇십개의 if문이 존재하더라도, cpu는 모든 if문은 참조한다.
		
		if(score>=90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		}
		
		//()는 한줄일때는 생략할수 있지만, 왠만하면 ()로 묶어주는게 보기가 좋다.
		if(score<90) 
			System.out.println("점수가 90보다 작습니다.");
			
		
	System.out.println("등급은 B입니다.");  //if 블럭에 속해있지 않아서 출력됨..
		

	}

}
