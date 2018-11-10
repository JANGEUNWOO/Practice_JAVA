package sec05_verify;

public class StringStack implements Stack {
    
	private String[] stringStack;
	private int a;
	
	StringStack(int num){
	    this.a=0; //StringStack 생성시 Stack의 위치 a[0]
		this.stringStack=new String[num];
		System.out.println(num+"개의 스텍영역이 생성되었습니다.");
	}
	
	@Override
	public int length() {
		return stringStack.length;
	}

	@Override
	public Object pop() {
		if(a==0) {
	    	System.out.println("스택이 비었습니다.");
	    }
		a=a-1;
		return stringStack[a];
	}

	@Override
	public void push(Object object)  {
		
		System.out.println(object+"가 스택에 저장되어있습니다.");
		stringStack[a]=(String)object;
		System.out.println(object+"문장이"+(a+1)+"번째 스텍에 저장되었습니다.");
        a++;
	}
	
}



