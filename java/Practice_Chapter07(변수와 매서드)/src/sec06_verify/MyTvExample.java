package sec06_verify;

public class MyTvExample {

	public static void main(String[] args) {
		
		
		
		
		MyTvTest mytv=new MyTvTest();
		mytv.setChannel(101);
		mytv.channel=15;
		mytv.setChannel(35);
		System.out.println("����CH:"+mytv.channel);
		
		mytv.getPrevChannel();
		mytv.getPrevChannel();
		mytv.getPrevChannel();
		mytv.getPrevChannel();
		mytv.getPrevChannel();
		System.out.println("����CH:"+mytv.channel);
		mytv.getChannel();
		mytv.getChannel();
		mytv.getChannel();
		mytv.getChannel();
		mytv.getChannel();
		System.out.println("����CH:"+mytv.channel);
		
		mytv.setVolume(101);
		mytv.volume=20;
		mytv.setVolume(40);
		System.out.println("����VOL"+mytv.volume);
		
		mytv.getVolume();
		mytv.getVolume();
		mytv.getVolume();
		mytv.getVolume();
		System.out.println("����VOL"+mytv.volume);
		
	    mytv.getPrevVolume();
	    mytv.getPrevVolume();
	    mytv.getPrevVolume();
	    mytv.getPrevVolume();
	    System.out.println("����VOL"+mytv.volume);
	}

}
