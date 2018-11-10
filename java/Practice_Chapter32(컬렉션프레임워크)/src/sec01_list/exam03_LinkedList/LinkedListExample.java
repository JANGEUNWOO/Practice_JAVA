package sec01_list.exam03_LinkedList;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<String>();
		LinkedList<String> list2 = new LinkedList<String>();

		DecimalFormat df = new DecimalFormat("0,000");
		long startTime; // ���۰�
		long endTime; // ���ᰪ

		// startTime=System.nanoTime(); //10�� ���? -9�� �и�(-3)->����ũ��(-5)-->����(-9)

		startTime = System.currentTimeMillis(); // 10�Ǹ��?
		for (int i = 0; i < 100000; i++) {
			// ArrayList�� 0���� �ε����� ��������� 1�� ���Խ�Ų��.
			// STringŬ������ valueOf�� �����޼��带 ȣ���Ͽ� ���� STringȭ ��Ŵ
			list1.add(0, String.valueOf(i));
		}

		// endTime=System.nanoTime();
		endTime = System.currentTimeMillis();
		System.out.println("ArrayList�ɸ��ð�:" + df.format((endTime - startTime)) + "ms");

		// StartTime=System.nanoTime();
		startTime = System.currentTimeMillis(); // 10�� ���?
		for(int i=0;i<10000;i++) {
			list2.add(0,String.valueOf(i));
		}
		endTime=System.currentTimeMillis();
		System.out.println("LinkedList�ɸ��ð�:"+df.format((endTime-startTime))+"ms");
		//��������� �������� �߰� �� ���������� ArrayList���� LinkedList��
		//�ξ� ���� ������ �����Ѵ�.
	}

}
