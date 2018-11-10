package sec02_verify;

public class Exercise15 {

	public static void main(String[] args) {

		int a = 3;

		for(int i=1;i<=a;i++){

			for(int j=3;j>i;j--) {
              System.out.print(" ");
			}
            for(int k=1;k<=i;k++) {
              System.out.print(k);
            } 
            for(int j=1;j<i;j++) {
              System.out.print(i-j);
            }
			System.out.println();

		}

		int b = 1;

		for(int i=2;i>=b;i--){

			for(int j=3;j>i;j--){
			   System.out.print(" ");
			  }
            for(int k=1;k<=i;k++){
               System.out.print(k);
              } 
            for(int j=1;j<i;j++){
               System.out.print(i-j);
              }
			System.out.println();
          }
	}


}