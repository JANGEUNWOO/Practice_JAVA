package sec06_verify;

public class StackExample {

	public static void main(String[] args) {

		Stack<String> s1 = new Stack<String>(10);

		s1.push("���");
		s1.push("����");
		s1.push("����");
		s1.push("â��");
		s1.push("����");
		s1.push("��ǳ");
		s1.push("�뱸");
		s1.push("����");
		s1.push("�λ�");
		s1.push("����");
		s1.push("�ٿ�");
		System.out.println("stringStack�� push�� ��ü�� pop()�� ���� ������½��ϴ�");
		s1.pop();
		System.out.println("");

		Stack<Integer> s2 = new Stack<Integer>(10);
		s2.push(-55);
		s2.push(1005);
		s2.push(665);
		s2.push(528);
		s2.push(770);
		s2.push(150);
		s2.push(301);
		s2.push(111);
		System.out.println("intStack�� push�� ��ü�� pop()�� ���� ������½��ϴ�");
		s2.pop();

	}

}
