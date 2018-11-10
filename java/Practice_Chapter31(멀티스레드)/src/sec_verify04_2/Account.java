package sec_verify04_2;

public class Account {

	private int balance;
	
	  public synchronized int getBalance() {
	      try {
	         Thread.sleep(1000);
	      }catch (InterruptedException e) {}
	      return this.balance;
	   }
	   //동기화 메서드
	   public synchronized void setBalance(int balance) {
	      this.balance = balance; //초기화
	      //2초 일시 정지
	      try {
	         Thread.sleep(2000);
	      }catch (InterruptedException e) {}
	      //현재 실행중인 스레드 이름과 balance값을 출력
	      System.out.println(Thread.currentThread().getName() + " 이/가 입금 : "+this.balance + "원");
	   }
	   //출금 동기화 메서드
	   public synchronized void withDraw(int money) {
	      if(this.balance >= money) {
	         try {
	            Thread.sleep(1000);
	            balance -= money;
	            System.out.println(Thread.currentThread().getName()+" 이/가 출금 : " + money + "원");
	            System.out.println(" 통장 잔액 : " + this.getBalance()+ " 원 ");
	         }
	         catch(Exception e) {}
	      }
	      else {
	         try {
	            System.out.println(Thread.currentThread().getName()+ "이/가" + money + "원 출금 시도하였습니다.");
	            throw new Exception("잔액이 부족합니다!");
	         }
	         catch(Exception e) {
	            System.out.println(e.getMessage());
	         }
	      }
	   }
}
