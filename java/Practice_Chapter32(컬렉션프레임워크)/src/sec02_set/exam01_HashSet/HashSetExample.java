package sec02_set.exam01_HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {

		Set<String> set = new HashSet<String>();

		// Set계열은 중복 저장이 안된다. 아울러 인덱스로 관리도 안된다.
		set.add("java");
		set.add("JDBC");
		set.add("sericlet/js[");
		set.add("java");
		set.add("ibatis");
		int size = set.size();

		// 결과가 4이다. 이유?

		System.out.println("총 객체수:" + size);
		// 반복자를 set을 통해서 얻는다.
		Iterator<String> iterator = set.iterator();
		// 가져올게 있느냐 있으면 true없으면 false
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		set.remove("jdbc");
		set.remove("ibatis");
		set.size();

		System.out.println();
		System.out.println("총 객체수:" + size);
		for (String element : set) {
			System.out.println("\t" + element);

		}
		set.clear();

		if (set.isEmpty()) {
			System.out.println("객체가 없음");
		} else {
			System.out.println("객체가 있음");
		}

	}

}
