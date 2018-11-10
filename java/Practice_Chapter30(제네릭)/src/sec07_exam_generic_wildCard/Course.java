package sec07_exam_generic_wildCard;

//������ ������ �� �ִ� ����� ���׸� Ÿ������ ������
//�ƿ﷯ � ����� ������ ���� �ƹ��� �𸣴� ������
public class Course<T> {

	private String name; // ������(ex. ����, ����, ����)
	private T[] students; // ������ ���� �� �ִ� ��������

	// ������
	public Course(String name, int capacity) {
		this.name = name;
		// �̰� �ȵ�. ���� TŸ���� ���� �ȵǾ��µ� �迭�� ���� ����� �ֳ���?
		// this.students=new T[capacity];
		// �� �κ� ���� ���� ������ �ؾ���. �̷��ڵ� ���� ����
		this.students = (T[]) (new Object[capacity]);
	}

	// ������ getter
	public String getName() {
		return this.name;
	}

	public T[] getStudents() {
		return this.students;
	}

	// ������ �߰� ������
	public void add(T t) {
		// ��� �ִ� ������ �������� �߰� �ϱ� ���� �ڵ�
		for (int i = 0; i < this.students.length; i++) {
			if (students[i] == null) {
				students[i] = t;
				break;
			}
		}
	}

}
