package sec05_verify;

public class StringStack implements Stack {
    
	private String[] stringStack;
	private int a;
	
	StringStack(int num){
	    this.a=0; //StringStack ������ Stack�� ��ġ a[0]
		this.stringStack=new String[num];
		System.out.println(num+"���� ���ؿ����� �����Ǿ����ϴ�.");
	}
	
	@Override
	public int length() {
		return stringStack.length;
	}

	@Override
	public Object pop() {
		if(a==0) {
	    	System.out.println("������ ������ϴ�.");
	    }
		a=a-1;
		return stringStack[a];
	}

	@Override
	public void push(Object object)  {
		
		System.out.println(object+"�� ���ÿ� ����Ǿ��ֽ��ϴ�.");
		stringStack[a]=(String)object;
		System.out.println(object+"������"+(a+1)+"��° ���ؿ� ����Ǿ����ϴ�.");
        a++;
	}
	
}



