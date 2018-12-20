package Adapter_Pattern;

//Main클래스와 Math클래스의 수정없이 AdapterImpl의 수정만으로 알고리즘 수정이 가능?
//알고리즘을 요구사항에 맞춰 사용할 수 있다.
public class Main {

	public static void main(String[] args) {

		Adapter adapter = new AdapterImpl();
		System.out.println(adapter.twiceOf(100f));
		System.out.println(adapter.halfOf(80f));

	}

}
