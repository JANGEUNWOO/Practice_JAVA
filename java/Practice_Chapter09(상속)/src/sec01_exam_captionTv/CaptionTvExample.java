package sec01_exam_captionTv;

public class CaptionTvExample {

	public static void main(String[] args) {
	
		CaptionTv ctv=new CaptionTv();
		
		ctv.channel=10;  //���� Ŭ�����κ��� ��ӹ��� ���
		ctv.channelUp();  //���� Ŭ�����κ��� ��ӹ��� ���, channel�� 1������Ŵ
		
		System.out.println("���� ü����"+ctv.channel+"�Դϴ�.");
		ctv.displayCaption("ĸ�ǰ��� ��� �޼���:Hello, world");//false�̹Ƿ� ��¾���
		
		ctv.caption=true;//ĸ�Ǳ���� �Ҵ�.
		ctv.displayCaption("ĸ�ǰ��� ��� �޽���:hello, world"); //ĸ���� ȭ�鿡 �����ش�

	}

}
