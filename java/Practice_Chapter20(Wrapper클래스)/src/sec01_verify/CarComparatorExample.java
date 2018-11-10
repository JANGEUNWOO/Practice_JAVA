package sec01_verify;

import java.util.Comparator;
import java.util.Objects;

class Car {

	String model;
	int door;
	
	public Car(String model,int door) {
	     this.model=model;
	     this.door=door;
	}
}

class CarComparator implements Comparator<Car> {

	public int compare(Car a, Car b) {
	return a.model.compareTo(b.model);
	}
}


public class CarComparatorExample {

	public static void main(String[] args) {
		
		Car c1 = new Car("SM5-신형",4);
		Car c2 = new Car("SM7-신형",4);
		Car c3 = new Car("SM5-신형",4);
		
		CarComparator cc=new CarComparator();
        
		int result=Objects.compare(c1, c2, cc);
		int result2=Objects.compare(c1, c3, cc);
			
		
		if(result==-2) {
			System.out.println("c1과 c2는 같은 차종입니다.");
		}
        if(result2==-2) {
        	System.out.println("c1과 c3는 같은 차종입니다.");
        }else {
        	System.out.println("c1과 c3는 다른 차종입니다.");
        }
	}
}
