package sec_verify16;

public class Student implements Comparable<Student> {

	private String name;
	private int score;

	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

	@Override
	public int compareTo(Student o) {
		if (o.score == this.score) {
			return 0;
		} else if (o.score > this.score) {
			return -1;
		} else {
			return 1;
		}

	}

}
