package sec05.exam02_graphics_awt_thread;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("���α׷����� ������:"+Thread.currentThread().getName());
		new GraphicExample("Graphic");

	}

}
