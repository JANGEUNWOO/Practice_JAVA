package sec03_verify;

import java.util.Scanner;

public class Exercise05_1 {

	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
	      int[][] student;
	      int count, num, sum = 0, total = 0; //�ݼ�, �ο�, �հ�, ��
	      double avg;
	      double avgTotal = 0;
	      
	      System.out.print("�ݼ� : ");
	      count = in.nextInt();
	      student = new int[count][];
	      
	      for(int i = 0; i < student.length; i++) {
	         System.out.printf("%d���� �ο� : ", i+1);
	         num = in.nextInt();
	         
	         student[i] = new int[num];
	         for(int j =0; j < student[i].length; j++) {
	            System.out.printf("%d���� %d���� ���� : ",i+1, j+1);
	            student[i][j] = in.nextInt();
	         }
	         System.out.println();
	      }
	      
	      System.out.println("��\t�հ�\t���");
	      System.out.println("----------------------");
	      for(int i=0; i <student.length; i++) {
	         sum = 0;
	         for(int j =0; j < student[i].length;j++)
	            sum += student[i][j];
	         
	         total += sum;
	         avg = (double)sum / student[i].length;
	         avgTotal += avg;
	         System.out.printf("%d��\t%d\t%.1f\n",i+1, sum, avg);
	      }
	      
	      System.out.println("----------------------");
	      avgTotal = avgTotal/student.length;
	      System.out.printf("��\t%d\t%.1f\n", total, avgTotal);
		

	}

}
