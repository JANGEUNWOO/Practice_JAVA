package sec02_verify;

public class BowlExample {

	public static void main(String[] args) {

		System.out.println("타입파라메터에 <String, String>으로 객체 생성 후 저장값 불러오기");
		Bowl<String, String> b1 = new Bowl<String, String>();
		b1.key = "박근혜";
		b1.value = "대통령";
		System.out.println("이름:" + b1.getKey());
		System.out.println("직업:" + b1.getValue());

		System.out.println("타입파라메터에 <String, Integer>으로 객체 생성 후 저장값 불러오기");
		Bowl<String, Integer> b2 = new Bowl<String, Integer>();
		b2.key = "박근혜";
		b2.value = 65;
		System.out.println("이름:" + b2.getKey());
		System.out.println("직업:" + b2.getValue());

	}

}
