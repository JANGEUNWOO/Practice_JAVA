package sec01_exam_contentSender;

public class SederExample {

	public static void main(String[] args) {
		
		//����Ŭ������ �ν��Ͻ��� ����� ������ ���� ���Ѵ�.
		//ContentSender cs=new ContentSenderI();//���ܹ߻� ����?
		
		//�߻�Ŭ������ �����̱� ������ �������� ������ �� �� �ִ�.
		//��, ����Ŭ���� ����� �߻�޼��带 �� ������ �ڼ�Ŭ������ ������ �����ϴ�.
		ContentSender cs= new letterSender("SMS����","�����","4�޶�");
		cs.sendMsg("������");
		System.out.println();
		
		letterSender ls=new letterSender("SMS����","�������","�ݰ���������");
		kakaoSender ks=new kakaoSender("īī����","������","�ݰ��� īī����ƾƾ�");
		
		//����Ŭ������ �߻�ż��带 �������̵��� �ż��� ȣ��, ���� �ٸ� ����� ������
		ls.sendMsg("�׳�");
        System.out.println();
        ks.sendMsg("������");

	}

}
