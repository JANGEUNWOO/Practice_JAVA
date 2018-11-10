package sec01_verify;

public class Student {

	
	private String studentNum;
	
	public Student(String studentNum) {
		this.studentNum=studentNum;
	}
	
	public String getStudentNum() {
		return studentNum;
	}

	@Override
	public int hashCode() { 
		return Integer.parseInt(this.studentNum);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student=(Student)obj;
			if(this.studentNum==student.studentNum) {
				return true;
			}
			
		}
		return false;
	}
}
