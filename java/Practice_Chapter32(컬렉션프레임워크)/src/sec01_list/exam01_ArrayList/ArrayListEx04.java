package sec01_list.exam01_ArrayList;

import java.util.List;
import java.util.ArrayList;

public class ArrayListEx04 {

	public static void main(String[] args) {

		final int LIMIT = 10; // 자르고자 하는 즐자의 개수를 지정한다.
		String source = "01234357567dvshgshjdvbhsjd7r57346";
		int length = source.length();

		// 크기를 약간 여유있게 잡는다.
		List list = new ArrayList(length / LIMIT + 10);

		for (int i = 0; i < length; i += LIMIT) {
			if (i + LIMIT < length) {
				list.add(source.substring(i, i + LIMIT));
			} else {
				list.add(source.substring(i));
			}
		}

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	}

}
