package sec02_eaxm_final;

public class PersonExample {

	public static void main(String[] args) {
		
		//�Ű�������  �ִ� �����ڸ� ȣ���ϴ� ��!
		Person p1=new Person("123456-1234567","���");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		
		//p1.nation="usa";        //������ ��������?  >>����� �ٲٷ��� �ؼ�...
		//System.out.println(p1.nation);
		//p1.ssn="654321-7654321" //������ ��������?  >>����� �ٲٷ��� �ؼ�...
		p1.name="��������";
        System.out.println(p1.name);
	}

}
