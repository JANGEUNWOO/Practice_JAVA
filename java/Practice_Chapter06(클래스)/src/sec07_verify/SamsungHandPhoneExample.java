package sec07_verify;

public class SamsungHandPhoneExample {

	public static void main(String[] args) {
		
		
		
		SamsungHandPhone phone=new SamsungHandPhone();
		
		phone.setCompany("Samsung");
		phone.setModel("Galaxy3");
		phone.setColor("while");
		phone.setRelease(2013);
		
		if(phone.getCompany()!="Apple") {
			System.out.println("�Ｚ���� �ƴմϴ�.");
		}
	    if(phone.getModel()!="V5") {
	    	System.out.println("�Ｚ�� ���� �ƴմϴ�."
	    			+ "(Samsung�� : Galaxy3, Galaxy4, Galaxy5, Galaxy6, Galaxy7, GalaxyNote)");
	 	
		}
		
		System.out.println(phone);
		
		
	}
}	

	


