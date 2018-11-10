package sec_verify04_3;

public class ToiletUsingThread extends Thread {

	private Toilet toilet;
	private String name;

	public ToiletUsingThread(Toilet toilet, String name) {
		super(name);
		this.toilet = toilet;
		this.name = name;
	}

	public void run() {
		toilet.use();
	}

}
