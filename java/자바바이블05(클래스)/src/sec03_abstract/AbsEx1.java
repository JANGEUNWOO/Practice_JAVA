package sec03_abstract;

public abstract class AbsEx1 {

	int a = 100; // ����
	final String str = "abstract test"; // ���

	public String getStr() { // �Ϲݸ޼���
		return str;
	}

	// �߻� �޼���� ��ü�� ����
	public abstract int getA();

}
