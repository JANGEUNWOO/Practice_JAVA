package sec09_verify;

public class UtilExample {

	public static void main(String[] args) {
		Pair<String,Integer> p=new Pair<>("홍길동",35);
		Pair<String,Integer> p1=new ChildPair<>("홍삼원",30);
		OtherPair<String,Integer> p2=new OtherPair<String, Integer>("바바", 11);
		
		System.out.println("Pair의 객체를 생성할때, Util의 getValue()를 호출할때 K값 홍길동 주고 얻어진 V값 : "+Util.getValue(p,"홍길동"));
		System.out.println("ChildPair의 객체 생성할때 K값 홍삼원, Util의 getValue()를 호출할 때 K값 홍삼순 주고 얻어진 V값 : "+Util.getValue(p1,"홍삼순"));
		//System.out.println("일반예외사례"+Util.getValue(p2,"바바"));	

	}

}
