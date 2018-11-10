package sec03_verify;

public class Exercise06 {

	public static void main(String[] args) {
		
		int[][]Array= {
				{95,86,100,55},
				{83,92,96},
				{78,83,93,87,88,77,10}
		};
        
		int total=0;
		int sum=0;
        double avg=0;
        
		for(int[] tmp:Array) {
			for(int i :tmp) {
				sum+=i;
				total++;
			 }
			avg=(double)sum/total;

		}
	    System.out.println("위 가변배열의 합계:"+sum);
		System.out.printf("위 가변배열의 평균:%.1f",avg);
	}
}
