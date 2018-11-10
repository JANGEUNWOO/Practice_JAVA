package sec02_verify;

public class LottoExample {

	public static void main(String[] args) {
		
		
		System.out.println("로또 번호 생성기 프로그램입니다. 자동으로 번호를 선택합니다.");
		
		int[] lot1=new int[6];
		int[] lot2=new int[6];
		
		System.out.print("선택 번호 :");
		for(int i=0;i<lot1.length;i++) {
			lot1[i]=(int)((Math.random()*45)+1);
			System.out.print(lot1[i]+" ");
		}
		System.out.println("");
		
		System.out.print("당첨 번호 :");
		for(int i=0;i<lot1.length;i++) {
			lot2[i]=(int)((Math.random()*45)+1);
			System.out.print(lot2[i]+" ");
		}
		System.out.println("");
		
		if(lot1==lot2) {
			System.out.println("당첨 여부 : 당첨되었습니다.");
		}else {
			System.out.println("당첨 여부 : 당첨되지 않았습니다.");
		}

	}

}
