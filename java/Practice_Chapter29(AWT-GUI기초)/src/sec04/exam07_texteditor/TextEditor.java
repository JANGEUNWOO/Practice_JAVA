package sec04.exam07_texteditor;

import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Point;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;

public class TextEditor extends Frame {

	String fileName;
	TextArea content;
	MenuBar mb;
	Menu mFile;
	MenuItem miNew, miOpen, miSaveAs, miExit;

	public TextEditor(String title) {
		super(title);
	}

	public void showTexteditor() {
		this.content = new TextArea();
		this.add(this.content);

		// �޴� �ٿ� �޴� �� �޴� ������ ����
		this.mb = new MenuBar();
		this.mFile = new Menu("����");
		this.miNew = new MenuItem("�� ����");
		this.miOpen = new MenuItem("����");
		this.miSaveAs = new MenuItem("�ٸ� �̸����� ����");
		this.miExit = new MenuItem("����");

		// �޴����ٰ� �޴� ������ ����
		this.mFile.add(miNew);
		this.mFile.add(miOpen);
		this.mFile.add(miSaveAs);
		this.mFile.addSeparator();
		this.mFile.add(miExit);

		// �޴��ٿ� �޴� �߰�
		this.mb.add(mFile);

		// �����ӿ� �޴��ٸ� ���Խ�Ų��.
		this.setMenuBar(mb);

		// �޴��� �̺�Ʈ �ڵ鷯�� �����ʿ� ����Ѵ�.
		MyHandler handler = new MyHandler();
		this.miNew.addActionListener(handler);
		this.miOpen.addActionListener(handler);
		this.miSaveAs.addActionListener(handler);
		this.miExit.addActionListener(handler);
		this.addWindowListener(handler.wa); // ������ �̺�Ʈ �ڵ鷯 �����ʿ� ���
		this.setSize(400, 500);
		this.setLocation(new Point(300, 300));
		setVisible(true);

		// ���õ� ������ ������ �о TextArea�� �����ִ� �޼���

		// �Ʒ��� ���� ���� �� �� ���� ������� ����Ű�� �޸��� ������ ������ ���� ���α׷��� �� ���̴�.
		// ���߿� ���θ� �� �� �ϸ鼭 �����е��� ���� �޸��尰�� ������ø����̼��� �ѹ� ����� �� ���� �ִ�.
	}

	public void fileOpen(String fileName) {
		FileReader fr = null;
		BufferedReader br = null;
		StringWriter sw = null;

		try {
			// inputstreamreader�� ���� Ŭ������ FileReaderŬ������ �� ��Ʈ������ ����
			fr = new FileReader(fileName);
			// inputstream(����) ������Ʈ���� BudderReader(�������Ʈ��)�� ������Ŵ
			br = new BufferedReader(fr);
			int ch = 0;
			// ������ �� �а� �Ǹ� -1�� �����Ѵ�.
			while ((ch = br.read()) != -1) {
				sw.write(ch);
			}
			br.close();
			content.setText(sw.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	} // fileopen�޼����� ��

	// textArea�� ������ ������ ���Ͽ� �����ϴ� �޼���
	public void saveAs(String fileName) {

		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			// outputstreamreader�� ���� Ŭ������ filewriterŬ������ �ֽ�Ƽ������ ����
			fw = new FileWriter(fileName);
			// �ƿ�ǲ��Ʈ��(����) ������Ʈ���� bufferwriter�� ������Ŵ(�������Ʈ��)
			bw = new BufferedWriter(fw);
			// textarea�� ������ ���Ͽ� �����Ѵ�.
			bw.write(content.getText());
			bw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// �޴��� Ŭ�������� �޴��� ó���ڵ�
	class MyHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String command = e.getActionCommand();
			if (command.equals("�� ����")) {
				content.selectAll();
				content.setText("");
			} else if (command.equals("����")) {
				FileDialog fileOpen = new FileDialog(TextEditor.this, "���Ͽ���", FileDialog.LOAD);
				fileOpen.setVisible(true);
				fileName = fileOpen.getDirectory() + fileOpen.getFile();
				System.out.println(fileName);
				// ���õ� ������ ������ TextArea�� �����ش�.
				fileOpen(fileName);
			} else if (command.equals("�ٸ� �̸����� ����")) {
				FileDialog fileSave = new FileDialog(TextEditor.this, "��������", FileDialog.SAVE);
				fileSave.setVisible(true);
				fileName = fileSave.getDirectory() + fileSave.getFile();
				System.out.println(fileName);
				// ���� Textarea�� ������ ������ ���Ͽ� �����Ѵ�.
				saveAs(fileName);
			} else if (command.equals("����")) {
				System.exit(0);
			}

		}

		WindowAdapter wa = new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		};
	}
}
