package sec06_verify;

public class CloneExample {

	public static void main(String[] args) {
		
		
		Student stu=new Student("perpear","�Ȱ�����");
		System.out.println(stu);
		Student cloned=stu.getStudent(); 
        
        cloned.setnID(null);
        cloned.setSzName(null);
        System.out.println("Student�ν��Ͻ�2 : "+cloned);
   
	}
}
