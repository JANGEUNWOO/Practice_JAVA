package sec02_secondArray;

public class Array_Example01 {

	public static void main(String[] args) {
		
		
		int[][] score= new int[][] {
			{100,100,100},{20,20,20},{30,30,30},{40,40,40}
		};
		
		int sum=0;
		System.out.println("2차원 배열의 주소값 : "+score);
		
		for(int i=0;i<score.length;i++) {
			System.out.println("1차원 배열의 주소값 : "+score[i]);
			for(int j=0;j<score[i].length;j++) {
				System.out.println("score["+i+"]"+"["+j+"]="+""+score[i][j]);
				
			}
		}
		// 향상된 for문(JDK 1.5버전부터 치밀함.
		// 후에 컬렉션프레임웍 부분에서 객체를 접근할 때 아래와 같이
		// 향상된 for문을 사용합니다.)
		
		//가져올 타입 변수 : 가져올 장소
		for(int[] tmp:score) {
			for(int i :tmp) {
				sum+=i;
						
			}
		}
		
         System.out.println("sum="+sum);
	}

}
