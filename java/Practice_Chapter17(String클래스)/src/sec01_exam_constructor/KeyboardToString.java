package sec01_exam_constructor;

public class KeyboardToString {
	//JVM���� ���ܸ� ����
	public static void main(String[] args) {
		
		byte[] bytes=new byte[100]; //�⺻��0���� ����
		//Scanner scan=new Scanner(System.in);
		System.out.print("�Է�: ");
       
		//Ű����� �Է¹޴´�.(�Է¹��� ����Ʈ ���� ����)
		int readByteNo;
		
	    try {
	    	readByteNo=System.in.read(bytes);
	    	String str=new String(bytes,0,readByteNo-2);//2�� ���� ����? ����Ű������..
	    	str.getBytes("UTF-8");
	    	//str.getBytes("EUC-KR");
	    	
	    	System.out.println(str);
	    	System.out.println("�Է¹��� ����Ʈ��: "+readByteNo);
	    }catch(Exception e) {e.printStackTrace();}
	    //scan.close();
	}
}
