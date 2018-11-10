package sec02_verify;

public class Member {

	private String id;
	private String name;
	
	public Member(String id, String name) {
		this.id=id;
		this.name=name;
	}
	
	
	public String toString() {
		return "Member의 toString()을 호출한 결과 : "+id+": "+name;
	}
}
