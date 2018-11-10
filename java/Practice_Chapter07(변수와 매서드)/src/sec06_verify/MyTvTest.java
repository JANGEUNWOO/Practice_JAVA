package sec06_verify;

public class MyTvTest {

	
	     boolean isPowerOn;
	     int channel;
	     int volume;
	     int prevChannel;
	     int prevVolume;
	     
	     final int MAX_VOLUME=100;
	     final int MIN_VOLUME = 0;
	     final int MAX_CHANNEL = 100;
	     final int MIN_CHANNEL = 1;
	
	
	     void setVolume(int volume) {
	    	 if(volume>=MAX_VOLUME||volume<=MIN_VOLUME) {
	    		 System.out.println("볼륨이 100을 넘거나,0이거나,음수일수는 없습니다.");
	    		 
	    	 }
	     }
         void setChannel(int channel) {
        	 if(channel>=MAX_CHANNEL||channel<=MIN_CHANNEL) {
        		 System.out.println("채널이 100을 넘거나,0이거나,음수일수는 없습니다.");
        	
             }
         }
         
         int getPrevChannel(){
        	 return channel--;
         }
         
         int getChannel() {
        	 return channel++;
         }
         
         
         int getPrevVolume() {
        	 return volume--;
         }
         
         int getVolume() {
        	 return volume++;
         }
         
         
         
         
         
}  
       
	

		
	
