package sec03_verify;

public class Exercise02 {

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
	      
	      
	      
	      
	      for(int i=0;i<sc.length;i++)
	      {
	         int sum=0; //°³ÀÎº° ÃÑÁ¡
	         
	         
	         korT+=sc[i][0];
	         engT+=sc[i][1];
	         mathT+=sc[i][2];
	         
	         
	         
	         for(int j=0;j<sc[i].length;j++) 
	         {
	            sum+=sc[i][j];
	            System.out.printf("\t%d",sc[i][j]);
	         }
	         Tsum+=sum;
	         System.out.printf("\t%d\n",sum);
	         
	      }
	     
	   
	   avgsum/=(float)sc.length;
	   System.out.printf("\t%d\t%d\t%d\t%d",korT,engT,mathT,Tsum);
	  

	}

}
