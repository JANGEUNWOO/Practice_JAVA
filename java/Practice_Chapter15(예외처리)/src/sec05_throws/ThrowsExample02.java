package sec05_throws;

public class ThrowsExample02 {
	   public static void main(String[] args) {
		      
		      try {
		         findClass();
		      } 
		      
		      //예외를 받아서 호출한 곳에서 처리함
		      catch (ClassNotFoundException e) {
		         System.out.println("클래스가 존재하지 않습니다.");
		         e.printStackTrace();
		      }

		   }
		   
		   public static void findClass() throws ClassNotFoundException{
		      //ClassNotFoundException가 발생가능한 예외이다.
		      Class clazz = Class.forName("java.lang.String");//실제 예외가 발생하는 부분
		   }

}
