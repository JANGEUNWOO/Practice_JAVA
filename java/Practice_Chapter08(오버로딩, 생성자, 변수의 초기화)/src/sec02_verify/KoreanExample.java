package sec02_verify;

public class KoreanExample {

	public static void main(String[] args) {
	      
		
		Korean sc=new Korean("���ѹα�","����",178,26,"�뱸������");
		System.out.println("ù ��° ���� �������Դϴ�.");
		System.out.println("���� : "+sc.nation);
		System.out.println("�̸� : "+sc.name);
		System.out.println("Ű :"+sc.height);
		System.out.println("����:"+sc.age);
		System.out.println("Ư¡:"+sc.character);
		
		System.out.println("");
		
		Korean scv=new Korean("USA","�����",172,29,"��� ����");
		System.out.println("�� ��° ���� �������Դϴ�.");
		System.out.println("���� : "+scv.nation);
		System.out.println("�̸� : "+scv.name);
		System.out.println("Ű :"+scv.height);
		System.out.println("����:"+scv.age);
		System.out.println("Ư¡:"+scv.character);
	}

}
