package sec01_exam_contentSender;
//추상매서드를 하나라도 포함하고 있으면, 그건 조상클래스가 된다.
public abstract class ContentSender {

	//필드
	String title;
	String nm;
	
	//생성장
	public ContentSender(String title, String nm) {
		this.title=title;
		this.nm=nm;
	}
	//추상매서드  --> 상속을 통해 재정의를 해야지만
	//비로소 인스턴스 생성을 할 수가 있다.
	
	abstract void sendMsg(String content);
}
