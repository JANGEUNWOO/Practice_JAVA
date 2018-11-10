package sec03_verify;

public class SmartPhone<C, M, I> {

	C company;
	M model;
	I inch;

	public C getCompany() {
		return company;
	}

	public void setCompany(C company) {
		this.company = company;
	}

	public M getModel() {
		return model;
	}

	public void setModel(M model) {
		this.model = model;
	}

	public I getInch() {
		return inch;
	}

	public void setInch(I inch) {
		this.inch = inch;
	}

}
