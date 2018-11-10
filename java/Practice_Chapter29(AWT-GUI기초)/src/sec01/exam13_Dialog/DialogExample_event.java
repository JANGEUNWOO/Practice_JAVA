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
		
		Label msg=new Label("�� ���� �����",Label.CENTER);  //���� �߾�����
		Button ok=new Button("ok");
		
		/*
		 * OK��ư�� ActionListener�� �߰��Ͽ���. �����ʴ� �����Ѵٰ� �����ϸ� �ȴ�.
		 * �Ͽ�, �Ű������� �������̽��� ActionListener�� ������ �ְ� �װ��� �͸�����
		 * �����Ͽ���. ���� OK��ư�������� Dialog�� ����� ���̴�.
		 * 
		 */
		
		ok.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
			  System.out.println("actionPerformed");
			  //info.setVisible(false); //Dialog�� �Ⱥ��̰� �Ѵ�.(�޸� ���� ����)
			                            //Dialog�� �޸𸮿��� ���ش�.
			}
		});
		
		/*
		 * ������ �̺�Ʈ ó���κ�, �Ű������� windowAdaptorŬ�����̴�.
		 * windowAdaptorŬ������ windowListenner�������̽��� �ִ� 
		 * 7���� �߻�޼��带 ������ ���Ҵ�.({}���θ� �س��Ҵ�. �� ������ ����.)
		 * 
		 */
		
		f.addWindowListener(new WindowAdapter() {;
		  @Override
		  public void windowClosing(WindowEvent e) {
		   e.getWindow().setVisible(false); //������ â�� ������ �ʰ� �Ѵ�.
		   e.getWindow().dispose();        //�������� �޸𸮿��� �����Ѵ�.
		   System.exit(0);                 //���α׷� ����
		  }
	    });
		
		info.add(msg);
		info.add(ok);
		f.setVisible(true);
		info.setVisible(true);
	}

}
