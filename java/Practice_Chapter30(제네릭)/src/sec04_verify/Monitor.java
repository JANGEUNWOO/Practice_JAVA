package sec04_verify;

public class Monitor {

	private String company;
	private int inch;

	public Monitor(String company,int inch) {
		this.company=company;
		this.inch=inch;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getInch() {
		return inch;
	}

	public void setInch(int inch) {
		this.inch = inch;
	}
	
	@Override
	public String toString() {
	  return this.company+"\n"+this.inch;
	}

}
