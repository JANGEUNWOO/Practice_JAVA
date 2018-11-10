package sec01.exam14_FileDialog;

import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FileDialogExample {

	public static void main(String[] args) {
		
		
		Frame f=new Frame("Parent");
		f.setSize(200,200);
		
		//moda는 기본적으로 filedialog.save와 filedialog.load로 구성된다.
		FileDialog fileopen=new FileDialog(f,"파일열기",FileDialog.LOAD);
		
		f.setVisible(true);
		fileopen.setDirectory("C:\\");
		fileopen.setVisible(true);
		
		//파일을 선택한 다음, filedialog의 열기버튼을 누르면,
		//getfile()과 getDirectory를 이용해서 파일이름과 위치한
		//디렉토리를 얻을 수 있다.
		System.out.println(fileopen.getDirectory()+fileopen.getFile());
		
		//아래부분은 파일을 지정하는 부분이다.
		fileopen=new FileDialog(f,"파일저장",FileDialog.SAVE);
		fileopen.setDirectory("c:\\");
		fileopen.setVisible(true);
		System.out.println(fileopen.getDirectory()+fileopen.getFile()+"가 저장되었습니다.");
		
		//윈도우 이벤트 처리부분 추가
		f.addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

	}

}
