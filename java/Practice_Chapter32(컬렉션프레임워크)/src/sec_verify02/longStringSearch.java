package sec_verify02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class longStringSearch {

	private ArrayList<String> stringList = new ArrayList<>();

	public longStringSearch(int var) {

		System.out.println(var + "��ŭ�� ArrayList�� �����Ǿ����ϴ�.");

	}

	public void addString(String name) {
		stringList.add(name);

	}

	public void listPrint() {
		System.out.println("ArrayList�� ��� �ִ� ��� �̸��� ����մϴ�.");
		for (int i = 0; i < stringList.size(); i++) {
			System.out.println(i + 1 + "��° ArrayList��ü �� :" + stringList.get(i));
		}

	}

	public void longestString() {

		int longestIndex = 0;
		for (int i = 1; i < stringList.size(); i++) {
			if (stringList.get(longestIndex).length() < stringList.get(i).length())
				longestIndex = i;
		}
		System.out.println("���� �� �̸��� : " + stringList.get(longestIndex));

	}

	public ArrayList<String> getStringList() {
		return stringList;
	}

}
