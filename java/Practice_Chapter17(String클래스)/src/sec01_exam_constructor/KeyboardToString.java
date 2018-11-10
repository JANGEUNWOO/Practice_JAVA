package sec01_exam_constructor;

public class KeyboardToString {
	//JVM에게 예외를 던짐
	public static void main(String[] args) {
		
		byte[] bytes=new byte[100]; //기본값0으로 셋팅
		//Scanner scan=new Scanner(System.in);
		System.out.print("입력: ");
       
		//키보드로 입력받는다.(입력받은 바이트 수를 리턴)
		int readByteNo;
		
	    try {
	    	readByteNo=System.in.read(bytes);
	    	String str=new String(bytes,0,readByteNo-2);//2를 빼는 이유? 엔터키떄문에..
	    	str.getBytes("UTF-8");
	    	//str.getBytes("EUC-KR");
	    	
	    	System.out.println(str);
	    	System.out.println("입력받은 바이트수: "+readByteNo);
	    }catch(Exception e) {e.printStackTrace();}
	    //scan.close();
	}
}
