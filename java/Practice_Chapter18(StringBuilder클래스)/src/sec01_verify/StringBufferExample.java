package sec01_verify;

public class StringBufferExample {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("This");
		
		System.out.println("���� ��Ʈ������ sb ���:"+sb);
		System.out.println("��Ʈ������ sb�� �ؽ��� ��� :"+sb.hashCode());
		sb.append(" is pencil");
		System.out.println("������ ��Ʈ������ sb ��� : "+sb);
		sb.insert(8, "my ");
		System.out.println("������ ��Ʈ������ sb ��� : "+sb);
		sb.replace(8, 11, "your ");
		System.out.println("������ ��Ʈ������ sb ��� : "+sb);
		sb.delete(4, sb.length());
		System.out.println("���ڿ� ���̸� �����Ͽ� ������ ��Ʈ������ sb ��� :"+sb);
		System.out.println(sb.hashCode());
		//���ڿ� ���� �Ŀ��� �ؽ��ڵ尡 ������ ���� ��, 
		//��Ʈ�����۴� ���ο� �ν��Ͻ��� ������ �ƴ����� �˼� �ִ�.
		
		
		

	}

}
