package sec_verify01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(4);
		list.add(-1);
		
		System.out.println("ArrayList 내의 요소 객체 수 :"+list.size());
		
		list.add(2,-775);
		list.add(3, 100);
		
		for (int i = 0; i < list.size(); i++) {
			if (i == list.size() - 1)
				System.out.println(list.get(i));
			else
				System.out.println(list.get(i));
		}
		
		int sum=0;
		for(int i=0 ; i<list.size();i++) {
			
			sum+=list.get(i);
			
		}
		System.out.println("ArrayList 내에 있는 정수들의 합 :"+sum);
		
	}

}
