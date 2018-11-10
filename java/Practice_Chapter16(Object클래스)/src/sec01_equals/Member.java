package sec01_equals;

public class Member {

	String id;
	//생성자
	public Member(String id) {
		this.id=id;
	}
	
	//매개변수로 Object가 있다. 이의미는?
	@Override
	public boolean equals(Object obj) {
		//타입변환을 확인하기 위한 instanceof연산자
		System.out.println("equals()호출");
		if(obj instanceof Member) {
			//obj를 Member타입으로 강제변환
			Member member=(Member)obj;
			
			//논리적 동등을 위해 조건문 설정
			if(this.id.equals(member.id))
				return true;
		}
		return false;
	}
}
