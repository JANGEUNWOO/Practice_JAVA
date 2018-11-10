package sec01.exam14_FileDialog;

import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FileDialogExample {

	public static void main(String[] args) {
		
		
		Frame f=new Frame("Parent");
		f.setSize(200,200);
		
		//moda�� �⺻������ filedialog.save�� filedialog.load�� �����ȴ�.
		FileDialog fileopen=new FileDialog(f,"���Ͽ���",FileDialog.LOAD);
		
		f.setVisible(true);
		fileopen.setDirectory("C:\\");
		fileopen.setVisible(true);
		
		//������ ������ ����, filedialog�� �����ư�� ������,
		//getfile()�� getDirectory�� �̿��ؼ� �����̸��� ��ġ��
		//���丮�� ���� �� �ִ�.
		System.out.println(fileopen.getDirectory()+fileopen.getFile());
		
		//�Ʒ��κ��� ������ �����ϴ� �κ��̴�.
		fileopen=new FileDialog(f,"��������",FileDialog.SAVE);
		fileopen.setDirectory("c:\\");
		fileopen.setVisible(true);
		System.out.println(fileopen.getDirectory()+fileopen.getFile()+"�� ����Ǿ����ϴ�.");
		
		//������ �̺�Ʈ ó���κ� �߰�
		f.addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

	}

}
