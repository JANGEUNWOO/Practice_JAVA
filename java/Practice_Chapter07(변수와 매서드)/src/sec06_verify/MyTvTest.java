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
	    		 System.out.println("������ 100�� �Ѱų�,0�̰ų�,�����ϼ��� �����ϴ�.");
	    		 
	    	 }
	     }
         void setChannel(int channel) {
        	 if(channel>=MAX_CHANNEL||channel<=MIN_CHANNEL) {
        		 System.out.println("ä���� 100�� �Ѱų�,0�̰ų�,�����ϼ��� �����ϴ�.");
        	
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
       
	

		
	
