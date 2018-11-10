package sec04_array_search;

import java.util.Arrays;

public class SearchExample {

   public static void main(String[] args) {
      //기본 타입값 검색
      int[] scores = new int[]{ 1, 88, 100, 99, 97, 98 };
      
      //sort를 먼저 하지 않으면 엉뚱한값 발생함. 음수나옴...
      int index = Arrays.binarySearch(scores, 99);
      System.out.println("소팅 전");
      System.out.println("scores[] = " + Arrays.toString(scores));
      System.out.println("99가 있는 인덱스 : " + index);
      
      Arrays.sort(scores);
      System.out.println("소팅 후");
      System.out.println("scores[] = " + Arrays.toString(scores));
      index = Arrays.binarySearch(scores, 1);
      System.out.println("1이 있는 인덱스 : " + index);
      System.out.println();
      
      //문자열 검색
      String[] names = { "홍길동", "박동수", "김민수" };
      System.out.println("소팅 전");
      System.out.println("names[] = " + Arrays.toString(names));
      Arrays.sort(names);
      System.out.println("소팅 후");
      System.out.println("names[] = " + Arrays.toString(names));
      index = Arrays.binarySearch(names, "홍길동");
      System.out.println("홍길동이 있는 인덱스 : " + index);
      System.out.println();
      
      //사용자 정의 객체 검색
      Member m1 = new Member("홍길동");
      Member m2 = new Member("박동수");
      Member m3 = new Member("김민수");
      Member[] members = { m1, m2, m3 };
      System.out.println("members 소팅 전");
      for(int i=0; i<members.length;i++)
      {
         System.out.println("members[" + i + "]의 값 : " + members[i].name);
      }
      Arrays.sort(members);
      System.out.println();
      
      System.out.println("members 소팅 후");
      for(int i=0; i<members.length;i++)
      {
         System.out.println("members[" + i + "]의 값 : " + members[i].name);
      }
      index = Arrays.binarySearch(members, m1);
      System.out.println("m1인스턴스가 있는 인덱스 : " + index);
   }
}
