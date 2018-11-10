package sec03_verify;

import java.util.Random;
import java.util.Scanner;

public class Kawibawibo {

	 static Random rd = new Random();
	 static Scanner sc = new Scanner(System.in);
	 
	 //���� 0 ���� 1 �� 2
	 //���� �޽��� ����� ���� 3�� default ������ ��
	 static int user = 3;
	 
	 //0,1,2 3������ ���ڸ� �������� ����.
	 static int computer = rd.nextInt(3);
	 
	 //����ڰ� �Է��� ����, ����, ���� ��� ����
	 static String game;
	 
	 //������� ����, ����, ���� int ������ �޴� Ŭ����
	 public void rspGame()
	 {
	  System.out.print("���� , ����, �� �Է� :");
	  game = sc.next();
	  
	  switch(game)
	  {
	   case "����":
	    user=0;
	   break;
	  
	   case "����":
	    user=1;
	   break;
	   
	   case "��":
	    user=2;
	   break;
	  
	   default:
	    user=3;
	   break;
	  }
	 }
	 
	 //����ڰ� �Է��� ����,����,�� �� ��ǻ���� ���� ���ϴ� �Լ�
	 public void fight()
	 {
	  switch(computer)
	  { 
	  case 0 :
	   System.out.print("��ǻ�� : ����");
	   break;
	  case 1:
	   System.out.print("��ǻ�� : ����");
	   break;
	  case 2:
	   System.out.print("��ǻ�� : ��");
	   break;
	  }
	  
	  System.out.println("");
	  
	  if(user == 3)
	  {
	   System.out.println("����");
	  }
	  else if(user == computer)
	  {
	   System.out.println("���º�");
	  }
	  else if(user == 0 || computer == 1)
	  {
	   System.out.println("�����ϴ�. (��ǻ�� ��)");
	  }
	  else if(user == 0 || computer == 2)
	  {
	   System.out.println("�̰���ϴ�. (user ��)");
	  }
	  else if(user == 1 || computer == 0)
	  {
	   System.out.println("�̰���ϴ�. (user ��)");
	  }
	  else if(user == 1 || computer == 2)
	  {
	   System.out.println("�����ϴ�. (computer ��)");
	  }
	  else if(user == 2 || computer == 0)
	  {
	   System.out.println("�����ϴ�. (computer ��)");
	  }
	  else if(user == 2 || computer == 1)
	  {
	   System.out.println("�̰���ϴ�. (user ��)");
	  }
	  else
	  {
	   System.out.println("�߸��� �Է��Դϴ�.");
	  }
	 }


	public static void main(String[] args) {
		
	
		  Kawibawibo gam = new Kawibawibo();
		  
		  //�Լ� ����
		  gam.rspGame();
		  gam.fight();
	}
}

