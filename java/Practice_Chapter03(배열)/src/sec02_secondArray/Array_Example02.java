package sec02_secondArray;



public class Array_Example02 {

	public static void main(String[] args) {
		
		
		int[][] sc=new int[][]
	            {
	            {100,100,100},
	            {20,20,20},
	            {30,30,30},
	            {40,40,40},
	            {50,50,50}
	            };
	            
	      //°ú¸ñº° ÃÑÁ¡
	      int korT=0;
	      int engT=0;
	      int mathT=0;
	      
	      int Tsum=0;
	      float avgsum=0.0f;
	      
	      System.out.println("¹øÈ£\t±¹¾î\t¿µ¾î\t¼öÇÐ\tÃÑÁ¡\tÆò±Õ");
	      System.out.println("================================================");
	      
	      for(int i=0;i<sc.length;i++)
	      {
	         int sum=0; //°³ÀÎº° ÃÑÁ¡
	         float avg=0.0f; //°³ÀÎº° Æò±Õ
	         
	         korT+=sc[i][0];
	         engT+=sc[i][1];
	         mathT+=sc[i][2];
	         
	         System.out.printf("%3d",i+1);
	         
	         for(int j=0;j<sc[i].length;j++) 
	         {
	            sum+=sc[i][j];
	            System.out.printf("\t%d",sc[i][j]);
	         }
	         Tsum+=sum;
	         avg=sum/(float)sc[i].length;
	         avgsum+=avg;
	         System.out.printf("\t%d\t%.2f%n",sum,avg);
	         }
	   
	   avgsum/=(float)sc.length;
	   System.out.println("================================================");
	   System.out.printf("ÃÑÁ¡\t%d\t%d\t%d\t%d\t%.2f",korT,engT,mathT,Tsum,avgsum);
	   }

       
	}


