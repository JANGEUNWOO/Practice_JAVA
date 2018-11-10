package sec04_array_search;

public class Member implements Comparable<Member>{
	
	String name;
	
	public Member(String name) {
		this.name=name;
	}
	
	@Override
	public int compareTo(Member o) {
	//String의 compareTo()는 무자코드를 비교하여 음수
	//0, 양수를 리턴함.
		return name.compareTo(o.name);
	}
}
