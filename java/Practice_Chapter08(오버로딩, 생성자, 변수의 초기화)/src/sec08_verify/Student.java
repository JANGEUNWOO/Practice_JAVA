package sec08_verify;

public class Student {

	
	String name;
	int kor;
	int eng;
	int math;
	int sum;
	float average;
	
	int getTotal() {
	
		return this.sum;
	}
	
	float getAverage() {
		
		return this.average;
	} 
	
	Student(){
		
		this("�����",218,72.7f);
	}
	
	Student(String name, int sum, float average){
		this.name=name;
		this.sum=sum;
		this.average=average;
		
		
	}
	
	
	@Override
	public String toString() {
		String str="�̸�:"+this.name+"����:"+
		      this.sum+"���:"+this.average;
		   return str;
	
	
    }
}
