package sec02_exam_constructor;

public class StringTrimExample {

	public static void main(String[] args) {
		
		//trim�� �¿� ���鸸 ���ش�.
		//��� ������ ���ַ��� ���ο� �ڵ带 �ۼ��ؾ��Ѵ�. replaceAll("\\p[Z]","")
		String tel1="  02";
	    String tel2="123   ";
	    String tel3="  12  34  ";
	    String tel=tel1.trim()+tel2.trim()+tel3.trim();
	    System.out.println(tel);
		
	}

}
