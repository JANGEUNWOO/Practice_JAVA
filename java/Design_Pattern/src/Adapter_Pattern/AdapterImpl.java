package Adapter_Pattern;

public class AdapterImpl implements Adapter {

	/* //�ι�
	 * @Override public Float twiceOf(Float f) {
	 * 
	 * return (float) Math.twoTime(f.doubleValue()); }
	 */
	
	//��ȭ�� �˰������� ����
	@Override
	public Float twiceOf(Float f) {

		return Math.doubled(f.doubleValue()).floatValue();
	}

	@Override
	public Float halfOf(Float f) {
		return (float) Math.half(f.doubleValue());
	}

}
