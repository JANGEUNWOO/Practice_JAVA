package sec01_firstArray;

public class Array_Example01 {

	public static void main(String[] args) {
		
		
		//int형 배열명 score(참조변수)에 int[5]=20바이트 생성후 주소값 넘김
		int[] score=new int[10]; //10개의 방에 0값을 자동 초기화됨
		int k=1;
		score[0]=50;
		score[1]=60;
		score[k+1]=70; //score[2]=70
		score[3]=80;
		score[4]=90;
		
		//int tmp=score[3]+score[4]
		int tmp=score[k+2]+score[4];
		
		//for문으로 배열의 모든 요소를 출력한다
		for(int i=0;i<score.length;i++) {
			System.out.println("score["+i+"]:"+score[i]);
			
		}
		System.out.println("tmp: "+tmp);
		System.out.println("score[7]"+score[7]);
		System.out.println(score); //주소값 출력
		
		//주소값 인티져 타입의 주소값

	}

}
