package sec02_exam;

public class Tv {

	
	//Tv�� �Ӽ�(�������) �ٸ� ���� �ʵ��� �Ѵ�.
	String color; //����
	boolean power; //��������(on/off)
	int channel;
	
	//����޼���(�Լ�)
	//Tv�� Ű�ų� ���� ����� �ϴ� �޼���
	public void power() {
		this.power=!this.power;
	}
	//Tv�� ü���� ���̴� ����� �ϴ� �޼���
	public void channelUp(){
		++this.channel;
		
	}
	//Tv�� ü���� ���ߴ� ����� �ϴ� �޼���
	public void channelDown() {
		if(this.channel<0) {
			System.out.println("ü���� �������� �����ϴ�.");
			
		}
		--this.channel;
	}
	
}
