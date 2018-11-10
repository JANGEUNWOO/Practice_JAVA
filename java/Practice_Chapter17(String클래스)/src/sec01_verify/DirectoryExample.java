package sec01_verify;

public class DirectoryExample {

	public static void main(String[] args) {
		
		String data = "D:/내폴더/photo/2016/travel/food.jpg";
		
		String food=data.substring(25,29);
		String jpg=data.substring(30);
		String folder=data.substring(0,24);
		
		System.out.println("파일이름"+food);
        System.out.println("확장자:"+jpg);
        System.out.println("폴더이름:"+folder);
	}

}
