package sec04_verify;

public class Audio {

	private String brand;
	private String quality;
	private int channel;
	
	public Audio(String brand,String quality,int channel) {
		this.brand=brand;
		this.quality=quality;
		this.channel=channel;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getQuality() {
		return quality;
	}

	public void setQuality(String quality) {
		this.quality = quality;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}
	
	public String toString() {
		return "내 오디오는 "+this.brand+"제조사이며, 음질은 "+this.quality+"이며  "+this.channel+"이다."; 
	}

}
