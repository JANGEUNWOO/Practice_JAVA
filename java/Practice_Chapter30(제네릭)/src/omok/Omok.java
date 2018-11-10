package omok;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Omok extends Frame implements MouseListener {

   final int LINE_NUM = 9;
   final int LINE_WIDTH = 30;
   final int BOARD_SIZE = LINE_WIDTH * (LINE_NUM-1);
   final int STONE_SIZE = (int)(LINE_WIDTH*0.8);
   
   final int XO;
   final int YO;
   
   final int FRAME_WIDTH;
   final int FRAME_HEIGHT;
   
   Image img = null;
   Graphics gImg = null;
   
   public Omok(String title) {
      super(title);
      addMouseListener(this);
      addWindowListener(new WindowAdapter() {
         @Override
         public void windowClosing(WindowEvent e) {
            System.exit(0);
         }
      });
      
      setVisible(true);
      Insets insets = getInsets();
      
      
      XO = insets.left + LINE_WIDTH;
      YO = insets.top + LINE_WIDTH;
      
      FRAME_WIDTH = BOARD_SIZE + LINE_WIDTH*2 + insets.left + insets.right;
      FRAME_HEIGHT = BOARD_SIZE + LINE_WIDTH*2 + insets.top + insets.bottom;
      
      setBounds(100, 100, FRAME_WIDTH, FRAME_HEIGHT);
      img = createImage(FRAME_WIDTH, FRAME_HEIGHT);
      gImg = img.getGraphics();
      
      setResizable(false);
      drawBoard(gImg);
   }
   
   public void drawBoard(Graphics g) {
      for(int i = 0; i<LINE_NUM; i++) {
         g.drawLine(XO, YO+i*LINE_WIDTH, XO+BOARD_SIZE, YO+i*LINE_WIDTH);
         g.drawLine(XO+i*LINE_WIDTH, YO, XO+i*LINE_WIDTH, YO+BOARD_SIZE);
      }
   }
   
   public void paint(Graphics g) {
      if(img == null) return;
      
      g.drawImage(img, 0, 0, this);
   }
   
   public void mousePressed(MouseEvent e) {
      int x = e.getX();
      int y = e.getY();
      
      if(x < XO-LINE_WIDTH/2 || x > XO+(LINE_NUM-1) * LINE_WIDTH + LINE_WIDTH / 2)
         return;
      if(y < YO-LINE_WIDTH/2 || y > YO+(LINE_NUM-1) * LINE_WIDTH + LINE_WIDTH / 2)
         return;
      
      x = (x-XO + LINE_WIDTH/2)/LINE_WIDTH * LINE_WIDTH + XO;
      y = (y-YO + LINE_WIDTH/2)/LINE_WIDTH * LINE_WIDTH + YO;
      
      x -= STONE_SIZE/2;
      y -= STONE_SIZE/2;
      
      if(e.getModifiersEx() == MouseEvent.BUTTON1_DOWN_MASK) {
         gImg.setColor(Color.BLACK);
         gImg.fillOval(x, y, STONE_SIZE, STONE_SIZE);
      }
      else if (e.getModifiersEx() == MouseEvent.BUTTON3_DOWN_MASK) {
         gImg.setColor(Color.WHITE);
         gImg.fillOval(x, y, STONE_SIZE, STONE_SIZE);
         gImg.setColor(Color.black);
         gImg.drawOval(x, y, STONE_SIZE, STONE_SIZE);
      }
      
      repaint();
   }

   @Override
   public void mouseClicked(MouseEvent e) {}

   @Override
   public void mouseReleased(MouseEvent e) {}

   @Override
   public void mouseEntered(MouseEvent e) {}

   @Override
   public void mouseExited(MouseEvent e) {}
}
