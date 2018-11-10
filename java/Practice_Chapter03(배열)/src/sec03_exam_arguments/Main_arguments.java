package sec03_exam_arguments;

public class Main_arguments {
             
	//main()의 매개변수값을 성정하기 위하여 메뉴탭좀 run을 선택하고
	//run_configuration을 클릭하여 들어간다. 그리고 매개변수값을 지정하면 된다.
	//arguments(매개변수)
	public static void main(String[] args) {
		
		if(args.length !=2) {
			System.out.println("프로그램의 사용법");
			System.out.println("java MainStringArrayArgument num1 num2");
			System.exit(0);  //시스템 강제종료
		}
        String strNum1=args[0]; //첫번째 데이터 얻기
        String strNum2=args[1]; //두번째 데이터 얻기
        
        
        
        int num1=Integer.parseInt(strNum1); //문자열을 정수로 변환
        int num2=Integer.parseInt(strNum2); //문자열을 정수로 변환
        
        int result=num1+num2;
        System.out.println(num1+" + "+num2+" = "+result);
	}

}
