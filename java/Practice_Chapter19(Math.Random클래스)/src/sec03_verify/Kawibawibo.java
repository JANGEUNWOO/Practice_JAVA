package sec03_verify;

import java.util.Random;
import java.util.Scanner;

public class Kawibawibo {

	 static Random rd = new Random();
	 static Scanner sc = new Scanner(System.in);
	 
	 //가위 0 바위 1 보 2
	 //에러 메시지 출력을 위해 3을 default 값으로 둠
	 static int user = 3;
	 
	 //0,1,2 3가지의 숫자를 랜덤으로 가짐.
	 static int computer = rd.nextInt(3);
	 
	 //사용자가 입력할 가위, 바위, 보를 담는 변수
	 static String game;
	 
	 //사용자의 가위, 바위, 보를 int 형으로 받는 클래스
	 public void rspGame()
	 {
	  System.out.print("가위 , 바위, 보 입력 :");
	  game = sc.next();
	  
	  switch(game)
	  {
	   case "가위":
	    user=0;
	   break;
	  
	   case "바위":
	    user=1;
	   break;
	   
	   case "보":
	    user=2;
	   break;
	  
	   default:
	    user=3;
	   break;
	  }
	 }
	 
	 //사용자가 입력한 가위,바위,보 와 컴퓨터의 값을 비교하는 함수
	 public void fight()
	 {
	  switch(computer)
	  { 
	  case 0 :
	   System.out.print("컴퓨터 : 가위");
	   break;
	  case 1:
	   System.out.print("컴퓨터 : 바위");
	   break;
	  case 2:
	   System.out.print("컴퓨터 : 보");
	   break;
	  }
	  
	  System.out.println("");
	  
	  if(user == 3)
	  {
	   System.out.println("에러");
	  }
	  else if(user == computer)
	  {
	   System.out.println("무승부");
	  }
	  else if(user == 0 || computer == 1)
	  {
	   System.out.println("졌습니다. (컴퓨터 승)");
	  }
	  else if(user == 0 || computer == 2)
	  {
	   System.out.println("이겼습니다. (user 승)");
	  }
	  else if(user == 1 || computer == 0)
	  {
	   System.out.println("이겼습니다. (user 승)");
	  }
	  else if(user == 1 || computer == 2)
	  {
	   System.out.println("졌습니다. (computer 승)");
	  }
	  else if(user == 2 || computer == 0)
	  {
	   System.out.println("졌습니다. (computer 승)");
	  }
	  else if(user == 2 || computer == 1)
	  {
	   System.out.println("이겼습니다. (user 승)");
	  }
	  else
	  {
	   System.out.println("잘못된 입력입니다.");
	  }
	 }


	public static void main(String[] args) {
		
	
		  Kawibawibo gam = new Kawibawibo();
		  
		  //함수 선언
		  gam.rspGame();
		  gam.fight();
	}
}

