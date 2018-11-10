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
		
		super(title); //Frame(String title)을 호출한다.
		
	}
	
	public void textComponentShow() {
		this.textField=new TextField();
		this.textArea=new TextArea();
		this.add(textArea, "Center");
		this.add(textField,"South");
		
		/*
		 * ActionEvent 가 생성되는 것은 4가지에 해당한다고 이미 강의에서 설명함
		 * 1.Button 누름
		 * 2. Menu를 클릭
		 * 3. TextField에서 Enter키를 누름
		 * 4. List의 item하나를 선택하여 더블클릭했을 떄
		 * 
		 */
		//TextField컴포넌트에 ActionListioner를 익명 구현객체로 넣고 있다.
		this.textField.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//TextField에서 Enter를 치면, textField에 입력된 text를 TextArea에 추가한다.
				textArea.append(textField.getText()+"\n");
				textField.setText("");
				textField.requestFocus();
			}
		});
		this.textArea.setEditable(false);  //TextArea의 text를 편집하지 못하게 한다.
		this.setSize(300, 200);
		this.setLocation(500, 300);
		this.setVisible(true);
		textField.requestFocus();   //focus가 TextField에 위치하도록 한다.
		//윈도우 이벤트 추가
		WindowAdapter we=new WindowAdapter() {
			 @Override
		      public void windowClosing(WindowEvent e) {
		              
		         System.exit(0);             
		      }
	    };
	    
	    this.addWindowListener(we);
	}
}
	

	
	
	
