package sec11_verify;

import java.util.Scanner;

public class WordGameApp {

	   private Scanner s; //키보드입력
	   private String startWord="아버지"; //시작단어
	   private player[] players; //게임 참가자들
	   
	   
	   WordGameApp(){
	      s=new Scanner(System.in);
	      }
	   //게임 참가자 수를 입력받고 Player[]을 생성하는 메소드
	   private void createplayers() {
	      System.out.println("게임에 참가하는 인원은 몇명입니까>>");
	      int n=s.nextInt();
	      players=new player[n]; //player[] 배열생성
	      
	      //각 참여자의 이름을 읿력받아 player객체 생성하여 붙이기 작업
	      for(int i=0;i<n;i++) {
	         System.out.println("참가자의 이름을 입력하세요>>");
	         String name=s.next();
	         players[i]=new player(name);
	      }
	   }
	   
	   //게임을 진행하는 메소드
	   public void run() {
	      createplayers();//참가자를 위한 player[]을 생성한다.
	      String lastWord=startWord;// startWord에서 부터 시작한다.
	      
	      System.out.println("시작하는 단어는"+lastWord+"입니다");
	      int next=0; //참가자들이 순서대로 증가
	      
	      //게임이 끝날때 까지 루프
	      while(true) {
	         String newWord=players[next].sayWord();//next참가자가 단어를 말하도록 한다.
	         
	         //next 참가자가 성공하였는지 검사.
	         if(!players[next].succeed(lastWord)) {
	            System.out.print(players[next].getname()+"이 졌습니다.");
	         break; //게임을종료한다
	         }
	         next++; //다음참가자
	         next%=players.length; //next가 참가자의 개수보다 많게 증가하는것을 막는다.
	         lastWord=newWord;
	         
	         }   
	   s.close();  
	   }
	  }