package sec08_verify;

	import java.util.Arrays;

	public class Drive implements Cloneable{

	   String name;
	   int size;
	   String[] driverList;
	   Folder folder;
	   
	   public Drive(String name, int size, String[]driverList, Folder folder) {
	      this.name = name;
	      this.size = size;
	      this.driverList = driverList;
	      this.folder = new Folder(folder.name, folder.size);
	   }
	   @Override
	   protected Object clone() throws CloneNotSupportedException {
	      Drive copy = (Drive)super.clone();
	      copy.driverList = Arrays.copyOf(this.driverList, this.driverList.length);
	      copy.folder = new Folder(this.folder.name, this.folder.size);
	      return copy;
	   }
	   
	   public Drive getDrive() {
	      Drive copy = null;
	      try {
	         copy = (Drive)this.clone();   //�������̵��� clone()�� ȣ���.
	      } catch (CloneNotSupportedException e) {
	         
	      } return copy; 
	   }
	   @Override
	   public String toString() {
	      System.out.println("�̸� : "+name);
	      System.out.println("ũ�� : "+size);
	      System.out.println("���� ��� : "+Arrays.toString(driverList));
	      System.out.println("�� ������ : " + folder.name);
	      System.out.println("ũ�� : " + folder.size);
	      return "";
	   }
	}
