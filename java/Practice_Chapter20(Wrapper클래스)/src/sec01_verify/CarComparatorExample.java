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
		
		Car c1 = new Car("SM5-����",4);
		Car c2 = new Car("SM7-����",4);
		Car c3 = new Car("SM5-����",4);
		
		CarComparator cc=new CarComparator();
        
		int result=Objects.compare(c1, c2, cc);
		int result2=Objects.compare(c1, c3, cc);
			
		
		if(result==-2) {
			System.out.println("c1�� c2�� ���� �����Դϴ�.");
		}
        if(result2==-2) {
        	System.out.println("c1�� c3�� ���� �����Դϴ�.");
        }else {
        	System.out.println("c1�� c3�� �ٸ� �����Դϴ�.");
        }
	}
}
