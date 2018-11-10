package sec05.exam04_treemap_method;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		// Ű�� Integer������ StringŸ���� ���

		TreeMap<Integer, String> scores = new TreeMap<>();

		// map��ü 5���� �������� ����������, treeMap�� ����Ʈ���� ���ؼ�
		// �ڵ������� �ȴ�.
		// scores.put(87,"ȫ�浿"); �̷��� �ۼ��ص� �Ǵ� �� �˰��ִ�.
		scores.put(87, "ȫ�浿");
		scores.put(98, "������");
		scores.put(75, "�迬��");
		scores.put(95, "�տ���");
		scores.put(80, "����");

		Map.Entry<Integer, String> entry = null;
		// ����Ʈ�� �� ���� ���� ��, Ű�ǰ��� ���� ���� ���� �����´�.
		entry = scores.firstEntry();
		System.out.println("���� ��������:" + entry.getKey() + "-" + entry.getValue());
		System.out.println();
		// ����Ʈ�� �� ���� ������ ��, Ű�� ���� ���� ���� ���� �����´�.
		entry = scores.lastEntry();
		System.out.println("���� ���� ����:" + entry.getKey() + "-" + entry.getValue());
		System.out.println();
		// ����Ʈ���� �־��� ��ü ��,95������ ���� Entry�� �����Ѵ�(95���� �������� �ʴ´�.)
		entry = scores.lowerEntry(95);
		System.out.println("95�� �ٷ� �Ʒ� ����(������):" + entry.getKey() + "-" + entry.getValue());
		System.out.println();
		// ����Ʈ���� �־��� ��ü ��,95������ ū Entry�� �����Ѵ�.
		// (95���� �������� �ʴ´�.)
		entry = scores.higherEntry(95);
		System.out.println("95���̰ų� �ٷ� �� ����:" + entry.getKey() + "-" + entry.getValue());
		System.out.println();
		// ����Ʈ���� �־��� ��ü ��,95������ ���� Entry�� �����Ѵ�.
		// (95���� �����Ѵ�)
		entry = scores.floorEntry(95);
		System.out.println("95���̰ų� �ٷ� �Ʒ� ����(����):" + entry.getKey() + "-" + entry.getValue());
		System.out.println();

		// ����Ʈ�� �� �־��� ��ü ��,95������ ū Entry�� �����Ѵ�.(95���� �����Ѵ�.)
		entry = scores.ceilingEntry(95);
		// entry=scores.ceilingEntry(96);
		entry = scores.higherEntry(95);
		System.out.println("95���̰ų� �ٷ� �� ����(����):" + entry.getKey() + "-" + entry.getValue());
		System.out.println();

		while (!scores.isEmpty()) {
			// ���� treeSet�� �����ϰ� pillFirstEntry()�� treeMap����
			// ���� ���� ����entry�� �������� map���� �����Ѵ�. �ø�����
			entry = scores.pollFirstEntry();
			int value = entry.getKey();
			String str = entry.getValue();
			System.out.println("Ű:" + value + "- ��:" + str + "(�����ִ� ��ü�� : " + scores.size() + ")");
		}

		/*
		 * while(!scores.isEmpty()) { //���� treeSet�� �����ϰ� pollLastEntry()�� treeMap���� //����
		 * ���� ����Entry�� �������� map���� �����Ѵ�. �������� entry=scores.pollFirstEntry(); int value =
		 * entry.getKey(); String str=entry.getValue();
		 * System.out.println("Ű:"+value+"- ��:"+str+ "(�����ִ� ��ü�� : "+scores.size()+")");
		 * }
		 */

		// treeMap�� ���� keySet�� ���, �ݺ��ڸ� ���� �� ��ü��ü�� ����غ�
		// ���� ���̰� �ִ°���, �ݺ��ڸ� ���� ��� ����ϴ� ���� treeMap����
		// ��ü�� ���Ű� �ȵ��� �˵��� ����.

		/*
		 * Set<Integer> keySet=scores.keySet(); Iterator<Integer>
		 * iterator=keyset.iterator(); while(iterator.hasNext()) { int value =
		 * iterator.next(); String str=scores.get(value); //��������� ȣ�������ν� treeMap���� ���Ÿ� ��
		 * ��������. //iterator.remove(); System.out.println("Ű:"+value+"- ��:"+str+
		 * "(�����ִ� ��ü�� : "+scores.size()+")"); }
		 */

		// treeMap�� ���� Map.entrySet�� ���, �ݺ��ڸ� ���� �� ��ü ��ü�� ����غ�.
		// ���� ���̰� �ִ� ����, �ݺ��ڸ� ���� ��� ����ϴ� ���� treeMap���� ��ü�� ���Ű�
		// �ȵ��� �˵��� ����.
		/*
		 * Set<Map.Entry<Integer, String>> entrySet=scores.entrySet();
		 * Iterator<Map.Entry<Integer, String>> iterator=entryset.iterator();
		 * while(iterator.hasNext()) { Map.Entry<Integer, String>
		 * mapentry=iterator.next(); int value=mapentry.getKey(); String
		 * str=mapentry.getValue(); //iterator.remove(); //��������� ȣ�������ν� ������
		 * System.out.println("Ű:"+value+"- ��:"+str+ "(�����ִ� ��ü�� : "+scores.size()+")");
		 * }
		 */

	}

}