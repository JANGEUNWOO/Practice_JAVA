package sec11_verify;

public class Task implements Priority{

	String taskName;
	int time;
	int priority_number;
	
	public Task(String taskName,int time) {
	  this.taskName=taskName;
	  this.time=time;
	
	}

	@Override
	public int getPriority() {
		System.out.println(this.taskName+"    "+time+"Ка"+"          "+this.priority_number);
		return 0;
	}

	@Override
	public void setPriority(int priority_number) {
		
		this.priority_number=priority_number;
	}
}
