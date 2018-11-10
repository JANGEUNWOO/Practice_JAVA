package sec03_abstract;

public class AbsEx extends AbsEx2 {

	public static void main(String[] args) {
		AbsEx ae=new AbsEx();
		System.out.println("ae.getA():"+ae.getA());
		System.out.println("ae.getStr():"+ae.getStr());

	}

	@Override
	public String getStr() {
		
		return str;
	}

}
