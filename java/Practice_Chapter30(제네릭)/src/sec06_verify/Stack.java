package sec06_verify;

public class Stack<T> {
	int tos;
	int capacity;
	Object[] stck;

	public Stack(int capacity) {
		this.capacity = capacity;
		this.stck = (T[]) (new Object[capacity]);
	}

	public void push(T item) {

		try {

			stck[tos] = tos + 1 + "��° ��ü ��:" + item;
			tos++;
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("������ �� á�׿�! ��ü�� �� �־��!");
			System.out.println("���� �߻����� ���α׷��� ���� �����մϴ�.");
			System.out.println(e.toString());

		}

	}

	public T pop() {
		for (int i = 0; i < stck.length; i++) {
			if (stck[i] != null) {
				System.out.println(stck[i]);
			} else {
				System.out.println("������ ����׿�. ��ü�� ����� . Null�� ����ؿ�.");
				System.out.println(i+1+"��° ��ü ��: null");
			}
		}

		return null;
	}

}
