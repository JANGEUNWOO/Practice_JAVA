package sec02_exam;

public class WhileExample2 {

	public static void main(String[] args) {
		
		int sum=0;
		int j=1;
		
		//j�� 100�ɶ�����
		while(j<=100) {
			sum+=j; //���� ��� ������ ��Ű�� ����
			j++;
		}
		
		System.out.println("1~"+(j-1)+"��:"+sum);
		
	}

}
