package sec05_throws;

public class ThrowsExample02 {
	   public static void main(String[] args) {
		      
		      try {
		         findClass();
		      } 
		      
		      //���ܸ� �޾Ƽ� ȣ���� ������ ó����
		      catch (ClassNotFoundException e) {
		         System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
		         e.printStackTrace();
		      }

		   }
		   
		   public static void findClass() throws ClassNotFoundException{
		      //ClassNotFoundException�� �߻������� �����̴�.
		      Class clazz = Class.forName("java.lang.String");//���� ���ܰ� �߻��ϴ� �κ�
		   }

}
