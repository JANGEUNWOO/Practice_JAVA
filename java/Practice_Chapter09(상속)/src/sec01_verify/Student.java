package sec01_verify;

public class Student extends Person {
    
	private String S_num;
	
	Student(String P_num, String S_num){
		super(P_num);
		this.S_num=S_num;
		
	}
	

	public String toString() {
		return "이름:"+super.P_name+"\n학번:"+S_num;
	}
}
