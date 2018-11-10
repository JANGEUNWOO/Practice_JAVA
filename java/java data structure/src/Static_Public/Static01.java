package Static_Public;

public class Static01 {

	public static int a =10;
	public int c=10;
	
	
    public static void A() {
    	int b=a+10;
    	System.out.println(b);
    	//System.out.println(a+c);
    	//B();
    }
    
    public void B() {
    	int b=a+10;
    	System.out.println(b);
    	System.out.println(a+c);
    	A();
    }
    
    public static void main(String[] args) {
    	
    	A();
    	
    	//System.out.println(a+c);
    	
    	
    	
    }
    
    
    
	
	
    
    
    
}
