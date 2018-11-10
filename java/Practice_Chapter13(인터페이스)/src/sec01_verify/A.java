package sec01_verify;

public class A {

	public void autoPlay(I i) {
		if(i instanceof B) {
			B b=(B)i;
			b.play();
		}
		if(i instanceof C) {
			C c=(C)i;
			c.play();
		}
	}
}
