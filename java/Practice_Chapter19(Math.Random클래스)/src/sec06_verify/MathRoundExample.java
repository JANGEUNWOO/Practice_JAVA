package sec06_verify;

public class MathRoundExample {

	public static void main(String[] args) {
		System.out.println("�ڹٿ��� �����ϴ� Math.round(3.17836)�� �� ��� : "+ Math.round(3.17836));
		System.out.println();
		System.out.println("���� ���� round()�� ����� ���");
		System.out.println("Math.round()�� Math.pow()�� �����Ͽ� ����ϴ�.");
		System.out.println();
		System.out.println("3.17836�� ��° �ڸ����� �ݿø� �� ��� : "+round(3.17836,2));
		System.out.println("3.17836�� ��° �ڸ����� �ݿø� �� ��� : "+round(3.17836,3));
		System.out.println("3.17836�� ��° �ڸ����� �ݿø� �� ��� : "+round(3.17836,4));
		System.out.println("3.17836�� �ټ�° �ڸ����� �ݿø� �� ��� : "+round(3.17836,5));
		
	}
	public static double round(double d, int n) {
		return Math.round(3.17836*Math.pow(10,n-1))/Math.pow(10,n-1);

	}

}
