package sec02_exam_constructor;

public class StringTrimExample {

	public static void main(String[] args) {
		
		//trim은 좌우 공백만 없앤다.
		//가운데 공백을 없애려면 새로운 코드를 작성해야한다. replaceAll("\\p[Z]","")
		String tel1="  02";
	    String tel2="123   ";
	    String tel3="  12  34  ";
	    String tel=tel1.trim()+tel2.trim()+tel3.trim();
	    System.out.println(tel);
		
	}

}
