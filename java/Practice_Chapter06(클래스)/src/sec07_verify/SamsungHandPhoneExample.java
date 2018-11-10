package sec07_verify;

public class SamsungHandPhoneExample {

	public static void main(String[] args) {
		
		
		
		SamsungHandPhone phone=new SamsungHandPhone();
		
		phone.setCompany("Samsung");
		phone.setModel("Galaxy3");
		phone.setColor("while");
		phone.setRelease(2013);
		
		if(phone.getCompany()!="Apple") {
			System.out.println("»ï¼ºÆùÀÌ ¾Æ´Õ´Ï´Ù.");
		}
	    if(phone.getModel()!="V5") {
	    	System.out.println("»ï¼ºÆù ¸ðµ¨ÀÌ ¾Æ´Õ´Ï´Ù."
	    			+ "(Samsung¸ðµ¨ : Galaxy3, Galaxy4, Galaxy5, Galaxy6, Galaxy7, GalaxyNote)");
	 	
		}
		
		System.out.println(phone);
		
		
	}
}	

	


