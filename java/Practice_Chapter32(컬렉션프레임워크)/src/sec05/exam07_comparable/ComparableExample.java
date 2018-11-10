package sec05.exam07_comparable;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeSet;

public class ComparableExample {

	public static void main(String[] args) {
		// Person �̶�� ����� ���� Ŭ������ �����ϴ� treeSet�� ����

		TreeSet<Person> treeSet = new TreeSet<Person>();

		// PersonŬ������ Comparable�������̽��� �����߱� ������
		// age�� ���� ������������ ������ �Ǿ� �ִ�.
		treeSet.add(new Person("������", 9));
		treeSet.add(new Person("ȫ�浿", 35));
		treeSet.add(new Person("�տ���", 19));
		treeSet.add(new Person("����", 19));
		treeSet.add(new Person("������", 25));
		treeSet.add(new Person("������", 21));
		treeSet.add(new Person("�չμ�", 29));
		treeSet.add(new Person("������", 51));
		treeSet.add(new Person("�ڰ���", 61));

		// ���������� ������ �� ���� �Ʒ��� ���� Ȯ�� ����
		// (�ݺ��ڸ� �� �ѹ� �������) ���ͷ����͵� ����غ���..
		// �׷��� ���� ���̶�� �ߺ� ���� ���� ����

		System.out.println("�� ��ü��:" + treeSet.size());
		for (Person person : treeSet) {
			String str = person.getName();
			int age = person.getAge();
			System.out.println("�̸�:" + str + " ����:" + age);
		}

		System.out.println();

		Iterator<Person> iterator = treeSet.descendingIterator();
		while (iterator.hasNext()) {
			Person value = iterator.next();
			System.out.println("�̸� :" + value.getName() + " ���� :" + value.getAge());
		}
		
		

	}

}
