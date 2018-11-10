package sec02_exam_DrawShape;

//독립적인 클래스 멤버갯수 : 3개(생성자는 상속이 아니된다. 아울러 초기화블럭도 상속이 안됨)
public class Point {
       
	
	  
	        int x;
	        int y;
	        
	        //기본생성자
	        public Point() {
	        	this(0,0);  //this():또다른 생성자를 호출, this(자기자신의 인스턴스를 의미)
	        }
	        
	        //매개변수 생성자(매개변수가 있는 생성자가 클래스내에 존재하면 기본생성자를 컴파일러가 따로 추가
	        public Point(int x, int y) {
	        	this.x=x;
	        	this.y=y;
	        }
           
	        //촤표값  변환
	        public String getxy() {
	        	return "("+this.x+","+this.y+")"; //x와 y의 값을 문자열로 변환
	        }

}
