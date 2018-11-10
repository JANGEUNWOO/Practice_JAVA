package sec_verify06;

import java.util.Arrays;

public class MyVector {

	Object[] data = null;
	private int capacity = 0;
	private int size = 0;

	public MyVector(int capacity) {
		if (capacity < 0) {
			throw new IllegalArgumentException("유효안함" + capacity);
		}

		this.capacity = capacity;
		data = new Object[capacity];
	}

	public MyVector() {
		this(10);
	}

	// Vector가 비었는지 안비었는지 검사
	public boolean isEmpty() {
		if (this.capacity != 0) {
			return true;
		} else {
			return false;
		}
	}

	public int capacity() {
		return capacity;
	}

	public int size() {
		return size;
	}

	// 최소한의 저장공간(capacity)를 확보하는 메서드
	public void ensureCapacity(int minCapacity) {
		if (minCapacity - data.length > 0) {
			setCapacity(minCapacity);
		}
	}

	// 새로운 객체를 저장하기 전에 저장할 공간을 확보한후 저장
	public boolean add(Object obj) {
		ensureCapacity(size + 1); // 새 객체 저장하기 전에 공간 확보
		data[size++] = obj;
		return true;
	}

	// 인덱스에 해당하는 객체 리턴(유효성 검사)
	public Object get(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("범위를 벗어났습니다.");
		}
		return data[index];
	}

	public Object remove(int index) {
		// 삭제하고자 하는 객체가 마지막 객체가 아니면, 배열복사를 통해 빈자리를 채워줘야 하는 기능 구현후 size감소.
		Object oldObj = null;

		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("범위를 벗어났습니다.");
		}
		oldObj = data[index];

		// 삭제하려는 객체가 마지막 객체가 아니라면, 배열 복사를 통해 빈자리를 채워야 한다.
		if (index != size - 1) {
			System.arraycopy(data, index + 1, data, index, size - index - 1);
		}

		// 마지막 데이터를 null. 마지막 요소의 index = size-1
		data[size - 1] = null;
		size--;
		return oldObj;
	}

	public boolean remove(Object obj) {
		// 위의 remove메서드 오버로딩-객체를 가지고 삭제(젤 가까운 객체 삭제)
		for (int i = 0; i < size; i++) {
			if (obj.equals(data[i])) {
				remove(i);
				return true;
			}
		}
		return false;
	}

	private void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	// 컬렉션 객체 모두 null만들고 size 0로 설정
	public void clear() {

		for (int i = 0; i < size; i++) {
			data[i] = null;
		}
		size = 0;
	}

	@Override
	public String toString() {
		Object[] tmp = new Object[this.size];
		System.arraycopy(data, 0, tmp, 0, this.size);
		return Arrays.toString(tmp);
	}

}
