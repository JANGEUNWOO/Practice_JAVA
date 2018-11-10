package sec01_verify;

public class StringBufferExample {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("This");
		
		System.out.println("기존 스트링버퍼 sb 출력:"+sb);
		System.out.println("스트링버퍼 sb의 해쉬값 출력 :"+sb.hashCode());
		sb.append(" is pencil");
		System.out.println("변형된 스트링버퍼 sb 출력 : "+sb);
		sb.insert(8, "my ");
		System.out.println("변형된 스트링버퍼 sb 출력 : "+sb);
		sb.replace(8, 11, "your ");
		System.out.println("변형된 스트링버퍼 sb 출력 : "+sb);
		sb.delete(4, sb.length());
		System.out.println("문자열 길이를 설정하여 변형된 스트링버퍼 sb 출력 :"+sb);
		System.out.println(sb.hashCode());
		//문자열 조작 후에도 해쉬코드가 변함이 없다 즉, 
		//스트링버퍼는 새로운 인스턴스를 만들지 아니함을 알수 있다.
		
		
		

	}

}
