package sec02_exam_DrawShape;

public class Circle extends Shape{

	Point center=null;  //원의 원점좌표(포함관계)
	int r;              //반지름
	
	
	//Circle(Point center, int r)를 호출
	public Circle() {
		//this(Point클래스의 인스턴스 주소값,100)을 가지는 생성자를 호출
		this(new Point(0,0),100);  //this(int x,int y)-->매개변수 2개 int형 가지는 생성자 호출
		//this(center,100);
	}
	
	
	//center는 Point의 참조변수(주소값), r=100
	public Circle(Point center, int r) {
		super();      //조상클래스의 생성자를 호출..this()자기 자신 생성자를 호출
		this.center=center;  //0,0
		this.r=r;            //10
		
		
	}
	
	//조상클래스의 멤버메서드만 draw()를 오버라이딩(재정의)함
	//원을 그리는 대신에 원의 경로를 출력하도록 했다.
	//(오버라이딩:선언부가 무조건 같고, 구현부면 다르게 구현함)
	
	@Override
	public void draw() {
		System.out.printf("[center(원점)+(%d,%d),r(반지름)=%d,color(색깔)=%s]%n",
		    this.center.x,this.center.y,this.r,this.color);
	}
	
	
	
}
