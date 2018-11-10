package sec_verify01;

public class ThreadExample {

	public static void main(String[] args) {
		
		MovieThread mv = new MovieThread();
		Recording rm = new Recording();
		Thread thread = new Thread(rm);
		 
		mv.start();
		thread.start();
	
	}
}
