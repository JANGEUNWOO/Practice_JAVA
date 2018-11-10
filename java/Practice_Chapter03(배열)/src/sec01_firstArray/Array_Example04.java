package sec01_firstArray;

import java.util.Arrays;

public class Array_Example04 {

   public static void main(String[] args) {
      
      int[]iarr1=new int[10];  //선언함 0으로 자동초기화
      int[]iarr2=new int[10];
      int[]iarr3=new int[] {100,95,80,70,60};//선언과 동시에 초기화
      int[]iarr4=new int[] {100,95,80,70,60};//선언과 동시에 초기화
      
      char[]charr=new char[] {'a','b','c','b'};//선언과 동시에 초기화
      
      //int arr[]=new int[50];
      //배열의 초기화값 확인
      
      System.out.println("배열의 iarr1의 초기화 값:");
      
      for(int i=0;i<iarr1.length;i++) 
      {
         System.out.println(iarr1[i]);
      }
      System.out.println();//줄바꿈
      
      //배열명.length는 배열의 길이를 뜻함(C에서는 존재하지않음)
      
      for(int i=0;i<iarr1.length;i++) 
      {
         iarr1[i]=i+1;//1~10의 숫자를 순서대로 배열에 넣는다
      }
      for(int i=0;i<iarr2.length;i++) 
      {
         iarr2[i]=(int)(Math.random()*10)+1;//1~10의값을 배열에 저장
      }
      //배열의 저장된 값들을 출력한다.
      for(int i=0;i<iarr1.length;i++) 
      {
         if(i==9)
         System.out.println(iarr1[i]);
      else
         System.out.println(iarr1[i]+",");
      }
      System.out.println();
      //int[]타입에서 toString()호출시 String형태로 변환(API찾아보기)
      System.out.println(Arrays.toString(iarr2));
      System.out.println(Arrays.toString(iarr3));
      System.out.println(Arrays.toString(iarr4));
      //print()메서드 안에 참조형 변수가 오면 기본적으로 객체이름@16진수가 나온다.
      //그리고 참조형변수(레퍼런스변수)뒤에는 .toString()이 생략되어있다.
      System.out.println(Arrays.toString(charr));
      System.out.println(iarr3.toString());
      System.out.println(iarr3);
      System.out.println(charr.toString());
      //char타입만 toString()을 호출해야 주소가 나오고,
      //toString()을 호출하지 아니하면 그냥 값들이 출력!!
      System.out.println(charr.toString());
      System.out.println(charr);

   }

}
