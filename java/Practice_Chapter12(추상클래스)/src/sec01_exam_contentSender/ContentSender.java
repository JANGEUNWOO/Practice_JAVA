package sec01_exam_contentSender;
//�߻�ż��带 �ϳ��� �����ϰ� ������, �װ� ����Ŭ������ �ȴ�.
public abstract class ContentSender {

	//�ʵ�
	String title;
	String nm;
	
	//������
	public ContentSender(String title, String nm) {
		this.title=title;
		this.nm=nm;
	}
	//�߻�ż���  --> ����� ���� �����Ǹ� �ؾ�����
	//��μ� �ν��Ͻ� ������ �� ���� �ִ�.
	
	abstract void sendMsg(String content);
}
