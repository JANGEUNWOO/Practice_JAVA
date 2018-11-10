package sec02_exam;

public class ReferenceReturnClass {

	public static void main(String[] args) {
		
		
		Data d=new Data();
		d.x=10;
		
		//참조변수 d를 매개변수로 던진다. 아울러 반환값을 Data타입으로 받는다.
		
		Data d2=ReferenceReturnClass.copy(d);
		System.out.println("d.x="+d.x);
		System.out.println("d2.x="+d2.x);
		System.out.println("d주소="+d);
		System.out.println("d2주소="+d2);
		

	    }
	   //반환형이 Data클래스 타입이며, 매개변수 역시 Data의 참조변수형이다.
	   public static Data copy(Data d) {
          Data tmp=new Data();
        	tmp.x=d.x;
        	System.out.println("tmp주소="+tmp);
        	return tmp;
          
	   }   
          
	   
     
}
