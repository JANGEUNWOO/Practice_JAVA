package sec01_exam;



public class CompareOpEx {

	public static void main(String[] args) {
		
		
	 int num1=10;
	 int num2=10;
	 
	 boolean result1=(num1==num2);
	 boolean result2=(num1!=num2);
	 boolean result3=(num1<=num2);
	 
	 System.out.println("result1"+result1);
	 System.out.println("result2"+result2);
	 System.out.println("result3"+result3);
	 
	 char char1='A';
	 char char2='B';
	 //결국 여기서의 비교는 아스키코트값의 비교인 것이다.
	 boolean result4=(char1<char2);
	 System.out.println("result4"+result4);
	 
	 //문자를 아슼코드값으로 나오게 함
	 System.out.println((int)char1);
	 System.out.println((int)char2);
	 

	}

}
