package sec04_throw;

public class ThrowExample3 {

	public static void main(String[] args) {
		
		
	   String file1=createFile("test.txt");
	   String file2=createFile("");
	   
	   System.out.println(file1+"������ ���������� �����Ǿ����ϴ�.");
	   System.out.println(file2+"������ ���������� �����Ǿ����ϴ�.");
       
	}
	private static String createFile(String fileName) {
		  try {
			   if(fileName==null || fileName.equals("")) {
				   throw new Exception("�����̸��� ��ȿ���� �ʽ��ϴ�.");
			   }
		   }
		   catch(Exception e) {
			   //fileName�� �� ������ ���, ���� �̸��� '�������.txt�� �Ѵ�.
			   fileName ="�������.txt";
		   }
		   return fileName;
	}

}
