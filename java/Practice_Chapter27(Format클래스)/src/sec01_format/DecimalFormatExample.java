package sec01_format;

import java.text.DecimalFormat;

public class DecimalFormatExample {

	public static void main(String[] args) {
		double num=1234567.89;
		//아래 소스를 보고 형식지정자에 따라 값이 변화되는 것을 보고 적절히 사용하자.
        DecimalFormat df=new DecimalFormat("0");
        System.out.println(df.format(num));
        
        df=new DecimalFormat("0,0");
        System.out.println(df.format(num));
        
        df=new DecimalFormat("00000000000.00000");
        System.out.println(df.format(num));
        
        df=new DecimalFormat("#");
        System.out.println(df.format(num));
        
        df=new DecimalFormat("#.#");
        System.out.println(df.format(num));
        
        df=new DecimalFormat("###########.#####");
        System.out.println(df.format(num));
        
        df=new DecimalFormat("#.0");
        System.out.println(df.format(num));
        
        df=new DecimalFormat("+#.0");
        System.out.println(df.format(num));
        
        df=new DecimalFormat("-#.0");
        System.out.println(df.format(num));
        
        df=new DecimalFormat("#,###.0");
        System.out.println(df.format(num));
        
        
	}
}
