package sec02_exam;

public class PrimitiveParamEx {

	public static void main(String[] args) {
		
		Data d=new Data();
		d.x=10;
		System.out.println("main():x="+d.x);
		
		//예)동생한테 "몇시냐?"라고 물어보는 꼴
		change(d.x);
		
		System.out.println("After change(d.x)");
		System.out.println("main():x="+d.x);
		
		
		
	}
	    static void change(int x) {
	    	x=1000;
	    	System.out.println("change():x="+x);
	    }

}
