package sec00_verify;

public class MyMathMethodExample {

	public static void main(String[] args) {
		   
		   MyMathMethod.add(100, 200);
		   
		   System.out.println("Ŭ����(static)�޼��� addȣ��"+MyMathMethod.add(100,200));
		   
		   MyMathMethod.subtract(300, 200);
		   System.out.println("Ŭ����(static)�޼��� subtractȣ��"+MyMathMethod.subtract(300,200));
		   
		   
		   MyMathMethod.multiply(200, 100);
		   System.out.println("Ŭ����(static)�޼��� multiplyȣ��"+MyMathMethod.multiply(200, 100));
		   
		   MyMathMethod.divide(4,2);
		   System.out.println("Ŭ����(static)�޼��� divideȣ��"+(double)MyMathMethod.divide(4,2));
		   
		   
		   MyMathMethod sc=new MyMathMethod();
		   sc.add();
		   System.out.println("�ν��Ͻ� �޼��� addȣ��"+sc.add());
		   sc.subtract();
		   System.out.println("�ν��Ͻ� �޼��� subtractȣ��"+sc.subtract());
		   sc.multiply();
		   System.out.println("�ν��Ͻ� �޼��� multiplyȣ��"+sc.multiply());
		   sc.divide();
		   System.out.println("�ν��Ͻ� �޼��� divideȣ��"+(double)sc.divide());
		   
		   
		   
	}

}
