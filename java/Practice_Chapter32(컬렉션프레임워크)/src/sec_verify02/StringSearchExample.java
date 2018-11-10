package sec_verify02;

import java.util.Scanner;

public class StringSearchExample {

	public static void main(String[] args) {

		Scanner cc = new Scanner(System.in);
		
		System.out.print("몇개의 이름을 입력하실껀가요? >>");
		int a=cc.nextInt();
		
		longStringSearch lss=new longStringSearch(a);
		for(int i=0;i<a;i++) {
			System.out.print((i+1)+"번쨰 이름을 입력하세요>>");
		    lss.addString(cc.next());
		}
		System.out.println();
		lss.listPrint();
		System.out.println();
		lss.longestString();

	}

}
