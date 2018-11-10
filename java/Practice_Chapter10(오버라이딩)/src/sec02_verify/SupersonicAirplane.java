package sec02_verify;

public class SupersonicAirplane extends Airplane{

	        static final int NORMAL = 1	;	
			static final int SUPERSONIC = 2	;
			int flyMode;

			
			
			@Override
			void fly() {
				if(flyMode==1) {
					System.out.println("일반비행합니다");
				}else if(flyMode==2){
					System.out.println("초음속비행합니다.");	
				}	
			}
			

}
