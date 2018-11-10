package sec04.exam08_paintframe;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Scrollbar;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class PaintFrame extends Frame {

	int speed = 1 ;
	Scrollbar sb = new Scrollbar(Scrollbar.HORIZONTAL, 0, 5, 0, 50);
	Label lSpeed = new Label("속도:1");

	public PaintFrame(String title) {
		super(title);
		this.lSpeed.setBackground(Color.yellow);
		this.lSpeed.setSize(65, 15);
		this.lSpeed.setLocation(10, 30);
		this.sb.setSize(200, 20);
		this.sb.setLocation(20, 250);
		this.add(sb);
		this.add(lSpeed);
		this.sb.addAdjustmentListener(new MyHandler());
		this.addWindowListener(new MyHandler());

		this.setSize(300, 300);
		this.setLocation(500, 300);
		this.setLayout(null);
		this.setVisible(true);
		this.setResizable(false); // Frame의 크기를 변경할 수 없도록 한다.

	}
	// 중첩클래스 WindowAdapter상속, AdjustmentListener를 구현함
	/*
	 * Adjustment Event형식 AdjustmentEvent:Scrollbar움직일 떄 발생하는 이벤트이다.
	 * AdjustmentEventListener 처리하기 위한 이벤트 핸들어 AdjustmentEvent 관련
	 * -AdjustmentListener 인터페이스 -매서드가 하나이기떄문에 Adapter클래스는 없다. -public void
	 * addAdjustmentListener(AdjustmentEvent e)
	 */

	class MyHandler extends WindowAdapter implements AdjustmentListener {
		@Override
		public void adjustmentValueChanged(AdjustmentEvent e) {
			speed = sb.getValue(); // Scrollbar의 현재 값을 얻는다.
			lSpeed.setText("속도:" + speed); // Label값 갱신

		}

		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}

}
