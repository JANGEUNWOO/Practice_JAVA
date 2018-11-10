package sec03_exam_RepairableExample;


//1개만 추상메서드를 가지고 있는 인터페이스(함수적인터페이스)
public interface Repairable {

	void DamageUnit(Repairable r, int Damage);  //추상메서드
	
}
