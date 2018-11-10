package sec01_exam_contentSender;

public class letterSender extends ContentSender {
	

		String content;
		//생성자
		public letterSender(String title,String nm,String content) {
			//조상클래스의 생성자를 호출
			
			super(title, nm);
			//자신의 멤버 초기화
			
			this.content=content;
		}
		
		//조상클래스의 추상매서드인 sendMsg()상속받아 오버라이딩한다.
		@Override
		public void sendMsg(String recipient) {
			System.out.println("제목="+this.title);
			System.out.println("이름="+this.nm);
			System.out.println("내용="+this.content);
			System.out.println("받는사람="+recipient);
		}
}
