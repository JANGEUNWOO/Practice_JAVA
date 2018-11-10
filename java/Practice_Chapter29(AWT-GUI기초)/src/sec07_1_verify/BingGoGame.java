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
		final Frame f = new Frame("Bingo Game"); // Frame��ü�� �����Ѵ�.
		f.setSize(300, 300);
		f.setLayout(new GridLayout(5, 5)); // 5�� 5���� ���̺��� �����.
		// ��ư�� ����
		String numStr[] = { "����", "�η��", "Ȳ��", "��ѱ�", "�����", "����", "Ÿ��", "�ξ���", "�û���", "���", "��", "��", "������", "�ײ�", "��",
				"����", "������", "�ܵ�", "��Ȳ", "����", "��ġ", "���", "�޹���", "�Ҳ���", "���" };
		Button[] numButtons = new Button[numStr.length]; // �迭�� ��ư�� �����Ѵ�.
		for (int index = 0; index < numStr.length; index++) {
			numButtons[index] = new Button(numStr[index]); // ��ư�� �����Ѵ�.
			numButtons[index].addMouseListener(new MouseAdapter() { // ��ư�� �̺�Ʈ�����ʸ� �߰��Ѵ�.
				@Override
				public void mouseClicked(MouseEvent e) {
					changeColor(e);
					// ��ư�� Ŭ������ �� �޼��带 ȣ���Ѵ�.
				}
			});
			f.add(numButtons[index]); // �����ӿ� ��ư�� �߰��Ѵ�.
		}
		f.addWindowListener(new WindowAdapter() { // �������� �ݱ� �̺�Ʈ
			public void windowClosing(WindowEvent e) {
				e.getWindow().setVisible(false);
				e.getWindow().dispose();
				System.exit(0);
			}
		});
		Toolkit tk = Toolkit.getDefaultToolkit(); // ������ Toolkit ��ü�� ��´�.
		Dimension screenSize = tk.getScreenSize(); // ȭ���� ũ�⸦ ���Ѵ�.
		// ȭ��ũ���� ���ݰ����� Frameũ���� ���ݰ��� �� ��ġ���ϸ�
		// Frame�� ȭ�� ��� ��ġ�ϰ� �ȴ�.
		f.setLocation(screenSize.width / 2 - 300 / 2, screenSize.height / 2 - 200 / 2);
		f.setVisible(true);
	}

	/**
	 * ��ư�� Ŭ������ �� ��ư�� ���� �ٲ��ִ� �޼���
	 * 
	 * @param e
	 */
	public static void changeColor(MouseEvent e) {
		Button btn = (Button) e.getSource(); // �̺�Ʈ�� �߻��� ��ư�� ���ؿ´�.
		btn.setBackground(Color.LIGHT_GRAY); // ��ư�� ������ ���� ȸ������ �����Ѵ�.
		System.out.println(btn.getLabel()); // ��ư�� ���ڸ� ����Ѵ�.
	}
}