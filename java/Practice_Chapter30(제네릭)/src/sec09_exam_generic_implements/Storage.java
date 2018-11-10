package sec09_exam_generic_implements;

public interface Storage<T> {
	// T라는 제네릭 타입을 지칭하는 메서드 물론, 추상메서드이다.
	public void add(T item, int index);

	// T를 index로 찾아오는 추상메서드
	public T get(int index);

}
