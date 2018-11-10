package sec02_set.exam02_userDefineHashSet;

import java.util.Objects;

public class Member {

	private String name;
	private int age;

	// 생성자
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	/*
	 * 동등 객체의 조건은 object클래스에서도 했지만 다시 설명하면, 1번째 두객체의ㅡ 해쉬코드값이 같은지를 보고(hashcode재정의),
	 * 2번째 도갹체의 피드값이 다 같은지를 본다(equals재정의)
	 * 
	 */

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member) obj;
			// Member의 이름과 나이가 다 같다면 동등객체로 인식하고 true를 리턴함
			return member.name.equals(this.name) && member.age == this.age;
		} else {
			// 아니면 동등개게가 아니다라고 보고 false를 리턴
			return false;
		}
	}

	/*
	 * @Override public int hashCode() //이름과 나이를 가지고 해쉬콛를 만들어 리턴함 return
	 * Objects.hash(this.name,this.age);
	 * 
	 */
	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}

}
