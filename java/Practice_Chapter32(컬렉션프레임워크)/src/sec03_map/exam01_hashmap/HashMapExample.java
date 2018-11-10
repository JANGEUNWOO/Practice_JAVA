package sec03_map.exam01_hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		// 키가 String, 값이 Integer타입 여기서 둘다 객체라는 것에 주목하자.
		Map<String, Integer> map = new HashMap<String, Integer>();
		/*
		 * map컬렉션에 키와 값을 넣고 있다."홍길동"키가 2번 코딩이 되어있는데, map은 중복된 키를 저장하지 않는다.하여, 마지막에 put이
		 * 된 것으로 대체가 됨을 주목하자. 또한 여기서는 String타입이기 때문에 따로 hashcode()와 equals()를 재정의 하지 않아도
		 * 된다.(이미 구현 되어있다.)
		 */

		map.put("신은혁", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95); //홍길동의 key값은 중복안됨.. 단 value값은 덮어쓴다..

		// 3개가 나오는 것을 볼수 있다.
		System.out.println("총 MapEntry 수 : " + map.size());

		// 새로운 홍길동키와 95라는 값으로 대체됨.
		System.out.println("홍길동 : " + map.get("홍길동"));
		System.out.println();

		// map컬렉션의 key만 Set으로 바꾼다.
		Set<String> keySet = map.keySet();
		// keySet에 대한 반복자(Iterator)를 얻는다.
		Iterator<String> keyIterator = keySet.iterator();

		System.out.println("keySet을 이용해서 출력함.");
		// 가져올 키가 있느냐?
		while (keyIterator.hasNext()) {
			// 키가 String타입이니까 String으로 받는다.
			String key = keyIterator.next();
			// 얻은 키로 값을 얻어온다(값이 Integer, 언박싱)
			int value = map.get(key);
			System.out.println("\t" + key + ":" + value);
		}
		System.out.println();

		// 키가 홍길동인 MapEntry를 삭제한다.
		map.remove("홍길동");
		// System.out.println("홍길동 : " + map.get("홍길동"));
		// 2개가 나오는 것을 볼수 있따.
		System.out.println("총 MapEntry 수 : " + map.size());
		System.out.println();

		// map 컬렉션의 Map.Entry객체를 대상으로 Set으로 바꾼다.
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		// entrySet에 대한 반복자를 얻는다.
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();

		System.out.println("entrySet이용해서 출력함.");
		// 가져올 게 있느냐?
		while (entryIterator.hasNext()) {
			// 가지고 와라.
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey(); // Map.entry의 key객체를 얻는다.
			int value = entry.getValue(); // Map.entry의 value객체를 얻는다.
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		// 전체 객체 삭제
		map.clear();
		System.out.println("총 MapEntry 수 : " + map.size());
	}
}
