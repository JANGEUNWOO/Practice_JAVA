package sec02_verify;

public class KoreanExample {

	public static void main(String[] args) {
	      
		
		Korean sc=new Korean("대한민국","김용범",178,26,"대구사투리");
		System.out.println("첫 번째 공개 수배자입니다.");
		System.out.println("국적 : "+sc.nation);
		System.out.println("이름 : "+sc.name);
		System.out.println("키 :"+sc.height);
		System.out.println("나이:"+sc.age);
		System.out.println("특징:"+sc.character);
		
		System.out.println("");
		
		Korean scv=new Korean("USA","유재웅",172,29,"어설픈 영어");
		System.out.println("두 번째 공개 수배자입니다.");
		System.out.println("국적 : "+scv.nation);
		System.out.println("이름 : "+scv.name);
		System.out.println("키 :"+scv.height);
		System.out.println("나이:"+scv.age);
		System.out.println("특징:"+scv.character);
	}

}
