package sec01_list.exam03_LinkedList;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<String>();
		LinkedList<String> list2 = new LinkedList<String>();

		DecimalFormat df = new DecimalFormat("0,000");
		long startTime; // 시작값
		long endTime; // 종료값

		// startTime=System.nanoTime(); //10의 몇승? -9승 밀리(-3)->마이크로(-5)-->나노(-9)

		startTime = System.currentTimeMillis(); // 10의몇승?
		for (int i = 0; i < 100000; i++) {
			// ArrayList의 0번쨰 인덱스에 계속적으로 1을 삽입시킨다.
			// STring클래스의 valueOf의 정적메서드를 호출하여 값을 STring화 시킴
			list1.add(0, String.valueOf(i));
		}

		// endTime=System.nanoTime();
		endTime = System.currentTimeMillis();
		System.out.println("ArrayList걸린시간:" + df.format((endTime - startTime)) + "ms");

		// StartTime=System.nanoTime();
		startTime = System.currentTimeMillis(); // 10의 몇승?
		for(int i=0;i<10000;i++) {
			list2.add(0,String.valueOf(i));
		}
		endTime=System.currentTimeMillis();
		System.out.println("LinkedList걸린시간:"+df.format((endTime-startTime))+"ms");
		//비순차적인 데이터의 추가 및 삭제에서는 ArrayList보다 LinkedList가
		//훨씬 좋은 성능을 발휘한다.
	}

}
