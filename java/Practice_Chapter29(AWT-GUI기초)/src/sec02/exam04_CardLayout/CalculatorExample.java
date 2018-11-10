package sec02.exam04_CardLayout;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CalculatorExample {

   public static void main(String[] args) {
      
      Frame f = new Frame("°è»ê±â");
      f.setSize(190, 160);
      f.setLayout(new BorderLayout(5,5));
      
      Panel pn2 = new Panel();
      pn2.setLayout(new GridLayout(4, 5, 4, 4));
      
      String[] str = new String[] {"7", "8", "9", "/", "CE",
                           "4", "5", "6", "*", "BS",
                           "1", "2", "3", "-", "1/x",
                           "0", "+/-", ".", "+", "="
                           };
      
      Button[] bt = new Button[str.length];
      
      for(int i = 0; i<str.length; i++) {
         bt[i] = new Button(str[i]);
         bt[i].setForeground(Color.BLACK);
         pn2.add(bt[i]);
      }
      
      f.add(BorderLayout.NORTH, new TextField("0"));
      f.add(BorderLayout.CENTER, pn2);
      f.setVisible(true);
      f.setResizable(false);
      
      
      f.addWindowListener(new WindowAdapter() {
         @Override
         public void windowClosing(WindowEvent e) {
            System.exit(0);
         }
      });
      
      
   }
}
