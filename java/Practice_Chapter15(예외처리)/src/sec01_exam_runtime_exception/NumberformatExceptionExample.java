package sec01_exam_runtime_exception;

public class NumberformatExceptionExample {

	public static void main(String[] args) {
		
		
		String data1="100";
		String data2="a100";
		
		
		int value1=Integer.parseInt(data1);
		
		//NumberFormatException발생 이유?
		int value2=Integer.parseInt(data2);

	}

}
