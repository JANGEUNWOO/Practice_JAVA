package sec02_verify;

public class FinallyExceptionExample {

	public static void main(String[] args) {
		
		    int[] num = new int[3];
		    num[0]=1;
		    num[1]=2;
		    num[2]=0;
		    
			try { 
			int number= (num[0]+num[1])/num[2];
			System.out.println(number);
			}
			catch(ArithmeticException e){
				System.out.println("0으로 나누는 등의 오류에요 ~~");
			}
			
			finally {
				System.out.println("이 부분은 무조건 나와요 ~~");
			}
		}
        
	}


