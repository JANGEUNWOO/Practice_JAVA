package sec03_exam_singleinheritance;

public class Tv {

	boolean power; //��������(on/off)
	int channel=10; //ü��
	//�⺻������
	
	public Tv() {
		super(); //Object������ ȣ��
		System.out.println("Tv����Ŭ���� ������ ȣ��");
	}
	
	public void power() {
		this.power=!this.power;
		System.out.println("����Ŭ���� Tv�� power�ż��带 ȣ���Ͽ����ϴ�.");
		
	}
	
	public void channelUp() {
		++this.channel;
		System.out.println("����Ŭ���� Tv�� channelUp�ż��带 ȣ���Ͽ����ϴ�.");
	}
	
	public void channelDown() {
		--this.channel;
		System.out.println("����Ŭ���� Tv�� channelDown�ż��带 ȣ���Ͽ����ϴ�.");
	}
	
	
	
	
}
