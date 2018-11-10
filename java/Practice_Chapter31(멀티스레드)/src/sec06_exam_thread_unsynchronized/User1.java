package sec06_exam_thread_unsynchronized;

public class User1 extends Thread{

	 private Calculator calculator;

	   public void setCalculator(Calculator calculator) {
	      this.calculator = calculator;
	      this.setName("User-1");
	   }

	   @Override
	   public void run() {
	    this.calculator.setMemory(100);
	   }
}
