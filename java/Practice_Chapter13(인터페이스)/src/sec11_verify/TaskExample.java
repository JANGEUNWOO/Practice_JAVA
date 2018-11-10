package sec11_verify;

public class TaskExample {

	public static void main(String[] args) {
		System.out.println("☆☆☆나의 우선순위별 업무리스트☆☆☆");
		System.out.println("일의이름   소요시간   우선순위");
		Task task=new Task("영어공부",30);
		task.setPriority(3);
		task.getPriority();

		Task task2=new Task("수학공부",80);
		task2.setPriority(1);
		task2.getPriority();
		
		Task task3=new Task("자바공부",150);
		task3.setPriority(2);
		task3.getPriority();
	}
}
