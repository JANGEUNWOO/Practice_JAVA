package sec01_exam_contentSender;

public class letterSender extends ContentSender {
	

		String content;
		//������
		public letterSender(String title,String nm,String content) {
			//����Ŭ������ �����ڸ� ȣ��
			
			super(title, nm);
			//�ڽ��� ��� �ʱ�ȭ
			
			this.content=content;
		}
		
		//����Ŭ������ �߻�ż����� sendMsg()��ӹ޾� �������̵��Ѵ�.
		@Override
		public void sendMsg(String recipient) {
			System.out.println("����="+this.title);
			System.out.println("�̸�="+this.nm);
			System.out.println("����="+this.content);
			System.out.println("�޴»��="+recipient);
		}
}
