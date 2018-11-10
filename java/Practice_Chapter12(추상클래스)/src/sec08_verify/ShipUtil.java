package sec08_verify;

public class ShipUtil {

	
	
	static void search(Ship s) {
	
		
		if(s instanceof Ship) {
		s.move();
		s.carry();
		}	
	}
}
