package sec01_exam;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		
        Scanner scanner=new Scanner(System.in);
        
        //num���ٰ� 4����Ʈ �޸𸮰����� ����(int)���� �ްڴ�.
        System.out.println("���ڸ� ������ �ϳ� �Է����ּ���.");
        int num=scanner.nextInt();  //nextInt()Ű����κ��� ������ �޴� �޼���
        System.out.printf("num=%d %n",num);
        
        //dnum���ٰ� 8����Ʈ �޸𸮰����� �Ǽ�(double��)�� �ްڴ�.
        System.out.println("���ڸ� �Ǽ��� �ϳ� �Է����ּ���");
        double dnum=scanner.nextDouble();
        System.out.println("dnum = "+dnum);
        
       
        System.out.print("���ϴ� ���ڸ� �Է����ֽʽÿ�.");
        String input=scanner.nextLine(); //next(��������)
        int num1=Integer.parseInt(input);
        
        System.out.println("String���� �Է��� ����"+input);
        System.out.println("input�� ������ ��ȯ�� ����"+num1);
        
        //���ҽ� ����(�Է½�Ʈ��) Ű���峪 ���콺 ��
        scanner.close();
        
        		
	}

}
