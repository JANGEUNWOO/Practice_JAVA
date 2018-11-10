package sec03_verify;

import java.util.Scanner;

public class Exercise05_1 {

	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
	      int[][] student;
	      int count, num, sum = 0, total = 0; //반수, 인원, 합계, 계
	      double avg;
	      double avgTotal = 0;
	      
	      System.out.print("반수 : ");
	      count = in.nextInt();
	      student = new int[count][];
	      
	      for(int i = 0; i < student.length; i++) {
	         System.out.printf("%d반의 인원 : ", i+1);
	         num = in.nextInt();
	         
	         student[i] = new int[num];
	         for(int j =0; j < student[i].length; j++) {
	            System.out.printf("%d반의 %d번의 점수 : ",i+1, j+1);
	            student[i][j] = in.nextInt();
	         }
	         System.out.println();
	      }
	      
	      System.out.println("반\t합계\t평균");
	      System.out.println("----------------------");
	      for(int i=0; i <student.length; i++) {
	         sum = 0;
	         for(int j =0; j < student[i].length;j++)
	            sum += student[i][j];
	         
	         total += sum;
	         avg = (double)sum / student[i].length;
	         avgTotal += avg;
	         System.out.printf("%d반\t%d\t%.1f\n",i+1, sum, avg);
	      }
	      
	      System.out.println("----------------------");
	      avgTotal = avgTotal/student.length;
	      System.out.printf("계\t%d\t%.1f\n", total, avgTotal);
		

	}

}
