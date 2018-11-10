package sec02_hashcode;

public class Key {

	int number;
	
	public Key(int number) {
		this.number=number;
	}
	
	//���� ������ ���� 1�������� ������ �ƴ϶�
	//���� ���Բ� �ؾߵȴ�.(Hash�ø���)
	@Override
	public int hashCode() {
		System.out.println("HashCode");
		return this.number;
	}
	
	//2�������� equals�� ȣ���ؼ� �� ���� �񱳸� �ؼ� ������ ���� �������� �����Ѵ�.
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals");
		if(obj instanceof Key) {
			Key comparekey=(Key)obj;//����ȯ
			//���� �ϴ� �κ�
			if(this.number==comparekey.number) {
				return true;
			}
		}
		return false;
	}
	
}
