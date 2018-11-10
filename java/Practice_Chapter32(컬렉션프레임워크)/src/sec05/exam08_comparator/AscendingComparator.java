package sec05.exam08_comparator;

import java.util.Comparator;

//Fruit객체를 대상으로 하는 비교자
public class AscendingComparator implements Comparator<Fruit> {

	//이거 오름차순정렬이다. 이걸 리턴값을 바꾸면 내림차순이 된다.
	@Override
	public int compare(Fruit o1, Fruit o2) {
		if(o1.getPrice()<o2.getPrice()) {
			return -1;
		}else if(o1.getPrice()==o1.getPrice()) {
			return 0;
		}else {
			return 1;
		}
	}
	
}
