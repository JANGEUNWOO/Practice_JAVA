package sec05_verify;

public class MemberServiceExample {

	public static void main(String[] args) {
		
		MemberService ms=new MemberService();
		
		ms.login("hong", "12345");
		ms.logout("hong");
		ms.login("jang", "12345");
		

	}

}
