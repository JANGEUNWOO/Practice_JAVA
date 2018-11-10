package sec01_verify;

import java.util.Scanner;

public class StudentExample {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	
	System.out.print("학번을 입력하세요 : ");
	String a=scanner.next();
    
    System.out.print("이름을 입력하세요 : ");
	String b=scanner.next();
	Student ab= new Student(a,b);
	System.out.println(ab);
    
	
 }
	
	
}
