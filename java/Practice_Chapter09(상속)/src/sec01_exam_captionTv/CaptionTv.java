package sec01_exam_captionTv;

//자손클래스 멤버갯수 :7개
//Tv, CaptionTv
public class CaptionTv extends Tv {

	boolean caption; // 캡션상태(on/off) 기본값:false

	public CaptionTv() {
		super(); // 조상클래스의 생성자를 호출하는 매서드(컴파일러가 없어서 호출)
		System.out.println("자손클래스 생성자 호출");
	}

	public void displayCaption(String text) {
		// 1번째 호출시에 false, 2번째 호출시에는 true
		// 캡션 상태가 on(true)일 때만 text를 보여준다.

		if (this.caption)
			System.out.println(text);
	}

}
