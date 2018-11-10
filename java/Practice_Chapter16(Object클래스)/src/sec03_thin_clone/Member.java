package sec03_thin_clone;

public class Member implements Cloneable {

	
	String id;
	String name;
	String password;
	int age;
    boolean adult;
    int[] scores=null;  //참조타입
	
    //생성자
    public Member(String id, String name, String password, int age, boolean adult,int[] scores) {
      this.id=id;
      this.name=name;
      this.age=age;
      this.adult=adult;
      this.scores=scores;
}
    //앝은 복제인 인스턴스를 리턴
    public Member getMember() {
    	Member cloned=null;
    	try {
    	cloned=(Member)this.clone();
    	}catch(CloneNotSupportedException e){}
    	
    	return cloned;   //얕은 복제(thin cloned)로 Member인스턴스 리턴함.
    }
}

