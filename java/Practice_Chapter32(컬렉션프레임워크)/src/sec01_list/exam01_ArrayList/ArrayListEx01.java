package sec01_list.exam01_ArrayList;

import java.util.ArrayList;

public class ArrayListEx01 {

	public static void main(String[] args) {
		/*
		 * ArrayList는 원래 제네릭 타입이다. 그래서 Warning이 뜬다. 굳이 없애고 싶다면 Quick Access에서 Error를
		 * 입력하고 Preference 에 가서 Generics탭에 있는 것을 모두 ignore로 바꾸면 된다.
		 */
		ArrayList list = new ArrayList(); // 기본적으로 10개의 방을 생성함

		// System.out.println(list.ensureCapacity());

		System.out.println("총 크기 : " + list.size());
		list.add("111"); // boolean add(Object o) -- 맨끝 인덱스에 추가한다.
		list.add("222");
		list.add("333");
		list.add("222");

		// add(new Integer(333)); JKD 1.5부터 추가된 자동박싱기능 이용(래퍼클래스)
		list.add(333);

		System.out.println("총 크기 : " + list.size());
		System.out.println("ArrayList의 주소:"+list.hashCode());
		System.out.println("ArrayList에 있는 값 : " + list.toString());

		// 0번째 인덱스에 새로 값을 넣으면 기존의 값들은 뒤로 밀려나게 된다.
		list.add(0, "333");
		System.out.println("ArrayList의 주소:"+list.hashCode());
		System.out.println("ArrayList에 있는 값 : " + list.toString());

		// 앞에서 부터 검색하여 "333"을 삭제한다.(가까운 것 한 개만 삭제)
		// boolean remove(Object o)
		list.remove("333");
		System.out.println("ArrayList의 주소:"+list.hashCode());
		System.out.println("ArrayList에 있는 값 : " + list.toString());

		System.out.println(list.remove("333")); // 결과가 true가 나오는 이유가?

		// indexOf()의 결과가 -1이라는 것은 ArrayList에 "333"이 없다는 것이다.
		System.out.println("index = " + list.indexOf("333"));

		// 기본적으로 10개의 방을 넘어서면 또다시 10개의 방을 만든다.
		/*
		 * list.add("111"); list.add("111"); list.add("111"); list.add("111");
		 * list.add("111"); list.add("111"); list.add("111"); list.add("111");
		 * list.add("111"); list.add("111");
		 */
		// System.out.println("총 크기 : " + list.size());

		// ArrayList의 각 인덱스의 값 저장(set(index, Object)이용)
		for (int i = 0; i < list.size(); i++) {
			list.set(i, i + "");
		}

		// ArrayList의 각 인덱스의 값 출력(get(index)이용)
		System.out.print("{");
		for (int i = 0; i < list.size(); i++) {
			if (i == list.size() - 1)
				System.out.print(list.get(i));
			else
				System.out.print(list.get(i) + ",");
		}
		System.out.println("}");

		// ArrayList의 각 인덱스의 값 삭제 remove(index)이용
		for (int i = 0; i < list.size(); i++) {
			list.remove(i);
		}

		// System.out.println(list);

		/*
		 * 다 삭제를 했음에도 불구하고 1,3이 남아 있다. 왜일까? 0을 삭제할때는 i가 0이니 당연히 삭제가 된다. 하지만, 0이 삭제된후 뒤에
		 * 값들은 다 앞으로 당겨져 올것이다. 그럼 다음 것을 삭제할려고 보니 i값은 1이다. 하여 1을 삭제하지않고 2를 삭제하는 것이다. 그림으로
		 * 그려보면 잘 이해가 될 것이다. 이해가 되었으면 ArrayList는 인덱스를 뒤에서부터 삭제를 해야 제대로 삭제가 됨을 알수가 있다.
		 */
		System.out.println(list);

		// 아래와 같이 삭제를 하면 ArrayIndexOutofBoundsException이 발생한다. 왜일까?
		/*
		 * for(int i=list.size(); i>=0; i--) { list.remove(i); }
		 * System.out.println(list);
		 */

		// 배열은 0부터 시작되는 것을 알고 있다.
		// 그래서 아래와 같이 해줘야 예외가 발생하지 않는다.
		for (int i = list.size() - 1; i >= 0; i--) {
			list.remove(i);
		}
		System.out.println(list);
	}
}
