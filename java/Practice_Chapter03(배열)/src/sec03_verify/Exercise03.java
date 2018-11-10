package sec03_verify;

public class Exercise03 {

	public static void main(String[] args) {
		
		int[][] score= {
				{88,95,100},
				{85,63,20},
				{34,30,30},
				{40,49,70},
				{15,75,98},
				
		};
		
	            
	      //과목별 총점
	      int korT=0;
	      int engT=0;
	      int mathT=0;
	       
	      System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
	      System.out.println("================================================");
	      
	      for(int i=0;i<score.length;i++)
	      {
	         int sum=0; //개인별 총점
	         float avg=0.0f; //개인별 평균
	         
	         korT+=score[i][0];
	         engT+=score[i][1];
	         mathT+=score[i][2];
	         
	         System.out.printf("%3d",i+1);
	         
	         for(int j=0;j<score[i].length;j++) 
	         {
	            sum+=score[i][j];
	            System.out.printf("\t%d",score[i][j]);
	         }
	         
	         avg=sum/(float)score[i].length;
	         System.out.printf("\t%d\t%.2f%n",sum,avg);
	         }
	  
	   System.out.println("================================================");
	   System.out.printf("총점->  [국어]\t%d[영어]\t%d[수학]\t%d",korT,engT,mathT);
		
		
		

	}

}
