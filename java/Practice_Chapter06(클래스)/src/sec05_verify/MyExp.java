package sec05_verify;

public class MyExp {

	
	 public int base=2;
	 public int exp=3;
	     
	 public int getValue() {
	    	 
	    	 return (int) Math.pow(base, exp);
	     }

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	 
	
	     
}
