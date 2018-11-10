package sec09_verify;

public class OtherPair<K, V> {

	K key;
	V value;

	OtherPair(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}

}
