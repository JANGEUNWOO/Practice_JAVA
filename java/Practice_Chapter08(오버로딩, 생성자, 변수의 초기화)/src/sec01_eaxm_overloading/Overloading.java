package sec01_eaxm_overloading;

public class Overloading {

	
	//add()로 오버로딩을 하고 있음.
	public int add(int a,int b) {
		System.out.println("int add(int a, int b)=");
		return a+b;
	}
	
	public long add(int a, long b) {
		System.out.println("long add(int a, long b)=");
		return a+b;
	}
	
	public long add(long a, long b) {
		System.out.println("long add(long a, long b)=");
		return a+b;
	}
	
	public int add(int[] a) {
		//배열의 모든 요소의 합을 결과로 돌려준다.
		System.out.println("int add(int[] a)");
		int result=0;
		for(int i=0;i<a.length;i++)
			result +=a[i];
		return result;
	}
	
	
}
