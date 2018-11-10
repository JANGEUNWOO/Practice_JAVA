package sec05.exam08_comparator;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparatorExample {

	public static void main(String[] args) {
		// Fruit ��������� Ŭ������ ������ treeSEt�� ������. ��, ������ ���� Comparator<>�� �������ش�.
		TreeSet<Fruit> treeSet = new TreeSet<Fruit>(new AscendingComparator());
		// treeSEt�� Fruit��ü�� �߰��Ѵ�.
		// ���⼭ FruitŬ������ Comparable<>�������̽��� �������� �ʰų�, Comparable<>��
		// �������� ������ ClassCastException �� �߻��Ѵ�.

		// try
		treeSet.add(new Fruit("����", 6500));
		treeSet.add(new Fruit("����", 4200));
		treeSet.add(new Fruit("������", 3500));
		treeSet.add(new Fruit("�ٳ���", 3400));
		treeSet.add(new Fruit("�ڵ�", 2500));
		treeSet.add(new Fruit("ȣ��", 1001));
		// catch(Exception e){
		// System.out.println("���� ������ ����");
		// e.getMessage();
		// }
		System.out.println("�� ��ü��:" + treeSet.size());
		// �ݺ��ڸ� ��´�.
		Iterator<Fruit> iterator = treeSet.iterator();
		while (iterator.hasNext()) {
			Fruit fruit = iterator.next();
			System.out.println(fruit.getName() + ":" + fruit.getPrice());
		}

	}

}
