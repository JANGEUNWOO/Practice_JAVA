package sec09_exam_generic_implements;

//�̆����̽��� ���׸� Ÿ���̸�, ������ü�� ���׸� Ÿ���̾�� �Ѵ�.
//(�������̽��� ������ �����̶�� ������ ����ߴ�)
public class StorageImpl<T> implements Storage<T> {

	private T[] array;

	// ������
	public StorageImpl(int capacity) {
		// T��� Ÿ���� �����Ǹ� �׋� �´� Ÿ�Կ� �迭�� capacity��ŭ �����ȴ�.
		array = (T[]) (new Object[capacity]);

	}

	// Storage<T>�� �����ϴ� �߻�޼��� ������ �κ�
	@Override
	public void add(T item, int index) {
		array[index] = item;
	}

	@Override
	public T get(int index) {
		return array[index];
	}

}
