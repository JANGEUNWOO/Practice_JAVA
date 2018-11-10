package sec_verify16;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {

		TreeSet<Student> treeSet = new TreeSet<Student>();

		treeSet.add(new Student("신은혁", 96));
		treeSet.add(new Student("김주성", 86));
		treeSet.add(new Student("김동주", 68));
		treeSet.add(new Student("이대호", 100));
		treeSet.add(new Student("김호주", 59));
		treeSet.add(new Student("이주희", 77));

		Iterator<Student> iterator = treeSet.iterator();
		while (iterator.hasNext()) {

			Student value = iterator.next();

			System.out.println("학생 이름:" + value.getName() + " , 성적:" + value.getScore());
		}
		
		
		//다른시도..
		Student maxgrade=treeSet.last();
		System.out.println("학생이름:"+Collections.max(treeSet).getName()
				+", 최고점수"+Collections.max(treeSet).getScore());
		System.out.println("학생이름:"+maxgrade.getName()+", 최고점수"+maxgrade.getScore());
		

	}

}
