package sec04_verify;

public class Document {

	static int count=0;	
	String name;
	
	Document(){
		++count;
		this.name = "�������"+count;
		System.out.println("���� "+this.name+"�� �����Ǿ����ϴ�.");

	}
	Document(String name){
		this.name=name;
		System.out.println("���� "+this.name+"�� �����Ǿ����ϴ�.");

	}
}
