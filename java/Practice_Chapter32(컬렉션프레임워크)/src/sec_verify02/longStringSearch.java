package sec_verify02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class longStringSearch {

	private ArrayList<String> stringList = new ArrayList<>();

	public longStringSearch(int var) {

		System.out.println(var + "만큼의 ArrayList가 생성되었습니다.");

	}

	public void addString(String name) {
		stringList.add(name);

	}

	public void listPrint() {
		System.out.println("ArrayList에 들어 있는 모든 이름을 출력합니다.");
		for (int i = 0; i < stringList.size(); i++) {
			System.out.println(i + 1 + "번째 ArrayList객체 값 :" + stringList.get(i));
		}

	}

	public void longestString() {

		int longestIndex = 0;
		for (int i = 1; i < stringList.size(); i++) {
			if (stringList.get(longestIndex).length() < stringList.get(i).length())
				longestIndex = i;
		}
		System.out.println("가장 긴 이름은 : " + stringList.get(longestIndex));

	}

	public ArrayList<String> getStringList() {
		return stringList;
	}

}
