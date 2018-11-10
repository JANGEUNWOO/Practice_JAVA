package sec08_verify;

public class LoginExample {

	public static void main(String[] args)  {
	   
       try {
           login("white","12345");
           login("ddd","12345");
       	   }catch(NotExistIDException a) {
    	     System.out.println(a.getMessage()+"�� ���̵� �������� �ʽ��ϴ�.");
           }catch(WrongPasswordException b) {
    	     System.out.println("�н����尡"+b.getMessage()+"�� �ƴմϴ�.");
       }
       
       try {
           login("white","1235");
           }catch(NotExistIDException a) {
        	 System.out.println(a.getMessage()+"�� ���̵� �������� �ʽ��ϴ�.");
           }catch(WrongPasswordException b) {
        	 System.out.println("�н����尡"+b.getMessage()+"�� �ƴմϴ�.");
       }
	}
       
	   static void login(String id, String password) throws NotExistIDException,WrongPasswordException {
    	
    	if(id.equals("white")&&password.equals("12345")) {
    		System.out.println("���̵�� white�̸�, ��й�ȣ�� 12345 �Դϴ�.");
    	}else if(id.equals("white")&&!password.equals("12345")) {
    		throw new WrongPasswordException(password);
    	}else if(!id.equals("white")) {
    		throw new NotExistIDException(id);
    	}
	   }
}
