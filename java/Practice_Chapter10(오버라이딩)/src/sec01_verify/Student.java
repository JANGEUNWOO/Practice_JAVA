package sec01_verify;

public class Student extends People {

	int studentNo;
	
	Student(String name,String ssn,int studentNo){
		super(name, ssn);
		this.studentNo=studentNo;
	}
	
	
}
