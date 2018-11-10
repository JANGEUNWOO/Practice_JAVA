package sec01_firstArray;

public class Array_Example07 {

	public static void main(String[] args) {
		
		
		  int[]ball=new int[5];
	      
	      for(int i=0;i<ball.length;i++)
	      {
	         ball[i]=(int)(Math.random()*45);
	      }
	      System.out.println("정렬전 ");
	      for(int i=0;i<ball.length;i++)
	      {
	         System.out.println(ball[i]);
	      }
	      //소팅을 하기 위해서는 더블루프+조건문 필수이다. 잊지않도록하자
	      for(int i=0;i<ball.length;i++)
	      {
	         for(int j=0;j<ball.length-1;j++)  //빈방을 비교하지 않기 위해 -처리
	         {
	            //버블 소팅(정렬)
	            if(ball[j]>ball[j+1]) {    //부등호를 역으로 돌리면 오름차순 내림차순 전환
	               int tmp=ball[j];
	               ball[j]=ball[j+1];
	               ball[j+1]=tmp;    //우유와 주스 각잔을 바꾸기 위해 빈잔인 temp를 만듬
	                     
	            }
	         }
	      }
	      System.out.println("정렬후");
	      for(int i=0;i<ball.length;i++) {
	         System.out.println(ball[i]);
	      }
          
	}

}
