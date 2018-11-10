package sec02_verify;

public class Example14_1 {

	public static void main(String[] args) {
		
		
		int i,j;
		int n=1;
		
		for(i=0;i<=2;i++) {
			System.out.println("");
			for(j=0;j<6;j++) {
				if(j<n||j+n>5) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			if(i<=2) {
				n++;
			}else {
			    n--;
			}
		}
		
		for(i=3;i<=5;i++) {
			System.out.println("");
			for(j=0;j<6;j--) {
				if(j<n||j+n>5) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			if(i>=3) {
				n--;
			}
			}
		}
		
		
		
		
	}

}
