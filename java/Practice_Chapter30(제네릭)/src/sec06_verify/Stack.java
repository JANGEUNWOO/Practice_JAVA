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

			stck[tos] = tos + 1 + "번째 객체 값:" + item;
			tos++;
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("스택이 꽉 찼네요! 객체를 못 넣어요!");
			System.out.println("예외 발생으로 프로그램을 정상 종료합니다.");
			System.out.println(e.toString());

		}

	}

	public T pop() {
		for (int i = 0; i < stck.length; i++) {
			if (stck[i] != null) {
				System.out.println(stck[i]);
			} else {
				System.out.println("스택이 비었네요. 객체가 없어요 . Null을 출력해요.");
				System.out.println(i+1+"번째 객체 값: null");
			}
		}

		return null;
	}

}
