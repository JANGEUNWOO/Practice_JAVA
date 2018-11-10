package sec03_verify;

public class SmartPhoneExample {

	public static void main(String[] args) {
		
		
		SmartPhone<String,String,Double> sp1=new SmartPhone<String,String,Double>();
		System.out.println("타입파라메터에 <String, String, Double>으로 객체 생성 후 저장값 불러오기");
		sp1.company="Samsung";
		sp1.model="갤럭시5";
		sp1.inch=5.5;
		
		System.out.println("회사:"+sp1.getCompany());
		System.out.println("모델:"+sp1.getModel());
		System.out.println("인치:"+sp1.getInch());
		
		
		System.out.println();
		
		System.out.println("타입파라메터에 <String, String, String>으로 객체 생성 후 저장값 불러오기");
		SmartPhone<String,String,String> sp2=new SmartPhone<String,String,String>();
		sp2.company="LG전자";
		sp2.model="V20";
		sp2.inch="6.0";
		
		System.out.println("회사:"+sp2.getCompany());
		System.out.println("모델:"+sp2.getModel());
		System.out.println("인치:"+sp2.getInch());
		
	}

}
