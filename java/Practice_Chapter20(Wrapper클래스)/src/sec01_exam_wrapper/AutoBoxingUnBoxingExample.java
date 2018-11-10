package sec01_exam_wrapper;

import java.util.List;
import java.util.Vector;

public class AutoBoxingUnBoxingExample {

	public static void main(String[] args) {
		
		
		//자동 박싱
		Integer obj=100;
		Integer obj1=new Integer(100);
		List<Integer> list=new Vector<Integer>();
		list.add(100);
		list.add(obj);
		list.add(obj1);
		System.out.println("value:"+obj);
		System.out.println("value1:"+obj.intValue());
	    System.out.println("value2:"+list.get(0));
	    System.out.println("Vector에 저장되어 있는 값:"+list.toString());
		list.toString();
		//대명사 자동언박싱(랩핑 되어 있는 100이 나와서 기본형에 저장되는 꼴)
		//int value=obj.intvalue(); <===정확한 코딩코드
		int value=obj;
		System.out.println("value2:"+value);
		
		//연산자 자동언박싱
		//객체+기본형(원래 문법 에러이지만 랩핑객체라서 컴파일러가
		//알아서 자동언박싱을 해주어 가능한것이다
		
		int result=obj+100;
		System.out.println("result:"+result);

	}

}
