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
	    System.out.println("�� �����迭�� �հ�:"+sum);
		System.out.printf("�� �����迭�� ���:%.1f",avg);
	}
}
