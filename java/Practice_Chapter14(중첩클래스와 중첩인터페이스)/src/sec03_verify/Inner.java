package sec03_verify;

public class Inner {

	class InstanceInner{
		
		final static int CONST=100;
		int iv=100;
	}	
	static class StaticInner{
			final static int CONST=500;
			static int cv=200;
			int iv=200;
	}
    void myMethod() {
		 class LocalInner{
		     int local=300;
		     final static int CONST=300;
		     
		     void method1() {
		    	 System.out.println("myMethod()�� ȣ���� LocalInnerŬ���� ������ ������� �� ��� :"+CONST);
		     }
		     void method2() {
		    	 System.out.println("myMethod()�� ȣ���� final static���� �� ��� :"+local);
		     }
		     
		     //myMethod()�� ȣ���� LocalInnerŬ���� ������ ������� �� ��� : 300
		     //myMethod()�� ȣ���� final static���� �� ��� : 300
		     
		 }
		 LocalInner localinner=new LocalInner();
		 localinner.local=300;
		 localinner.method1();
		 localinner.method2();
    }
}
	

