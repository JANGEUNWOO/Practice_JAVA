package sec01_verify;

public class Calculator {
	
	
	boolean power; //��������(on/off)
	
	void powerOn() {
		System.out.println("������ �մϴ�.");
	}
	
	int x;
	int y;
	
	int plus(int x,int y) {
	 int result=x+y;
	 return result;
	}
	
	double divide(int x, int y) {
		double result=(double)x/(double)y;
		return result;
	}
	
	void poweroff() {
		System.out.println("������ ���ϴ�.");
	}
	
}
