package sec08_exam_generic_extends;


//조상클래스가 제네릭 타입이면 자손클래스도 제네릭타입이 되어야 하며
//타입 파라미터를 가질 수 있다.
public class ChildProduct<T, M, C> extends Product<T, M> {

	private C company;

	public C getCompany() {
		return company;
	}

	public void setCompany(C company) {
		this.company = company;
	}

}
