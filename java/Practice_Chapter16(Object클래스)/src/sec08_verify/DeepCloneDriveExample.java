package sec08_verify;

public class DeepCloneDriveExample {

	   public static void main(String[] args) {
	      
	      Drive ori = new Drive("C드라이브", 500, new String[]{"윈도우폴더","시스템폴더"} , new Folder("야시꾸리한거",15));
	      Drive copy = ori.getDrive();
	      System.out.println("[원본 드라이브의 필드 값]");
	      System.out.println(ori);
	      System.out.println("[복제된 드라이브 필드 값]");
	      System.out.println(copy);

	   }
	}
