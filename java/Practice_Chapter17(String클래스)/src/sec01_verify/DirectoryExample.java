package sec01_verify;

public class DirectoryExample {

	public static void main(String[] args) {
		
		String data = "D:/������/photo/2016/travel/food.jpg";
		
		String food=data.substring(25,29);
		String jpg=data.substring(30);
		String folder=data.substring(0,24);
		
		System.out.println("�����̸�"+food);
        System.out.println("Ȯ����:"+jpg);
        System.out.println("�����̸�:"+folder);
	}

}
