package sec02_verify;

public class Exercise12 {

	public static void main(String[] args) {
		
		int a=1;		
		for(int i=0; i<3;i++,a=a+2)
		{
			System.out.println("");
			for(int j=3; j>i;j--)	
			{
				System.out.print(" ");	
			}		
			for(int m=0; m<a; m++)
			{
				System.out.print("*");
			}			
		}
		int b=1;
		for(int i=1; i<3;i++,b=b+2)
		{
			System.out.println("");
			for(int j=0; j<=i;j++)	
			{
				System.out.print(" ");	
			}	
			for(int m=3; m>=b; m--)
			{
				System.out.print("*");
			}
				
		}

	}

}
