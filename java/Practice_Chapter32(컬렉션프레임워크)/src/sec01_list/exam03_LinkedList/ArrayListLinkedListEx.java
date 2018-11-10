package sec01_list.exam03_LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListLinkedListEx {

	public static void main(String[] args) {

		ArrayList<String> a1 = new ArrayList<String>(1000000);
		LinkedList<String> l1 = new LinkedList<String>();

		add(a1);
		add(l1);

		System.out.println("=접근시간테스트=");
		System.out.println("ArrayList:" + access(a1));
		System.out.println("LinkedList:" + access(l1));

	}

	public static void add(List<String> list) {
		for (int i = 0; i < 10000; i++) {
			list.add(i + "");
		}

	}

	public static long access(List<String> list) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) 
			list.get(i);
		
		long end = System.currentTimeMillis();
		return end - start;
	}

}
