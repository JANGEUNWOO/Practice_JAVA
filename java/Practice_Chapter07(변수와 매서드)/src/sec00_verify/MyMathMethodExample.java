package sec00_verify;

public class MyMathMethodExample {

	public static void main(String[] args) {
		   
		   MyMathMethod.add(100, 200);
		   
		   System.out.println("클래스(static)메서드 add호출"+MyMathMethod.add(100,200));
		   
		   MyMathMethod.subtract(300, 200);
		   System.out.println("클래스(static)메서드 subtract호출"+MyMathMethod.subtract(300,200));
		   
		   
		   MyMathMethod.multiply(200, 100);
		   System.out.println("클래스(static)메서드 multiply호출"+MyMathMethod.multiply(200, 100));
		   
		   MyMathMethod.divide(4,2);
		   System.out.println("클래스(static)메서드 divide호출"+(double)MyMathMethod.divide(4,2));
		   
		   
		   MyMathMethod sc=new MyMathMethod();
		   sc.add();
		   System.out.println("인스턴스 메서드 add호출"+sc.add());
		   sc.subtract();
		   System.out.println("인스턴스 메서드 subtract호출"+sc.subtract());
		   sc.multiply();
		   System.out.println("인스턴스 메서드 multiply호출"+sc.multiply());
		   sc.divide();
		   System.out.println("인스턴스 메서드 divide호출"+(double)sc.divide());
		   
		   
		   
	}

}
