package sec02_exam_generic_type;

//Box클래스를 제네릭타입으로 설계
public class Box<T> {

	private T t;

	// setter
	public void set(T t) {
		this.t = t;
	}

	// getter
	public T get() {
		return this.t;
	}

}
