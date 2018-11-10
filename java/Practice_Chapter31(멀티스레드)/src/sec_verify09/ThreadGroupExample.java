package sec_verify09;

public class ThreadGroupExample {

	public static void main(String[] args) {

		ThreadGroup maingroup = Thread.currentThread().getThreadGroup();
		UnitThread main = new UnitThread(maingroup, "main");

		ThreadGroup AGroup = new ThreadGroup("AGroup");
		ThreadGroup BGroup = new ThreadGroup("BGroup");

		UnitThread AGroup_Thread1 = new UnitThread(AGroup, "AGroup_Thread1");
		UnitThread BGroup_Thread1 = new UnitThread(BGroup, "BGroup_Thread1");

		ThreadGroup A_subgroup = new ThreadGroup(AGroup, "A_subgroup");
		ThreadGroup B_subgroup = new ThreadGroup(BGroup, "B_subgroup");

		UnitThread A_subgroupthread1 = new UnitThread(A_subgroup, "A_subgroupthread1");
		UnitThread A_subgroupthread2 = new UnitThread(A_subgroup, "A_subgroupthread2");

		main.start();
		BGroup_Thread1.start();
		AGroup_Thread1.start();
		A_subgroupthread1.start();
		A_subgroupthread2.start();

		maingroup = Thread.currentThread().getThreadGroup();
		System.out.println();

		try {
			Thread.sleep(3000);
			A_subgroupthread1.interrupt();
			A_subgroupthread2.interrupt();
			AGroup_Thread1.interrupt();
			BGroup_Thread1.interrupt();
		} catch (InterruptedException e) {
		}

		

	}

}
