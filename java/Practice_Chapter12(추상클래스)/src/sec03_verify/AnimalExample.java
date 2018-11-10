package sec03_verify;

public class AnimalExample {

	public static void main(String[] args) {
		
		
		Cat a=new Cat("포유류");
		a.breathe();
		a.sound();
		System.out.println("---------------------------");
		
		Dog d=new Dog("포유류");
		d.breathe();
		d.sound();
		System.out.println("---------------------------");
		
		Tree_Sparrow T=new Tree_Sparrow("조류");
		T.breathe();
		T.sound();
		System.out.println("---------------------------");
				
		
		
		

	}

}
