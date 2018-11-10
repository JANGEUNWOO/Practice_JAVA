package sec08_exam_generic_extends;

public class ChildProductExample {

	public static void main(String[] args) {

		Product<Tv, String> product = new ChildProduct<>();
		ChildProduct<Tv, String, String> childProduct = new ChildProduct<>();

		product.setKind(new Tv());
		product.setMode("캡션 Tv");
		//product.setCompany("삼성"); //왜 컴파일 예외가 발생하는가?

		String pmode1 = product.getMode();
		System.out.println(pmode1);

		childProduct.setKind(new Tv());
		childProduct.setMode("스마트 TV");
		childProduct.setCompany("LG");

		String mode1 = childProduct.getMode();
		String company = childProduct.getCompany();

		System.out.println(company + ":" + mode1);

	}

}
