package sec07_verify;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class MouseEventEx extends JFrame{
    JPanel contentPane=new JPanel();
    JLabel la = new JLabel("Love Java");
    
    MouseEventEx(){
        this.setTitle("���콺 �ø��� ������");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.setContentPane(contentPane);
        la.addMouseListener(new MyMouseListener());
        contentPane.add(la);
        
        this.setSize(300,300);
        this.setVisible(true);
        
        contentPane.requestFocus();
    }
    class MyMouseListener extends MouseAdapter{
           
            @Override
            public void mouseEntered(MouseEvent e) {
                JLabel j = (JLabel)e.getSource();
                j.setText("�����");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                JLabel j = (JLabel)e.getSource();
                j.setText("Love Java");
            }
    }
}
	