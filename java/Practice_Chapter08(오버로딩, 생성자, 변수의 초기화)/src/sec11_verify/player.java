package sec11_verify;

import java.util.Scanner;

public class player {

	   Scanner s=new Scanner(System.in);
	   private String name;
	   private String word;
	   
	   
	   player(String n){
	      this.name=n;
	      s=new Scanner(System.in);
	   }
	   public String getname() {
	      return this.name;
	   }
	   public String sayWord() {
	      System.out.print(name+">>");
	      word=s.next();
	      return word;
	   }
	   //lastWord와 참가자가 말한 word를 비교하여 끝말잇기가 잘되었는지 판단.
	   //성공하였으면 true리턴
	   public boolean succeed(String lastWord) {
	      int lastIndex=lastWord.length()-1;//최종단어의 맨 마지막 문자의 인덱스
	      //최종 단어의 맨 마지막 문자와 참가자가 말한 단어의 첫 문자가 같은지 비교
	      if(lastWord.charAt(lastIndex)==word.charAt(0))
	         return true;
	      else
	         return false;
	   }

	   
	   
	}
