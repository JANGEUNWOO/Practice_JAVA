package sec03_verify;

public class SmartPhoneExample {

	public static void main(String[] args) {
		
		
		SmartPhone<String,String,Double> sp1=new SmartPhone<String,String,Double>();
		System.out.println("Ÿ���Ķ���Ϳ� <String, String, Double>���� ��ü ���� �� ���尪 �ҷ�����");
		sp1.company="Samsung";
		sp1.model="������5";
		sp1.inch=5.5;
		
		System.out.println("ȸ��:"+sp1.getCompany());
		System.out.println("��:"+sp1.getModel());
		System.out.println("��ġ:"+sp1.getInch());
		
		
		System.out.println();
		
		System.out.println("Ÿ���Ķ���Ϳ� <String, String, String>���� ��ü ���� �� ���尪 �ҷ�����");
		SmartPhone<String,String,String> sp2=new SmartPhone<String,String,String>();
		sp2.company="LG����";
		sp2.model="V20";
		sp2.inch="6.0";
		
		System.out.println("ȸ��:"+sp2.getCompany());
		System.out.println("��:"+sp2.getModel());
		System.out.println("��ġ:"+sp2.getInch());
		
	}

}
