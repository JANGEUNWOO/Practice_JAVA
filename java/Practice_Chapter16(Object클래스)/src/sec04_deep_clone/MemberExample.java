package sec04_deep_clone;

import java.util.Arrays;

public class MemberExample {

	public static void main(String[] args) {
		
		
		Member original=new Member("홍길동",25,new int[] {90,100},new Car("소나타"));
		
		//통상적으로 원본객체의 보존을 위해 clone을 해서 복제객체를 통해 작업을 많이 한다.
		Member cloned=original.getMember();//얕은 복제인 인스턴스 가지고 옴.
		
		//얕은 복제를 했다면 원본객체의 값도 변경되지만, 깊은 복제를 했기 때문에 원본객체의
		//참조형 타입에 영향을 끼치지 않는다.
		cloned.scores[0]=9999;
		cloned.car.model="그랜저";
		
		System.out.println("{원본 객체의 필드 값}");
		System.out.println("name:"+original.name);
        System.out.println("age:"+original.age);
        System.out.println(Arrays.toString(original.scores));
        System.out.println("car:"+original.car.model);
        System.out.println();
        
        System.out.println("{복제 객체의 필드 값}");
        System.out.println("name:"+cloned.name);
        System.out.println("age:"+cloned.age);
        System.out.println(Arrays.toString(original.scores));
        System.out.print("car:"+cloned.car.model);
       
	}

}
