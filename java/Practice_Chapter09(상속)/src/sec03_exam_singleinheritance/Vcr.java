package sec03_exam_singleinheritance;

public class Vcr {

	boolean power; //��������(on/off)
	int counter=0;
	
	public Vcr() {
		super();   //Object������ȣ��
		System.out.println("Vcr������ ȣ��");
		
	}
	
	public void power() {
		power=!power;
		System.out.println("Vcr�� power �ż��带 ȣ���Ͽ����ϴ�.");
		
	}
	public void play() {
		System.out.println("Vcr�� play�ż��带 ȣ���Ͽ����ϴ�.");
	}
	
	public void stop() {
		System.out.println("Vcr�� stop �ż��带 ȣ���Ͽ����ϴ�.");
		
	}
	//�ǰ���
	public void rew() {
		System.out.println("Vcr�� rew �ż��带 ȣ���Ͽ����ϴ�.");
	}
	
	//�������� >>
	public void ff() {
		System.out.println("Vcr�� ff�ż��带 ȣ���Ͽ����ϴ�.");
	}
	
	
	
}
