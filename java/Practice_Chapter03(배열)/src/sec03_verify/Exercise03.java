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
		
	            
	      //���� ����
	      int korT=0;
	      int engT=0;
	      int mathT=0;
	       
	      System.out.println("��ȣ\t����\t����\t����\t����\t���");
	      System.out.println("================================================");
	      
	      for(int i=0;i<score.length;i++)
	      {
	         int sum=0; //���κ� ����
	         float avg=0.0f; //���κ� ���
	         
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
	   System.out.printf("����->  [����]\t%d[����]\t%d[����]\t%d",korT,engT,mathT);
		
		
		

	}

}
