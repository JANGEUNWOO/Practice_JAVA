package sec01_verify;

public class OutterExample {

	public static void main(String[] args) {
		
		
		Outter outter=new Outter();
		Outter.Inner inner=outter.new Inner();
		
		System.out.print("외부클래스 Outer의 인스턴스를 생성한 후, "
				+ "인스턴스멤버클래스(Inner)의 인스턴스를 생성하여 출력한값 :");
		System.out.println(inner.a);

	}
}
