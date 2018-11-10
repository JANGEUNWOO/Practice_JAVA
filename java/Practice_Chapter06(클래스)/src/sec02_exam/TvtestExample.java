package sec02_exam;

public class TvtestExample {

	public static void main(String[] args) {
		
		
		Tv t1=new Tv(); //new라는 연산자가 오면 아무 이유 없이 힙에다가 클래스의 크기 만큼 메모리를 할당한다.
		Tv t2=new Tv();
		System.out.println("t1의 channel값은"+t1.channel+"입니다.");
		System.out.println("t2의 channel값은"+t2.channel+"입니다.");
		
		/*system.out.println("t1의 주소:"+t1.toString());
		 *system.out.println("t2의 주소:"+t2.toString());
		 */
		
		t2=t1; //t2이 주소값 변경함.(즉 같은 인스턴스를 가르키고 있다)
		
		/*system.out.println("t1의 주소:"+t1.toString());
		 * system.out.println("t2의 주소:"+t2.toStirng());
		 */
		
		//channel의 값을 7으로 한다.
		t1.channel=7;
		System.out.println("t1의 cjannel1값을 7로 변경하였습니다.");
		System.out.println("t2의 cjannel1값은"+t1.channel);
		System.out.println("t2의 cjannel1값은"+t1.channel);
		

	}

}
