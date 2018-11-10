package sec02_exam_constructor;

public class StringSplitExample {

	public static void main(String[] args) {
		
		
		String animals="dog/cat/bear"; //공백이 없이 입력을 해야한다.
		String animals1="dog/cat,bear&abc";//공백이 없어 입력을 해야 한다.
		
		//split매서드는 매개변수로 정규표현식이 온다. 하여
		//정규표현식을 가지고 문자열을 구분하여 String배열을 리턴함.
		String[] arr=animals.split("/");
		String[] arr2=animals1.split("/|,|&");
		
		for(String s:arr)
			System.out.println(s);
		for(String s:arr2)
			System.out.println(s);

	}

}
