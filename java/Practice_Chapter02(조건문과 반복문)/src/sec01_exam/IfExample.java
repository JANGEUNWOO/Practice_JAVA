package sec01_exam;

public class IfExample {

	public static void main(String[] args) {
		
		int score=93;
		//��ʰ��� if���� �����ϴ���, cpu�� ��� if���� �����Ѵ�.
		
		if(score>=90) {
			System.out.println("������ 90���� Ů�ϴ�.");
			System.out.println("����� A�Դϴ�.");
		}
		
		//()�� �����϶��� �����Ҽ� ������, �ظ��ϸ� ()�� �����ִ°� ���Ⱑ ����.
		if(score<90) 
			System.out.println("������ 90���� �۽��ϴ�.");
			
		
	System.out.println("����� B�Դϴ�.");  //if ���� �������� �ʾƼ� ��µ�..
		

	}

}
