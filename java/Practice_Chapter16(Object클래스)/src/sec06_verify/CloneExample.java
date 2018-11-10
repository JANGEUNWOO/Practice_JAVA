package sec06_verify;

public class CloneExample {

	public static void main(String[] args) {
		
		
		Student stu=new Student("perpear","안경잡이");
		System.out.println(stu);
		Student cloned=stu.getStudent(); 
        
        cloned.setnID(null);
        cloned.setSzName(null);
        System.out.println("Student인스턴스2 : "+cloned);
   
	}
}
