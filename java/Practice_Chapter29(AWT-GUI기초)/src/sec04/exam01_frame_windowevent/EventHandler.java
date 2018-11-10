package sec04.exam01_frame_windowevent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class EventHandler implements WindowListener {
	
	
	public EventHandler() {
		System.out.println("EventHandler ÀÎ½ºÅÏ½º »ý¼ºµÊ");

    }
	
	
   @Override
    public void windowActivated(WindowEvent e) {
	   // TODO Auto-generated method stub

   	}
   @Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
   @Override
	public void windowClosing(WindowEvent e) {
		System.out.println(e.toString());
		e.getWindow().setVisible(false);
		e.getWindow().dispose();
		System.out.println("windowClosing()È£Ãâ·Î À©µµ¿ì ´ÝÈû!");
		System.exit(0);
		
	}

   @Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


   @Override
   	public void windowOpened(WindowEvent e) {
	// TODO Auto-generated method stub
	
   	}


   @Override
   	public void windowIconified(WindowEvent e) {
	// TODO Auto-generated method stub
	
   }


   @Override
   	public void windowDeiconified(WindowEvent e) {
	// TODO Auto-generated method stub
	
   	}

		
		
		
}
