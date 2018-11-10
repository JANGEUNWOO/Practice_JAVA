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
		//Pattern�� ������ �����ϴµ� ���(ex. c�� �����ϴ� �ҹ��� ���ܾ�)
		Pattern p=Pattern.compile("c[a-z]*");
		System.out.println("c�� �����ϴ� �ҹ��� ���ܾ ����մϴ�.");
		
		for(int i=0; i<data.length;i++) {
			//Matchar�� Pattern(���Խ�)�� ���ϴ� ����
			Matcher s=p.matcher(data[i]);
			
			//Pattrn(���Խ�)�� ��ġ�ϳ�?
			if(s.matches()) {
				System.out.print(data[i]+",");
				vs.add(data[i]);
			}
		}
		System.out.println();
		System.out.println(vs.toString());
		

	}

}
