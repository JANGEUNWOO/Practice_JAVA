package sec01_verify;

public class Exercise02 {

	public static void main(String[] args) {
		int score = 85;

		String result = (!(score>90)) ? "가":"나";
		
		/*
		if(result)
		{
			System.out.println("가");			
		}
		else
		{
			System.out.println("나");
		}
		*/

		System.out.println(result);

	}

}
