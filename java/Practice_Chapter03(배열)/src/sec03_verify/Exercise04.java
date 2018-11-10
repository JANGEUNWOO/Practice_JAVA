package sec03_verify;

public class Exercise04 {

	public static void main(String[] args) {
	
		
		
		int[][] arr=new int[][] {
			
			{11,22},
			{44,55},
			{66,33},
			{22,89},
			{65,44},
			{56,77}
		
		};
		
		 for(int i=0;i<arr.length;i++) {
		    	
		    	for(int j=0;j<arr[i].length;j++) {
		    		if(j==1) {
		    		System.out.println(i+1+"번째 수학점수 입력:"+arr[i][j]);
		    	} else {
		    		System.out.println(i+1+"번째 국어점수 입력:"+arr[i][j]);
		    	}
		    }
		 }    	
		
		int korsum=0;
		int mathsum=0;
		int a=0;
		int b=0;
		int number=0;
		double koravg=0;
		double mathavg=0;
		
		for(int i=0;i<arr.length;i++) {
			a=arr[i][0];
			korsum+=a;
			number++;
		    
		}
		koravg=korsum/number;
		System.out.println("-------------------");
		System.out.printf("국어평균 : %.2f",koravg);
		
		System.out.println();
		
		int number2=0;
		for(int i=0;i<arr.length;i++) {
			b=arr[i][1];
			mathsum+=b;
			number2++;
		}
		mathavg=mathsum/(double)number2;
		System.out.printf("수학평균 : %.2f\n",mathavg);
		System.out.println("-------------------");
		
		int totsum=0;
		double totavg=0;
		for(int i=0;i<arr.length;i++) {
	    	totsum=arr[i][0]+arr[i][1];
	    	totavg=(double)totsum/arr[0].length;
	    System.out.println(i+1+"번째 학생의 평균 :"+ totavg);	
	    }    	
	}

}
