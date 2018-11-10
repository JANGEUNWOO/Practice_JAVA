package sec01.exam15_Font;

import java.awt.Font;
import java.awt.GraphicsEnvironment;

public class FontListExample {

	public static void main(String[] args) {
		// GraphicsEnvironment ��ü�� GraphicsDevivice��ü �� ��Ʈ ��ü�� �����ϰ� �ִ� Ŭ����
		GraphicsEnvironment ge=GraphicsEnvironment.getLocalGraphicsEnvironment();
		
		//��� font�� �����´�.
		Font[] fonts=ge.getAllFonts();
		
		//��� font�� ���
		for(int i=0;i<fonts.length;i++) {
			System.out.println(fonts[i].getFontName());
		}

	}

}
