package sec06_user_define_exception_01;

public class BalanceInsufficientExaception extends Exception {

	public BalanceInsufficientExaception() {}
	
	//생성자
	
	public BalanceInsufficientExaception(String message) {
		super(message);//조상의 생성자 호출
	}
	
}
