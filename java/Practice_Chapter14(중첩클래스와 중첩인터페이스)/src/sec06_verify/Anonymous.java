package sec06_verify;

public class Anonymous {

	int bicycleSpeed;
	int carSpeed;
	
	Vehicle field=new Vehicle() {
		
		@Override
		public void run() {
			System.out.println("자전거가 달립니다.");
			System.out.println("자전거의 스피드가 음수일리가 있나요?");
		}
		
		@Override
		public void speedup() {
			int bicycleSpeed=0;
			for(int i=1;i<=10;i++) {
				bicycleSpeed+=10;
				System.out.println("자전거의 스피드:"+bicycleSpeed+"km입니다.");
			}
			System.out.println("자전거가 "+bicycleSpeed+"km라니 미쳤군요.");
			System.out.println("=================================");
		}
	};
	
	
	
	void passengerCar(){
		Vehicle field1=new Vehicle() {
		  @Override
		  public void run() {
			
			System.out.println("자동차가 달립니다.");
			System.out.println("자동차의 스피드가 음수일리가 있나요?");
		  }
		
		  @Override
		  public void speedup() {
			int carSpeed=0;
			for(int i=1;i<=6;i++) {
				carSpeed+=1;
				System.out.println("자동차의 스피드:"+carSpeed+"단입니다.");
			}
			
		  }
	    };
	    field1.run();
	    field1.speedup();
	}
	
	void airPlane() {
		Vehicle field2=new Vehicle(){
			
			 @Override
			  public void run() {
				 System.out.println("=================================");
				 System.out.println("비행기가 이륙합니다.");
				
			  }
			
			  @Override
			  public void speedup() {
				int airplanespeed=0;
				for(int i=1;i<=10;i++) {
					airplanespeed+=100;
					System.out.println("비행기 현재 스피드:"+airplanespeed+"km입니다.");
				}
				System.out.println("=================================");
			  }
		};
		
		field2.run();
		field2.speedup();
		
	}
		
  }
	
	

