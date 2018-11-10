package sec05.exam04_graphics_iamge02;

public class Main {

	public static void main(String[] args) {

		System.out.println("프로그램시작 스레드:" + Thread.currentThread().getName());
		new GraphicExample("Graphic");

	}

}
