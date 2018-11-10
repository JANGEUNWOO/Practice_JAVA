package sec_verify16;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {

		TreeSet<Student> treeSet = new TreeSet<Student>();

		treeSet.add(new Student("������", 96));
		treeSet.add(new Student("���ּ�", 86));
		treeSet.add(new Student("�赿��", 68));
		treeSet.add(new Student("�̴�ȣ", 100));
		treeSet.add(new Student("��ȣ��", 59));
		treeSet.add(new Student("������", 77));

		Iterator<Student> iterator = treeSet.iterator();
		while (iterator.hasNext()) {

			Student value = iterator.next();

			System.out.println("�л� �̸�:" + value.getName() + " , ����:" + value.getScore());
		}
		
		
		//�ٸ��õ�..
		Student maxgrade=treeSet.last();
		System.out.println("�л��̸�:"+Collections.max(treeSet).getName()
				+", �ְ�����"+Collections.max(treeSet).getScore());
		System.out.println("�л��̸�:"+maxgrade.getName()+", �ְ�����"+maxgrade.getScore());
		

	}

}
