package sec03_verify;

public class ColorPointExample {

	public static void main(String[] args) {
		
		ColorPoint cp=new ColorPoint();
		cp.set(3, 4);
		cp.setColor("����");
		cp.showColorPoint();
		cp.showPoint();
		System.out.println();
		
		ColorPoint cp1=new ColorPoint();
		cp1.set(10, 50);
		cp1.setColor("���");
		cp1.showColorPoint();
		cp1.showPoint();
		System.out.println();
		
		ColorPoint cp2=new ColorPoint();
		cp2.set(20, 17);
		cp2.setColor("���");
		cp2.showColorPoint();
		cp2.showPoint();
		System.out.println();
		
		ColorPoint cp3=new ColorPoint();
		cp3.set(2, 1);
		cp3.setColor("�׸�");
		cp3.showColorPoint();
		cp3.showPoint();
		System.out.println();
		
		
	}

}
