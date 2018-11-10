package sec02_verify;
class Monitor{
	private String model;
	private int inch;
	private int price;
	
	public Monitor(String mode, int inch, int price) {
		this.model=model;
		this.inch=inch;
		this.price=price;
	}
	/*@Override
	public int hashCode() {
		
	}*/
}
public class MonitorExample {

	public static void main(String[] args) {
		
	Monitor m1 = new Monitor("UDEA", 19, 210000);
	Monitor m2 = new Monitor("FLATRON", 22, 250000);
	Monitor m3 = new Monitor("UDEA", 19, 210000);
	Monitor m4 = new Monitor("SAMSUNG", 25, 310000);
		
	System.out.println(m1.hashCode());
	System.out.println(m2.hashCode());
	System.out.println(m3.hashCode());
		
		
		
	}

}
