package sec07_user_define_exception_01;


public class BalanceInsufficientException extends Exception{

		   public BalanceInsufficientException() {}
		      //생성자
		   
		   public BalanceInsufficientException(String message) {
		      super(message);//조상 생성자 호출
		   }
}
	
	

