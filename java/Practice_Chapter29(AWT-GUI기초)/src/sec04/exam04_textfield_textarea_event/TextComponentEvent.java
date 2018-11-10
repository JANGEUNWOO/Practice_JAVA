package sec04.exam04_textfield_textarea_event;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TextComponentEvent extends Frame{

	
	
	
	TextField textField=new TextField(); 
	TextArea textArea=new TextArea();
	
	
	public TextComponentEvent(String title) {
		
		super(title); //Frame(String title)�� ȣ���Ѵ�.
		
	}
	
	public void textComponentShow() {
		this.textField=new TextField();
		this.textArea=new TextArea();
		this.add(textArea, "Center");
		this.add(textField,"South");
		
		/*
		 * ActionEvent �� �����Ǵ� ���� 4������ �ش��Ѵٰ� �̹� ���ǿ��� ������
		 * 1.Button ����
		 * 2. Menu�� Ŭ��
		 * 3. TextField���� EnterŰ�� ����
		 * 4. List�� item�ϳ��� �����Ͽ� ����Ŭ������ ��
		 * 
		 */
		//TextField������Ʈ�� ActionListioner�� �͸� ������ü�� �ְ� �ִ�.
		this.textField.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//TextField���� Enter�� ġ��, textField�� �Էµ� text�� TextArea�� �߰��Ѵ�.
				textArea.append(textField.getText()+"\n");
				textField.setText("");
				textField.requestFocus();
			}
		});
		this.textArea.setEditable(false);  //TextArea�� text�� �������� ���ϰ� �Ѵ�.
		this.setSize(300, 200);
		this.setLocation(500, 300);
		this.setVisible(true);
		textField.requestFocus();   //focus�� TextField�� ��ġ�ϵ��� �Ѵ�.
		//������ �̺�Ʈ �߰�
		WindowAdapter we=new WindowAdapter() {
			 @Override
		      public void windowClosing(WindowEvent e) {
		              
		         System.exit(0);             
		      }
	    };
	    
	    this.addWindowListener(we);
	}
}
	

	
	
	
