package sec01_exam;

public class IFDiceExample {

	public static void main(String[] args) {
		
		//Math.random() 결과 0.0000~0.9999사이의 랜덤값 발생
		int num=(int)(Math.random()*6)+1;
		//System.out.println(Math.random());
		
		if(num==1) {
			System.out.println("1번이 나왔습니다");
		}
		else if(num==2) {
			System.out.println("2번이 나왔습니다");
		}
		else if(num==3) {
			System.out.println("3번이 나왔습니다");
		}
		else if(num==4) {
			System.out.println("4번이 나왔습니다");
		}
		else if(num==5) {
			System.out.println("5번이 나왔습니다");
        }
		else {
			System.out.println("6번이 나왔습니다");
	}
  }
}