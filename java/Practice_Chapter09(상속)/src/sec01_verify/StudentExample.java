package sec01_verify;

import java.util.Scanner;

public class StudentExample {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	
	System.out.print("�й��� �Է��ϼ��� : ");
	String a=scanner.next();
    
    System.out.print("�̸��� �Է��ϼ��� : ");
	String b=scanner.next();
	Student ab= new Student(a,b);
	System.out.println(ab);
    
	
 }
	
	
}
