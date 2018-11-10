package sec04_exam_generic_method_2;

public class Util {

	// compare()�޼���� �Ű������� �� Pair��ü�� �޾Ƽ� �ش� ���׸�Ÿ���� K, V�� ���ؼ�
	// �� �� ������ true, �ϳ��� �ٸ��� False�� �����ϴ� �޼����̴�.

	public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
		// PairŬ������ getKey�޼��带 �̿��ؼ� p1�� p2�� K���� ����
		// ��, Object�� equals()�� �����ǰ� �Ǿ� �ִ� Ÿ���̾�� ������
		boolean keyCompare = p1.getKey().equals(p2.getKey());

		// PairŬ������ getValue�ż��带 �̿��ؼ� p1�� p2�� V���� ����
		// ��, Object�� equals()�� �����ǰ� �Ǿ� �ִ� Ÿ���̾�� ������
		boolean valueCompare = p1.getValue().equals(p2.getValue());

		return keyCompare && valueCompare; // �� �� true���� true�� ������
	}
}
