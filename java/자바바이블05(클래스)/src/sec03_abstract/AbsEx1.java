package sec03_abstract;

public abstract class AbsEx1 {

	int a = 100; // 변수
	final String str = "abstract test"; // 상수

	public String getStr() { // 일반메서드
		return str;
	}

	// 추상 메서드는 몸체가 없다
	public abstract int getA();

}
