package sec05_verify;

public class FruitBasket {

	public static <K, V> Fruit<K, V> basketing(K k, V v) {

		Fruit<K, V> fruit = new Fruit<K, V>();
		fruit.setK(k);
		fruit.setV(v);
		return fruit;

	}

}
