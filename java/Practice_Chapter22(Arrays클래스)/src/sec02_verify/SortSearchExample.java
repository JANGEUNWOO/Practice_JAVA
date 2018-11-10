package sec02_verify;

import java.util.Arrays;
import java.util.Scanner;

class Student implements Comparable<Student>{
	private String hakbun;
	private String name;

	
	public String gethakbun() {
		return hakbun;
	}
	
	public String getname() {
		return name;
	}
	
	public Student(String hakbun, String name) {
		this.hakbun=hakbun;
		this.name=name;
	}
	@Override
	public int compareTo(Student o) {
		return o.hakbun.compareTo(this.hakbun);
	}
}

public class SortSearchExample {

	private static Scanner sc;

	static Student findstu(Student[] arr, String search) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i].gethakbun().equals(search)) {
				return arr[i];
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		
		
		sc = new Scanner(System.in);
		System.out.print("�л����� �Է��ϼ��� >>");
		Student[] arr=new Student[sc.nextInt()];
	
		for(int i=0;i<arr.length;i++) {
			
			System.out.print("["+i+"]��° �л� �й�:");
			String hakbun=sc.next();
			System.out.print("["+i+"]��° �л� �̸�:");
			String name=sc.next();
			arr[i]=new Student(hakbun,name);
		}
		
		System.out.println("------------------------------");
		

        Arrays.sort(arr);
		int i=0;
		for(Student j :arr) {
			
			System.out.println("�й�["+i+"]="+j.gethakbun()+"\t�̸�["+i+"]="+j.getname());
			i++;
		}
			
		System.out.println("------------------------------");
		
		System.out.print("ã�� ���� �л��� �й� : ");
		String input3=sc.next();
		Student key = SortSearchExample.findstu(arr, input3);
		int hak=Arrays.binarySearch(arr, key);
		System.out.println(arr[hak].getname()+"�л��� "+hak+"��° �濡 �ֽ��ϴ�.");

	}
}
