package sec02_hashcode;

public class Key {

	int number;
	
	public Key(int number) {
		this.number=number;
	}
	
	//논리적 동등을 위해 1차적으로 번지가 아니라
	//값이 같게끔 해야된다.(Hash시리즈)
	@Override
	public int hashCode() {
		System.out.println("HashCode");
		return this.number;
	}
	
	//2차적으로 equals를 호출해서 값 또한 비교를 해서 같으면 논리적 동등으로 인정한다.
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals");
		if(obj instanceof Key) {
			Key comparekey=(Key)obj;//형변환
			//값비교 하는 부분
			if(this.number==comparekey.number) {
				return true;
			}
		}
		return false;
	}
	
}
