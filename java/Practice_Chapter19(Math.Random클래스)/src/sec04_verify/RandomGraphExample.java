package sec04_verify;

public class RandomGraphExample {

	public static void main(String[] args) {
		int[] number = new int[100]; 
		int[] counter = new int[10]; 
		
		for(int i=0; i<number.length; i++) {
			int result =(int)(Math.random()*10);
			number[i]=result;
		}
		for(int i=0; i<number.length; i++) {
			for(int j=0; j<counter.length; j++) {
				if(number[i]==j) {
					counter[j]++;
				}
			}
		}
		for(int i=0; i<counter.length; i++) {
			System.out.println(i+"ÀÇ °³¼ö :"+printGraph('#', counter[i]) + counter[i]);
		}
	}
	static String printGraph(char ch, int value) {
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<value; i++) {
			sb.append(ch);
		} return sb.toString();

	}

}
