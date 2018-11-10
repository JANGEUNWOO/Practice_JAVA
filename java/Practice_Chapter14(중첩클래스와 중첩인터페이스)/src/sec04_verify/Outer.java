package sec04_verify;

public class Outer {
   
	int value=10;
    void method() {
	   System.out.println(value);
    }
   
    class Inner {
		
	 int value=20;
	 void method() {
		  System.out.println(value);
		  Outer.this.method();
	 }
	
	 void method1() {
	   
		  int value=30;
		  System.out.println(value);
		  Inner.this.method();
     }
	 }
   }
	

