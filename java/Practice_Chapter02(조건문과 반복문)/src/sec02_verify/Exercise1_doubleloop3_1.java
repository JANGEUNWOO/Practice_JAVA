package sec02_verify;



public class Exercise1_doubleloop3_1 {

	public static void main(String[] args) {

        //��ǥ�� ����� ���ﰢ�� ��.... ����...
		int i,j,n=5;
       
        
       
        for(i=0;i<n;i++)
        {
        	for(j=0;j<n;j++)
        	{
        		  if(i+j<=n-1) 
        		{
        			System.out.println("*");
        		} else 
        		{
        			System.out.println(" ");
        		}
        	}
        	System.out.println("");
        }
		
		
		
	}

}
