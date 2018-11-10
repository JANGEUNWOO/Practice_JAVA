package sec04_exam_thismethod;

public class Car {

	

		
		String color;  //색상
		String gearType; //변속기 종류>auto, manual
		int door;
		
		//기본생성자
		//생성자가 여러개가 있을 때는 항상 오버로딩의 규칙을 따라야 한다는 것을 주목하자.
		
		public Car() {
			this("white","auto",4);
			System.out.println("기본생성자 호출"); //매개변수가 3개인 생성자 호출
			
		}
		
		public Car(String color) {
			this(color, "auto", 4); //color값을 가지고 매개변수 3개인 생성자 호출
		}
		
		public Car(String color, String gearType) {
			this(color, gearType, 4);
		}
		
		//매개변수가 있는 생성자
		public Car(String color, String gearType, int door) {
			this.color=color;
			this.gearType=gearType;
			this.door=door;
			
			
		}
		@Override
		public String toString() {
			String str="색깔"+this.color+",기어타입"+
			      this.gearType+", 문 갯수="+this.door;
			   return str;
	
	}
		
}
	
	

