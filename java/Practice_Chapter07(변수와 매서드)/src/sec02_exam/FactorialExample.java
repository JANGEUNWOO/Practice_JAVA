package sec02_exam;

public class FactorialExample {

	public static void main(String[] args) {
		
		
		
		long result=FactorialExample.factorial(5L);
		System.out.println("5!(���丮��)��:"+result);
		
	}
	
	
	//�ڱ� �ڽ��� ȣ���ϴ� ���
	//for������ �ص� �Ǵ� �ڵ带 ���°Ͱ� �ڵ��ߺ��� ���������ν�����.
	
	public static long factorial(long n) {
		long result =0l;
		//��μ� 1�϶�, ���ȣ���� �� �̻� ���̷������. f(1)=1 �̴ϱ�.
		
		if(n==1) {
			result=1;
			
		}
		else {
			System.out.println("result�� : "+result+" n��: "+n);
			result=n*factorial(n-1);//�ż��� �ڽ��� ȣ���Ѵ�.
		}
		return result;
		
		
		

	}

}
