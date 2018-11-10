package sec09_verify;

public class ChildPair<K, V> extends Pair<K, V> {

	K key;
	V value;

	public ChildPair(K key, V value) {
		super(key, value);
	}

}
