package sec07_1_verify;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class BingGoGame {
	public static void main(String[] args) {
		final Frame f = new Frame("Bingo Game"); // Frame객체를 생성한다.
		f.setSize(300, 300);
		f.setLayout(new GridLayout(5, 5)); // 5행 5열의 테이블을 만든다.
		// 버튼명 선언
		String numStr[] = { "참새", "두루미", "황새", "비둘기", "까오기", "오리", "타조", "부엉이", "올빼미", "뱁새", "꿩", "닭", "구관조", "잉꼬", "매",
				"거위", "독수리", "콘돌", "봉황", "공작", "까치", "까마귀", "앵무새", "꾀꼬리", "고니" };
		Button[] numButtons = new Button[numStr.length]; // 배열로 버튼을 생성한다.
		for (int index = 0; index < numStr.length; index++) {
			numButtons[index] = new Button(numStr[index]); // 버튼을 생성한다.
			numButtons[index].addMouseListener(new MouseAdapter() { // 버튼에 이벤트리스너를 추가한다.
				@Override
				public void mouseClicked(MouseEvent e) {
					changeColor(e);
					// 버튼을 클릭했을 때 메서드를 호출한다.
				}
			});
			f.add(numButtons[index]); // 프레임에 버튼을 추가한다.
		}
		f.addWindowListener(new WindowAdapter() { // 프레임의 닫기 이벤트
			public void windowClosing(WindowEvent e) {
				e.getWindow().setVisible(false);
				e.getWindow().dispose();
				System.exit(0);
			}
		});
		Toolkit tk = Toolkit.getDefaultToolkit(); // 구현된 Toolkit 객체를 얻는다.
		Dimension screenSize = tk.getScreenSize(); // 화면의 크기를 구한다.
		// 화면크기의 절반값에서 Frame크기의 절반값을 뺀 위치로하면
		// Frame이 화면 가운데 위치하게 된다.
		f.setLocation(screenSize.width / 2 - 300 / 2, screenSize.height / 2 - 200 / 2);
		f.setVisible(true);
	}

	/**
	 * 버튼을 클릭했을 때 버튼의 색을 바꿔주는 메서드
	 * 
	 * @param e
	 */
	public static void changeColor(MouseEvent e) {
		Button btn = (Button) e.getSource(); // 이벤트가 발생한 버튼을 구해온다.
		btn.setBackground(Color.LIGHT_GRAY); // 버튼의 배경색을 밝은 회색으로 설정한다.
		System.out.println(btn.getLabel()); // 버튼의 글자를 출력한다.
	}
}