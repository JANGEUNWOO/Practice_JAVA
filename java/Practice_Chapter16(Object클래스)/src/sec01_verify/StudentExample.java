package sec01_verify;

import java.util.HashMap;

public class StudentExample {

	public static void main(String[] args) {
		
		
		HashMap<Student,String> hashMap=new HashMap<Student,String>();
		
		hashMap.put(new Student("1"), "95");
		hashMap.put(new Student("2"), "100");
		hashMap.put(new Student("3"), "12");
		
		String value=hashMap.get(new Student("1"));
		String value2=hashMap.get(new Student("2"));
		String value3=hashMap.get(new Student("3"));
		
		
		System.out.println("1번 학생의 점수: "+value);
		System.out.println("2번 학생의 점수: "+value2);
		System.out.println("3번 학생의 점수: "+value3);
		
	}
}
