package Verify03;

public class Model {

	public int calculator(String operator, int x, int y) {
		if (operator.equals("+")) {
			return x + y;
		} else if (operator.equals("-")) {
			return x - y;
		} else if (operator.equals("*")) {
			return x * y;
		} else {
			return x / y;
		}
	}
}
