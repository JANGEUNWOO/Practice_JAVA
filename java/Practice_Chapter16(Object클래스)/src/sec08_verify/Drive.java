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
	         copy = (Drive)this.clone();   //오버라이딩된 clone()이 호출됨.
	      } catch (CloneNotSupportedException e) {
	         
	      } return copy; 
	   }
	   @Override
	   public String toString() {
	      System.out.println("이름 : "+name);
	      System.out.println("크기 : "+size);
	      System.out.println("폴더 목록 : "+Arrays.toString(driverList));
	      System.out.println("새 폴더명 : " + folder.name);
	      System.out.println("크기 : " + folder.size);
	      return "";
	   }
	}
