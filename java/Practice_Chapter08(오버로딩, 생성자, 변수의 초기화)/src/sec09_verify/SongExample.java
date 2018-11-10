package sec09_verify;

import java.util.Arrays;

public class SongExample {

	public static void main(String[] args) {
		
		String[] a=new String[] {"윤일상, 한효주, 김을동"};
		Song mamamu=new Song("엄마 부탁해요~","홍진영","엄마 부탁해요OST",a,2016,5);
		
		
		mamamu.show();
		

	}

}
