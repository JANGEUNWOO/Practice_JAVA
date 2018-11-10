package sec09_verify;

public class Util {

	public static <K, V> V getValue(Pair<K, V> pair, K k) {

		if (pair.getKey().equals(k)) {
			return pair.getValue();
		}

		return null;
	}

}
