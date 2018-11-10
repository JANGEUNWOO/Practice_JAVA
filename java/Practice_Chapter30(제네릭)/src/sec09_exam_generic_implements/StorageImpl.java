package sec09_exam_generic_implements;

//이넡페이스가 제네릭 타입이면, 구현객체도 제네릭 타입이어야 한다.
//(인터페이스도 일종의 조상이라고 수차례 언급했다)
public class StorageImpl<T> implements Storage<T> {

	private T[] array;

	// 생성자
	public StorageImpl(int capacity) {
		// T라는 타입이 결정되면 그떄 맞는 타입에 배열이 capacity만큼 생성된다.
		array = (T[]) (new Object[capacity]);

	}

	// Storage<T>에 존재하는 추상메서드 재정의 부분
	@Override
	public void add(T item, int index) {
		array[index] = item;
	}

	@Override
	public T get(int index) {
		return array[index];
	}

}
