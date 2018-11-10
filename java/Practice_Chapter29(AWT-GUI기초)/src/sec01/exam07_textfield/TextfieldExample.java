package sec01.exam07_textfield;

	import java.awt.FlowLayout;
	import java.awt.Frame;
	import java.awt.Label;
	import java.awt.TextField;
public class TextfieldExample {
	
	 public static void main(String[] args) {
	      
	      Frame f = new Frame("login");
	      f.setSize(400, 130);
	      f.setLayout(new FlowLayout(FlowLayout.LEFT));
	      
	      Label lid = new Label("아이디:", Label.RIGHT); //정렬을 오른쪽으로
	      Label lpwd = new Label("비밀번호:", Label.RIGHT);
	      
	      //약 10개의 글자를 입력할 수 있는 텍스트 필드 생성
	      TextField id = new TextField(10);
	      TextField pwd = new TextField(10);
	      //입력한 값 대신 * 가 보이도록 한다. (에코문자 설정) 비밀번호 설정에 사용
	      pwd.setEchoChar('*');
	      //pwd.setEchoChar('-');
	      char ch = pwd.getEchoChar();
	      System.out.println("설정한 에코문자 :" +ch);
	      
	      //생성된 컴포넌트들을 frame에  포함시킨다.
	      f.add(lid); f.add(id); f.add(lpwd); f.add(pwd);
	      f.setVisible(true);
	      

	}
}