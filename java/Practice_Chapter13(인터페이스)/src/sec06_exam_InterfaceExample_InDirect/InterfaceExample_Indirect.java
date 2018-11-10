package sec06_exam_InterfaceExample_InDirect;

public class InterfaceExample_Indirect {

	public static void main(String[] args) {
		
	
		A a=new A();
		a.methodB(new B());
		
		
		I i =new B();
		i.methodB();

	}

}
