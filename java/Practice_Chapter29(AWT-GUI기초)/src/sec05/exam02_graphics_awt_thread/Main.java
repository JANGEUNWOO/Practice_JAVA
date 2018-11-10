package sec05.exam02_graphics_awt_thread;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("프로그램시작 스레드:"+Thread.currentThread().getName());
		new GraphicExample("Graphic");

	}

}
