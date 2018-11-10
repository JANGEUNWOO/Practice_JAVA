package sec01.exam13_Dialog;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class DialogExample_event {

	public static void main(String[] args) {
		Frame f=new Frame("Parent");
		f.setSize(500,500);
		
		Dialog info= new Dialog(f,"infomation",true);
        info.setSize(150,100);
		info.setLocation(550,50);
		info.setLayout(new FlowLayout());
		
		Label msg=new Label("이 라벨은 모달임",Label.CENTER);  //글자 중앙정렬
		Button ok=new Button("ok");
		
		/*
		 * OK버튼에 ActionListener를 추가하였다. 리스너는 감시한다고 생각하면 된다.
		 * 하여, 매개값으로 인터페이스만 ActionListener를 가지고 있고 그것을 익명으로
		 * 구현하였다. 어제 OK버튼을누르면 Dialog가 사라질 것이다.
		 * 
		 */
		
		ok.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
			  System.out.println("actionPerformed");
			  //info.setVisible(false); //Dialog를 안보이게 한다.(메모리 제거 안함)
			                            //Dialog를 메모리에서 없앤다.
			}
		});
		
		/*
		 * 윈도우 이벤트 처리부분, 매개변수가 windowAdaptor클래스이다.
		 * windowAdaptor클래스는 windowListenner인터페이스에 있는 
		 * 7개의 추상메서드를 구현해 놓았다.({}으로만 해놓았다. 즉 내용이 없다.)
		 * 
		 */
		
		f.addWindowListener(new WindowAdapter() {;
		  @Override
		  public void windowClosing(WindowEvent e) {
		   e.getWindow().setVisible(false); //윈도우 창을 보이지 않게 한다.
		   e.getWindow().dispose();        //프레임을 메모리에서 제거한다.
		   System.exit(0);                 //프로그램 종료
		  }
	    });
		
		info.add(msg);
		info.add(ok);
		f.setVisible(true);
		info.setVisible(true);
	}

}
