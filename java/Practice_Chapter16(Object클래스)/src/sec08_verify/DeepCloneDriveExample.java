package sec08_verify;

public class DeepCloneDriveExample {

	   public static void main(String[] args) {
	      
	      Drive ori = new Drive("C����̺�", 500, new String[]{"����������","�ý�������"} , new Folder("�߽òٸ��Ѱ�",15));
	      Drive copy = ori.getDrive();
	      System.out.println("[���� ����̺��� �ʵ� ��]");
	      System.out.println(ori);
	      System.out.println("[������ ����̺� �ʵ� ��]");
	      System.out.println(copy);

	   }
	}
