package sec02_verify;

public class BowlExample {

	public static void main(String[] args) {

		System.out.println("Ÿ���Ķ���Ϳ� <String, String>���� ��ü ���� �� ���尪 �ҷ�����");
		Bowl<String, String> b1 = new Bowl<String, String>();
		b1.key = "�ڱ���";
		b1.value = "�����";
		System.out.println("�̸�:" + b1.getKey());
		System.out.println("����:" + b1.getValue());

		System.out.println("Ÿ���Ķ���Ϳ� <String, Integer>���� ��ü ���� �� ���尪 �ҷ�����");
		Bowl<String, Integer> b2 = new Bowl<String, Integer>();
		b2.key = "�ڱ���";
		b2.value = 65;
		System.out.println("�̸�:" + b2.getKey());
		System.out.println("����:" + b2.getValue());

	}

}
