package sec02_verify;

public class LottoExample {

	public static void main(String[] args) {
		
		
		System.out.println("�ζ� ��ȣ ������ ���α׷��Դϴ�. �ڵ����� ��ȣ�� �����մϴ�.");
		
		int[] lot1=new int[6];
		int[] lot2=new int[6];
		
		System.out.print("���� ��ȣ :");
		for(int i=0;i<lot1.length;i++) {
			lot1[i]=(int)((Math.random()*45)+1);
			System.out.print(lot1[i]+" ");
		}
		System.out.println("");
		
		System.out.print("��÷ ��ȣ :");
		for(int i=0;i<lot1.length;i++) {
			lot2[i]=(int)((Math.random()*45)+1);
			System.out.print(lot2[i]+" ");
		}
		System.out.println("");
		
		if(lot1==lot2) {
			System.out.println("��÷ ���� : ��÷�Ǿ����ϴ�.");
		}else {
			System.out.println("��÷ ���� : ��÷���� �ʾҽ��ϴ�.");
		}

	}

}
