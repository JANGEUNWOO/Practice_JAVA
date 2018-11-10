package sec04.exam01_frame_windowevent;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TextFieldClass extends Frame {

   Label lid;
   Label lpwd;
   TextField tfId;
   TextField tfPwd;
   Button ok;
   
   //������
   public TextFieldClass(String title) {
      super(title);       //frame(String title)�� ȣ���Ѵ�.
   }
   
   public void textFieldShow() {
      this.lid = new Label("ID : ", Label.RIGHT); //Label�� �ؽ�Ʈ ������ ����������.
      this.lpwd = new Label("Password : ", Label.RIGHT);
      
      //10���� ���ڸ� �Է��� �� �ִ� �ؽ�Ʈ�ʵ� ����
      this.tfId = new TextField(10);
      this.tfPwd = new TextField(10);
      this.tfPwd.setEchoChar('*');         //�Է��� �� ��� '*'�� ���̰� ��
      this.ok = new Button("OK");
      
      //������ â�� �̺�Ʈ ó���� ���� Listener�� �߰�
      this.addWindowListener(new WindowEventHandler());
      
      //�Ʒ��� ���� �͸� ������ü�� �����, �� �������̽��� �����
      //�߻�޼��带 ���� �������̵� �ؾ��Ѵ�.
      
      /*this.addWindowListener(new WindowListener() {   
         @Override
         public void windowOpened(WindowEvent e) {}
         
         @Override
         public void windowIconified(WindowEvent e) {}
         
         @Override
         public void windowDeiconified(WindowEvent e) {}
         
         @Override
         public void windowDeactivated(WindowEvent e) {}
         
         @Override
         public void windowClosing(WindowEvent e) {}
         
         @Override
         public void windowClosed(WindowEvent e) {}
         
         @Override
         public void windowActivated(WindowEvent e) {}
      });*/
      
      //OK��ư�� �ؽ�Ʈ�ʵ忡 �̺�Ʈó���� ���� Listener�� �߰��Ѵ�.
      this.tfId.addActionListener(new EventHandler());
      
      //�Ʒ��� ���� �͸�����ü�� ���� �ȴ�. ���� �ڵ��� ���� ���� �� ���̴�.
      /*this.tfId.addActionListener(new ActionListener() {
         
         @Override
         public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            
         }
      });*/
      
      this.tfPwd.addActionListener(new EventHandler());
      this.ok.addActionListener(new EventHandler());
      
      this.setLayout(new FlowLayout());
      this.add(lid);
      this.add(tfId);
      this.add(lpwd);
      this.add(tfPwd);
      this.add(ok);
      
      //this.tfId.setText("���̵� �Է�");       //�⺻ �ؽ�Ʈ ����
      //this.tfId.setBackground(Color.BLUE);      //������Ʈ ���� ����
      this.setSize(450, 100);
      this.setLocation(500, 300);
      this.setVisible(true);         //frame�� ȭ�鿡 ���̰� �Ѵ�.
      
   }
   
   //��øŬ���� EventHandler�ۼ�
   class EventHandler implements ActionListener {

      @Override
      public void actionPerformed(ActionEvent e) {
         String id = tfId.getText();
         String password = tfPwd.getText();
         //���� db�����̶�� �̺κп��� ���� ���ϰ� ó���ϸ� �� ���̴�.
         if(!id.equals("perpear")) {
            System.out.println("�Է��Ͻ� id�� ��ȿ���� �ʽ��ϴ�. �ٽ� �Է��� �ּ���.");
            //id�� �ٽ� �Է��� �� �ֵ���, focus�� tfId�� �ű��.
            tfId.requestFocus();
            tfId.selectAll();      //tfid�� �Էµ� text�� ���õǵ��� �Ѵ�.
         }
         else if (!password.equals("12345")) {
            System.out.println("�Է��Ͻ� ��й�ȣ�� Ʋ�Ƚ��ϴ�. �ٽ� �Է��� �ֽñ� �ٶ��ϴ�.");
            
            //id�� �ٽ� �Է��� �� �ֵ��� focus�� tfid�� �ű��.
            tfPwd.requestFocus();
            tfPwd.selectAll();
         }
         else {
            System.out.println(id + "��, ���������� �α��� �Ǿ����ϴ�.");
         }
      }
      
   }
   //��øŬ���� -- ������ X��ư �������� ����, �̹����� windowsadapter�̿�
   class WindowEventHandler extends WindowAdapter {
      @Override
      public void windowClosing(WindowEvent e) {
         System.out.println("������ �̺�Ʈ �߻�");
         e.getWindow().setVisible(true);   //ȭ�� �����, �޸� ���� �ȵ�.
         e.getWindow().dispose();      //�޸� ����
         System.exit(0);               //���α׷� ����
      }
   }
}
