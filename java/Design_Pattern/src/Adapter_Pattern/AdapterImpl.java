package Adapter_Pattern;

public class AdapterImpl implements Adapter {

	/* //두배
	 * @Override public Float twiceOf(Float f) {
	 * 
	 * return (float) Math.twoTime(f.doubleValue()); }
	 */
	
	//강화된 알고리즘으로 변경
	@Override
	public Float twiceOf(Float f) {

		return Math.doubled(f.doubleValue()).floatValue();
	}

	@Override
	public Float halfOf(Float f) {
		return (float) Math.half(f.doubleValue());
	}

}
