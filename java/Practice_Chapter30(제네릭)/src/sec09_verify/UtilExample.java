package sec09_verify;

public class UtilExample {

	public static void main(String[] args) {
		Pair<String,Integer> p=new Pair<>("ȫ�浿",35);
		Pair<String,Integer> p1=new ChildPair<>("ȫ���",30);
		OtherPair<String,Integer> p2=new OtherPair<String, Integer>("�ٹ�", 11);
		
		System.out.println("Pair�� ��ü�� �����Ҷ�, Util�� getValue()�� ȣ���Ҷ� K�� ȫ�浿 �ְ� ����� V�� : "+Util.getValue(p,"ȫ�浿"));
		System.out.println("ChildPair�� ��ü �����Ҷ� K�� ȫ���, Util�� getValue()�� ȣ���� �� K�� ȫ��� �ְ� ����� V�� : "+Util.getValue(p1,"ȫ���"));
		//System.out.println("�Ϲݿ��ܻ��"+Util.getValue(p2,"�ٹ�"));	

	}

}
