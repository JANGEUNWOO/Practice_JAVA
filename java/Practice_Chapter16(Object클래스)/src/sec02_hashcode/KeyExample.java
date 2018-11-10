package sec02_hashcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class KeyExample {

	public static void main(String[] args) {
		// HashMap은 어떠한 Key 데이터를 저장하는 컬렉션
		HashMap<Key,String> hashMap=new HashMap<Key,String>();
		hashMap.put(new Key(2), "홍길동");
		
		//HashMap, HashSet, HashTable, LinkedHashSet(컬렉션(List계열, TreeSet제외)은
		//equals를 호출하기 전에 hashCode()를 먼저 호출한다.
		//그렇기 때문에, new를 통해 key인스터스를 만들었으므로, 각기 힙에 저장되는 번지가
		//달라 원하는 값을 주지 아니한다.
		//원하는 값을 얻기 위해서는 Object클래스의 hashCode()를 재정의를 해서 값이
		//같을때 1차 논리적 동등을 인정한다
		//그리고 equals()를 재정의하여 그 값을 같게 함으로써 동등객체가 되어 원하는 값이 나온다.
		String value=hashMap.get(new Key(2));
		String value1=new String("홍길동");
		String value2=new String("홍길동");
	    System.out.println(value);
	    System.out.println(value.hashCode()+" "+value2.hashCode());
	    
	    List<Key> list=new ArrayList<Key>();
	    list.add(new Key(10));
	    list=new LinkedList<Key>();
	    list.add(new Key(10));
	    Set<Key> set= new LinkedHashSet<Key>();
	    set.add(new Key(10));
	}

}
