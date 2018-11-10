package sec11_verify;

import java.util.Scanner;

public class WordGameApp {

	   private Scanner s; //Ű�����Է�
	   private String startWord="�ƹ���"; //���۴ܾ�
	   private player[] players; //���� �����ڵ�
	   
	   
	   WordGameApp(){
	      s=new Scanner(System.in);
	      }
	   //���� ������ ���� �Է¹ް� Player[]�� �����ϴ� �޼ҵ�
	   private void createplayers() {
	      System.out.println("���ӿ� �����ϴ� �ο��� ����Դϱ�>>");
	      int n=s.nextInt();
	      players=new player[n]; //player[] �迭����
	      
	      //�� �������� �̸��� �߷¹޾� player��ü �����Ͽ� ���̱� �۾�
	      for(int i=0;i<n;i++) {
	         System.out.println("�������� �̸��� �Է��ϼ���>>");
	         String name=s.next();
	         players[i]=new player(name);
	      }
	   }
	   
	   //������ �����ϴ� �޼ҵ�
	   public void run() {
	      createplayers();//�����ڸ� ���� player[]�� �����Ѵ�.
	      String lastWord=startWord;// startWord���� ���� �����Ѵ�.
	      
	      System.out.println("�����ϴ� �ܾ��"+lastWord+"�Դϴ�");
	      int next=0; //�����ڵ��� ������� ����
	      
	      //������ ������ ���� ����
	      while(true) {
	         String newWord=players[next].sayWord();//next�����ڰ� �ܾ ���ϵ��� �Ѵ�.
	         
	         //next �����ڰ� �����Ͽ����� �˻�.
	         if(!players[next].succeed(lastWord)) {
	            System.out.print(players[next].getname()+"�� �����ϴ�.");
	         break; //�����������Ѵ�
	         }
	         next++; //����������
	         next%=players.length; //next�� �������� �������� ���� �����ϴ°��� ���´�.
	         lastWord=newWord;
	         
	         }   
	   s.close();  
	   }
	  }