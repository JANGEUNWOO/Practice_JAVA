package sec01_verify;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise11 {

	public static void main(String[] args) {
		
		
		String[] str = new String[]{"����","����","��"};
		System.out.println(Arrays.toString(str)+"�� �Է��ϼ���");
		
		Scanner sc = new Scanner(System.in);
		String user, comp;
		
		
		int i=0;
		
		
		while(i<3) {
		   System.out.print("�Է�");
		   user=sc.nextLine();
		   
		   if(user.equals("�׸�")) {
			   System.out.println("���α׷��� �����մϴ�.");
			   break;
		   
		   }
			
		}
		
		sc.close();
	}

}
