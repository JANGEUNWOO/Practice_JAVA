package sec04.exam05_checkbox_event;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CheckBoxEx extends Frame {

	CheckboxGroup group;
	Checkbox cb1;
	Checkbox cb2;
	Checkbox cb3;
	
	
	//�����ڿ��� �� ��������� �ִ�.
	
	public CheckBoxEx(String title) {
		super(title);
		this.group=new CheckboxGroup();
		
		
		//�Ʒ� 3���� CheckBox�� CheckBoxGroup�� ���ϰ� ������, �ϳ��ۿ� ������ ���� ���Ѵ�.
		//����, �Ű��� �� �������� true�� ����� �̸� üũ�� �϶�� �� ���̴�.
		this.cb1=new Checkbox("red",group,true);
		this.cb2=new Checkbox("green",group,false);
		this.cb3=new Checkbox("blue",group,false);
		
		//Checkbox�� ������ CYAN���� �����Ͽ���.
		this.cb1.setBackground(Color.cyan);
		this.cb2.setBackground(Color.CYAN);
		this.cb3.setBackground(Color.CYAN);
		
		//Checkbox�� ItemListener�� ���̰� �ִ�.
		this.cb1.addItemListener(new EventHandler());
		this.cb2.addItemListener(new EventHandler());
		this.cb3.addItemListener(new EventHandler());
		
		this.setLayout(new FlowLayout());
		this.add(cb1);
		this.add(cb2);
		this.add(cb3);
		this.setBackground(Color.RED);  //���۽� �����ӻ����� red�� ����
		this.setLocation(500, 300);
		this.setSize(500, 300);
		this.setVisible(true);
		
		
		WindowAdapter wa=new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		};
		this.addWindowListener(wa);
		
	}
	//��ø Ŭ������ ItemListener�� ������ Ŭ����
	class EventHandler implements ItemListener{
		//Checkbox�� Radio��ư�� Ŭ���ϸ� itemStateChanged()�� ȣ��ȴ�.
		@Override
		public void itemStateChanged(ItemEvent e) {
			System.out.println("ItemEvent�߻�");
			//getSource()�� ��� �̺�Ʈ Ŭ������ ������ java.util.EventObjectŬ������
			//�ִ� �޼���� �����ϰ� ��� �̺�Ʈ Ŭ�������� ����Ҽ� �ִ�.
			//����Ÿ���� Object�� Ÿ�Ժ�ȯ�� �ϰ� �ִ�.
			Checkbox cb=(Checkbox)e.getSource();
			//Checkbox�� Label���� �� �Ʒ��� ���� �񱳸� �ϰ� �ִ�.
			String color=cb.getLabel();
			if(color.equals("red")) {
				//�ܺ� Ŭ���� �����Ͽ� ������ �ٲٰ� �ִ�.
				CheckBoxEx.this.setBackground(Color.red);
			}else if(color.equals("green")) {
				CheckBoxEx.this.setBackground(Color.green);
			}else {
				CheckBoxEx.this.setBackground(Color.BLUE);
			}
	   }
	}
}
