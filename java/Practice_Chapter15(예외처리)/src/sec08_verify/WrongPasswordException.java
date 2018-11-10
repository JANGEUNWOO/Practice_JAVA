package sec08_verify;

public class WrongPasswordException extends Exception{
		
		WrongPasswordException(){
			
		}
		
		WrongPasswordException(String password){
			super(password);
			
		}
}
	

