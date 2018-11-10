package sec05_verify;

public class MyExpExample {

	public static void main(String[] args) {
		
		
		MyExp my=new MyExp();
		my.setBase(2);
		my.setExp(3);
		
		
		System.out.println(my.getBase()+"ÀÇ"+my.getExp()+" = "+my.getValue());
		
		MyExp my2=new MyExp();
		my2.setBase(3);
		my2.setExp(4);
		System.out.println(my2.getBase()+"ÀÇ"+my2.getExp()+" = "+my2.getValue());
		
	}

}
