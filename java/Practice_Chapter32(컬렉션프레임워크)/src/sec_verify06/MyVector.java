package sec_verify06;

import java.util.Arrays;

public class MyVector {

	Object[] data = null;
	private int capacity = 0;
	private int size = 0;

	public MyVector(int capacity) {
		if (capacity < 0) {
			throw new IllegalArgumentException("��ȿ����" + capacity);
		}

		this.capacity = capacity;
		data = new Object[capacity];
	}

	public MyVector() {
		this(10);
	}

	// Vector�� ������� �Ⱥ������ �˻�
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

	// �ּ����� �������(capacity)�� Ȯ���ϴ� �޼���
	public void ensureCapacity(int minCapacity) {
		if (minCapacity - data.length > 0) {
			setCapacity(minCapacity);
		}
	}

	// ���ο� ��ü�� �����ϱ� ���� ������ ������ Ȯ������ ����
	public boolean add(Object obj) {
		ensureCapacity(size + 1); // �� ��ü �����ϱ� ���� ���� Ȯ��
		data[size++] = obj;
		return true;
	}

	// �ε����� �ش��ϴ� ��ü ����(��ȿ�� �˻�)
	public Object get(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("������ ������ϴ�.");
		}
		return data[index];
	}

	public Object remove(int index) {
		// �����ϰ��� �ϴ� ��ü�� ������ ��ü�� �ƴϸ�, �迭���縦 ���� ���ڸ��� ä����� �ϴ� ��� ������ size����.
		Object oldObj = null;

		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("������ ������ϴ�.");
		}
		oldObj = data[index];

		// �����Ϸ��� ��ü�� ������ ��ü�� �ƴ϶��, �迭 ���縦 ���� ���ڸ��� ä���� �Ѵ�.
		if (index != size - 1) {
			System.arraycopy(data, index + 1, data, index, size - index - 1);
		}

		// ������ �����͸� null. ������ ����� index = size-1
		data[size - 1] = null;
		size--;
		return oldObj;
	}

	public boolean remove(Object obj) {
		// ���� remove�޼��� �����ε�-��ü�� ������ ����(�� ����� ��ü ����)
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

	// �÷��� ��ü ��� null����� size 0�� ����
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
