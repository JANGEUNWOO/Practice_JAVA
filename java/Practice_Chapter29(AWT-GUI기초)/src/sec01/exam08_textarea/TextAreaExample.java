package sec01.exam08_textarea;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;

public class TextAreaExample {

	public static void main(String[] args) {
		
		
		Frame f=new Frame("Comments");
		f.setSize(400,200);
		f.setLayout(new FlowLayout());
		/*
		 * text-TextArea에 보여질 text를 지정한다.
		 * row- TextArea의 줄(row) 수를 지정한다.
		 * col- TextArea의 열(colomn) 수를 적는다.
		 * TextArea comments=new TextArea("하고 싶은 말을 적으세요.",10,50,TextArea.SCROLLBARS_BOTH);
		 */
		
		TextArea comments=new TextArea("하고 싶은 말을 적으세요.",10,50);
		
		f.add(comments);
		//TextArea의 text 전체가 선택 되도록 한다.
		comments.selectAll();
		f.setVisible(true);
		
	}

}
