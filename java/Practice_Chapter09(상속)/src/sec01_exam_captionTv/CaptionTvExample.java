package sec01_exam_captionTv;

public class CaptionTvExample {

	public static void main(String[] args) {
	
		CaptionTv ctv=new CaptionTv();
		
		ctv.channel=10;  //조상 클래스로부터 상속받은 멤버
		ctv.channelUp();  //조상 클래스로부터 상속받은 멤버, channel를 1증가시킴
		
		System.out.println("현재 체널은"+ctv.channel+"입니다.");
		ctv.displayCaption("캡션가능 출력 메세지:Hello, world");//false이므로 출력안함
		
		ctv.caption=true;//캡션기능을 켠다.
		ctv.displayCaption("캡션가능 출력 메시지:hello, world"); //캡션을 화면에 보여준다

	}

}
