package sec06_user_define_exception_01;

public class BalanceInsufficientExaception extends Exception {

	public BalanceInsufficientExaception() {}
	
	//������
	
	public BalanceInsufficientExaception(String message) {
		super(message);//������ ������ ȣ��
	}
	
}
