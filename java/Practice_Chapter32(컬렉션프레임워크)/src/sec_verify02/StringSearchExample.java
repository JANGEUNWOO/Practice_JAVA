package sec_verify02;

import java.util.Scanner;

public class StringSearchExample {

	public static void main(String[] args) {

		Scanner cc = new Scanner(System.in);
		
		System.out.print("��� �̸��� �Է��Ͻǲ�����? >>");
		int a=cc.nextInt();
		
		longStringSearch lss=new longStringSearch(a);
		for(int i=0;i<a;i++) {
			System.out.print((i+1)+"���� �̸��� �Է��ϼ���>>");
		    lss.addString(cc.next());
		}
		System.out.println();
		lss.listPrint();
		System.out.println();
		lss.longestString();

	}

}
