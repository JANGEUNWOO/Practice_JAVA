package sec02_exam_constructor;

public class StringIndexOfExample {

	public static void main(String[] args) {
		
		
		String subject="자바 프로그래밍";
		int location=subject.indexOf("프로그래밍"); //"프"가 시작되는 위치를 리턴
		
		System.out.println(location);
		
		//찾기 기능 할때 자주 쓰인다.(사진이나 문서)
		//"자바"를 포함하고 있는 지를 확인할 떄 쓰이는 코드
		if(subject.indexOf("자바")!=-1) {
			System.out.println("자바와 관련된 책이군요.");
		}else {
			System.out.println("자바와 관련이 있는 책이군요.");
		}

	}

}
