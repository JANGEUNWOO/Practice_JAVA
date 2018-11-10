package sec05.exam05_treemap_sort;

import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample_Sort {

	public static void main(String[] args) {

		// 키로 Integer, 값으로 String을 사용
		TreeMap<Integer, String> scores = new TreeMap<Integer, String>();

		// map객체 5개를 무작위로 저장했지만, Treemap의 이진트리에 의해 자동 정렬이 된다.
		// scores.put(87, "홍길동"); 이렇게 작성해도 됨

		scores.put(new Integer(87), "홍길동");
		scores.put(new Integer(98), "신은혁");
		scores.put(new Integer(75), "김연아");
		scores.put(new Integer(95), "손연재");
		scores.put(new Integer(80), "김삼순");

		// 키를 가지고 내림차순을 한다. 하지만 리턴시에는 내림차순이 된 Map.Entry객체를 리턴한다.
		NavigableMap<Integer, String> descendingMap = scores.descendingMap();

		// 내림차순된 descendingMap의 entrySet을 얻어 Set에 대입한다.
		Set<Map.Entry<Integer, String>> descendingEntrySet = descendingMap.entrySet();

		// 내림차순된 Map.entry 객체를 하나씩 출력해본다.
		System.out.println("내림차순");
		for (Map.Entry<Integer, String> entry : descendingEntrySet) {
			int value = entry.getKey();
			String str = entry.getValue();
			System.out.println("키 : " + value + " - " + "값 : " + str);
		}
		System.out.println();

		// 내림차순이 되어있는 Map 컬렉션을 다시 내림차순으로 정렬하면 역으로 오름차순이 된다.
		NavigableMap<Integer, String> ascendingMap = descendingMap.descendingMap();

		// 오름차순 된 ascendingMap의 entrySet을 얻어 Set에 대입한다.
		Set<Map.Entry<Integer, String>> ascendingEntrySet = ascendingMap.entrySet();

		// 오름차순 된 Map.Entry객체를 하나씩 출력해본다.
		System.out.println("오름차순");
		for (Map.Entry<Integer, String> entry : ascendingEntrySet) {
			int value = entry.getKey();
			String str = entry.getValue();
			System.out.println("키 : " + value + " - " + "값 : " + str);
		}
		System.out.println();

		// 아래 부분은 키만 가져와서 반복자로 출력을 해보았다. 물론 내림차순이다
		NavigableSet<Integer> keySet = scores.descendingKeySet();
		Iterator<Integer> iterator = keySet.iterator();
		while (iterator.hasNext()) {
			int value = iterator.next();
			String str = scores.get(value);
			System.out.println("키 : " + value + " - " + "값 : " + str);
		}

	}
}
