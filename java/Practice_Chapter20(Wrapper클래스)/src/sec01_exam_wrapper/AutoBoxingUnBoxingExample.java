package sec01_exam_wrapper;

import java.util.List;
import java.util.Vector;

public class AutoBoxingUnBoxingExample {

	public static void main(String[] args) {
		
		
		//�ڵ� �ڽ�
		Integer obj=100;
		Integer obj1=new Integer(100);
		List<Integer> list=new Vector<Integer>();
		list.add(100);
		list.add(obj);
		list.add(obj1);
		System.out.println("value:"+obj);
		System.out.println("value1:"+obj.intValue());
	    System.out.println("value2:"+list.get(0));
	    System.out.println("Vector�� ����Ǿ� �ִ� ��:"+list.toString());
		list.toString();
		//���� �ڵ���ڽ�(���� �Ǿ� �ִ� 100�� ���ͼ� �⺻���� ����Ǵ� ��)
		//int value=obj.intvalue(); <===��Ȯ�� �ڵ��ڵ�
		int value=obj;
		System.out.println("value2:"+value);
		
		//������ �ڵ���ڽ�
		//��ü+�⺻��(���� ���� ���������� ���ΰ�ü�� �����Ϸ���
		//�˾Ƽ� �ڵ���ڽ��� ���־� �����Ѱ��̴�
		
		int result=obj+100;
		System.out.println("result:"+result);

	}

}
