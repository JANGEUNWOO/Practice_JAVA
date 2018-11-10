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
	Label lSpeed = new Label("�ӵ�:1");

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
		this.setResizable(false); // Frame�� ũ�⸦ ������ �� ������ �Ѵ�.

	}
	// ��øŬ���� WindowAdapter���, AdjustmentListener�� ������
	/*
	 * Adjustment Event���� AdjustmentEvent:Scrollbar������ �� �߻��ϴ� �̺�Ʈ�̴�.
	 * AdjustmentEventListener ó���ϱ� ���� �̺�Ʈ �ڵ�� AdjustmentEvent ����
	 * -AdjustmentListener �������̽� -�ż��尡 �ϳ��̱⋚���� AdapterŬ������ ����. -public void
	 * addAdjustmentListener(AdjustmentEvent e)
	 */

	class MyHandler extends WindowAdapter implements AdjustmentListener {
		@Override
		public void adjustmentValueChanged(AdjustmentEvent e) {
			speed = sb.getValue(); // Scrollbar�� ���� ���� ��´�.
			lSpeed.setText("�ӵ�:" + speed); // Label�� ����

		}

		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}

}
