package sec_verify06;

public class PriorityThreadExample {

	public static void main(String[] args) {

		PriorityThread pt1 = new PriorityThread("Power");
		PriorityThread pt2 = new PriorityThread("Water");
		PriorityThread pt3 = new PriorityThread("Fire");

		pt1.setPriority(1);
		pt2.setPriority(5);
		pt3.setPriority(10);
		pt1.start();
		pt2.start();
		pt3.start();
	}

}
