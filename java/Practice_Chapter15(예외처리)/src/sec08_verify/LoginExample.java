package sec08_verify;

public class LoginExample {

	public static void main(String[] args)  {
	   
       try {
           login("white","12345");
           login("ddd","12345");
       	   }catch(NotExistIDException a) {
    	     System.out.println(a.getMessage()+"란 아이디가 존재하지 않습니다.");
           }catch(WrongPasswordException b) {
    	     System.out.println("패스워드가"+b.getMessage()+"이 아닙니다.");
       }
       
       try {
           login("white","1235");
           }catch(NotExistIDException a) {
        	 System.out.println(a.getMessage()+"란 아이디가 존재하지 않습니다.");
           }catch(WrongPasswordException b) {
        	 System.out.println("패스워드가"+b.getMessage()+"이 아닙니다.");
       }
	}
       
	   static void login(String id, String password) throws NotExistIDException,WrongPasswordException {
    	
    	if(id.equals("white")&&password.equals("12345")) {
    		System.out.println("아이디는 white이며, 비밀번호는 12345 입니다.");
    	}else if(id.equals("white")&&!password.equals("12345")) {
    		throw new WrongPasswordException(password);
    	}else if(!id.equals("white")) {
    		throw new NotExistIDException(id);
    	}
	   }
}
