package sec02_eaxm_final;

public class Person {

	final String nation = "korea"; // ��� ����
	final String ssn; // ��� ����
	String name;

	// final �ʱ�ȭ ���
	// 1. ����� ���ÿ� �ʱ�ȭ
	// 2. �����ڿ��� �� �ѹ� �ʱ�ȭ ����

	// �Ű������� �ִ� ������
	public Person(String ssn, String name) {
		// this�� ��ü �ڱ� �ڽ��� �ּ�(���������� ����) ���������� ����������� ������ �ϱ� ����
		this.ssn = ssn;
		this.name = name;
	}

}
