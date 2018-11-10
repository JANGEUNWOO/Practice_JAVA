package sec07_exam_generic_wildCard;

//과정을 수강할 수 있는 대상을 제네릭 타입으로 선언함
//아울러 어떤 대상이 구상을 할지 아무도 모르는 상태임
public class Course<T> {

	private String name; // 과정명(ex. 국어, 수학, 토익)
	private T[] students; // 과정당 들을 수 있는 수강생수

	// 생성자
	public Course(String name, int capacity) {
		this.name = name;
		// 이거 안됨. 아직 T타입이 결정 안되었는데 배열을 어찌 만들수 있나요?
		// this.students=new T[capacity];
		// 이 부분 필히 보고 숙지를 해야함. 이런코드 자주 등장
		this.students = (T[]) (new Object[capacity]);
	}

	// 과정명 getter
	public String getName() {
		return this.name;
	}

	public T[] getStudents() {
		return this.students;
	}

	// 수강생 추가 시켜줌
	public void add(T t) {
		// 비어 있는 공간에 수강생을 추가 하기 위한 코드
		for (int i = 0; i < this.students.length; i++) {
			if (students[i] == null) {
				students[i] = t;
				break;
			}
		}
	}

}
