package sec01_firstArray;

import java.util.Arrays;

public class Array_Example04 {

   public static void main(String[] args) {
      
      int[]iarr1=new int[10];  //������ 0���� �ڵ��ʱ�ȭ
      int[]iarr2=new int[10];
      int[]iarr3=new int[] {100,95,80,70,60};//����� ���ÿ� �ʱ�ȭ
      int[]iarr4=new int[] {100,95,80,70,60};//����� ���ÿ� �ʱ�ȭ
      
      char[]charr=new char[] {'a','b','c','b'};//����� ���ÿ� �ʱ�ȭ
      
      //int arr[]=new int[50];
      //�迭�� �ʱ�ȭ�� Ȯ��
      
      System.out.println("�迭�� iarr1�� �ʱ�ȭ ��:");
      
      for(int i=0;i<iarr1.length;i++) 
      {
         System.out.println(iarr1[i]);
      }
      System.out.println();//�ٹٲ�
      
      //�迭��.length�� �迭�� ���̸� ����(C������ ������������)
      
      for(int i=0;i<iarr1.length;i++) 
      {
         iarr1[i]=i+1;//1~10�� ���ڸ� ������� �迭�� �ִ´�
      }
      for(int i=0;i<iarr2.length;i++) 
      {
         iarr2[i]=(int)(Math.random()*10)+1;//1~10�ǰ��� �迭�� ����
      }
      //�迭�� ����� ������ ����Ѵ�.
      for(int i=0;i<iarr1.length;i++) 
      {
         if(i==9)
         System.out.println(iarr1[i]);
      else
         System.out.println(iarr1[i]+",");
      }
      System.out.println();
      //int[]Ÿ�Կ��� toString()ȣ��� String���·� ��ȯ(APIã�ƺ���)
      System.out.println(Arrays.toString(iarr2));
      System.out.println(Arrays.toString(iarr3));
      System.out.println(Arrays.toString(iarr4));
      //print()�޼��� �ȿ� ������ ������ ���� �⺻������ ��ü�̸�@16������ ���´�.
      //�׸��� ����������(���۷�������)�ڿ��� .toString()�� �����Ǿ��ִ�.
      System.out.println(Arrays.toString(charr));
      System.out.println(iarr3.toString());
      System.out.println(iarr3);
      System.out.println(charr.toString());
      //charŸ�Ը� toString()�� ȣ���ؾ� �ּҰ� ������,
      //toString()�� ȣ������ �ƴ��ϸ� �׳� ������ ���!!
      System.out.println(charr.toString());
      System.out.println(charr);

   }

}
