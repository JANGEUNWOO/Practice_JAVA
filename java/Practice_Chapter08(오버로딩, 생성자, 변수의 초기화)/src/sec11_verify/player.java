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
	   //lastWord�� �����ڰ� ���� word�� ���Ͽ� �����ձⰡ �ߵǾ����� �Ǵ�.
	   //�����Ͽ����� true����
	   public boolean succeed(String lastWord) {
	      int lastIndex=lastWord.length()-1;//�����ܾ��� �� ������ ������ �ε���
	      //���� �ܾ��� �� ������ ���ڿ� �����ڰ� ���� �ܾ��� ù ���ڰ� ������ ��
	      if(lastWord.charAt(lastIndex)==word.charAt(0))
	         return true;
	      else
	         return false;
	   }

	   
	   
	}
