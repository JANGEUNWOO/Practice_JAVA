package sec01_exam_captionTv;

//����Ŭ����(�θ�,SuperŬ����)������� :5��
public class Tv {

	boolean power; // ��������(on/off)
	int channel; // ä��

	public Tv() {
		System.out.println("����Ŭ���� ������ ȣ��");

	}

	// �������
	public void power() {
		this.power = !power;
	}

	public void channelUp() {
		++this.channel;

	}

	public void channelDown() {
		--this.channel;
	}

}
