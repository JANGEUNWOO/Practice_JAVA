package sec01_firstArray;

public class Array_Example09 {

	public static void main(String[] args) {
		
		int[] scores= {95,71,84,93,87};
		int sum=0;
		
		/*
		 for(int i=0;i<scores.length;i++) {
			sum+=scores[i];
		}
        */		
		//���� for��(�÷��������ӿ�ũ���� ���� ���)
		//������Ÿ�� ������:������ ���(��������)
		//������� scores -> int score -> sum+=score
        
		for(int a : scores) {
			sum+=a;
		}
		System.out.println("���� ����="+sum);
		double avg=(double)sum/scores.length;
		System.out.println("���� ���="+avg);
	}

}
