package sec04_deep_clone;

import java.util.Arrays;

public class Member implements Cloneable {

	
	//기본형타입은 얕은 복제를 해도 아무런 상관이 없어 복제가 된다.
	//하지만, 참조형 타입은 번지를 복제하기 때문에 문제가 발생이 된다.
	String name;
	int age;
    int[] scores=null;  //참조타입
    Car car=null;
	
    //생성자
    public Member(String name,int age,int[] scores,Car car) {
     
      this.name=name;
      this.age=age;
      this.scores=scores;
      this.car=car;
    }
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
    	//먼저 얕은 복제(Object의 clone()메서드를 먼저호출)
    	Member cloned=(Member)super.clone();
    	//Arrays.copyof는 원본배열 길이만큼 복사함
    	//참조타입의 경우는 반드시 프록래머가 복제되는 코드를 삽입을 해줘야 한다.
    	cloned.scores=Arrays.copyOf(this.scores, this.scores.length);
    	cloned.car=new Car(this.car.model);
    	return cloned; //깊은 복제를 한 cloned가 리턴함.
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

