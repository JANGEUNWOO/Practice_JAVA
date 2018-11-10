package sec01_pattern;

import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternExample01 {

	public static void main(String[] args) {
		
		
		String[] data= {
				 "bat","baby","bonus","cA","ca","c", "cB","car","combat","count","data","dics"
		    };
		
		Vector<String> vs=new Vector<String>(10);
		//Pattern은 패턴을 정의하는데 사용(ex. c로 시작하는 소문자 영단어)
		Pattern p=Pattern.compile("c[a-z]*");
		System.out.println("c로 시작하는 소문자 영단어를 출력합니다.");
		
		for(int i=0; i<data.length;i++) {
			//Matchar는 Pattern(정규식)과 비교하는 역할
			Matcher s=p.matcher(data[i]);
			
			//Pattrn(정규식)과 일치하나?
			if(s.matches()) {
				System.out.print(data[i]+",");
				vs.add(data[i]);
			}
		}
		System.out.println();
		System.out.println(vs.toString());
		

	}

}
