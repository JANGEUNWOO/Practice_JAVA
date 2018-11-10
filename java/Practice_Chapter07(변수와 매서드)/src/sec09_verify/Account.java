package sec09_verify;

public class Account {

	static final int MIN_BALANCE=0;		
	static final int MAX_BALANCE=1000000;
	int balance;
	
	public int getBalance() {
		System.out.println();
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	
}
