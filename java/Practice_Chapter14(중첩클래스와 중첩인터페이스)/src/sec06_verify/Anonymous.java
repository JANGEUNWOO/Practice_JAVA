package sec06_verify;

public class Anonymous {

	int bicycleSpeed;
	int carSpeed;
	
	Vehicle field=new Vehicle() {
		
		@Override
		public void run() {
			System.out.println("�����Ű� �޸��ϴ�.");
			System.out.println("�������� ���ǵ尡 �����ϸ��� �ֳ���?");
		}
		
		@Override
		public void speedup() {
			int bicycleSpeed=0;
			for(int i=1;i<=10;i++) {
				bicycleSpeed+=10;
				System.out.println("�������� ���ǵ�:"+bicycleSpeed+"km�Դϴ�.");
			}
			System.out.println("�����Ű� "+bicycleSpeed+"km��� ���Ʊ���.");
			System.out.println("=================================");
		}
	};
	
	
	
	void passengerCar(){
		Vehicle field1=new Vehicle() {
		  @Override
		  public void run() {
			
			System.out.println("�ڵ����� �޸��ϴ�.");
			System.out.println("�ڵ����� ���ǵ尡 �����ϸ��� �ֳ���?");
		  }
		
		  @Override
		  public void speedup() {
			int carSpeed=0;
			for(int i=1;i<=6;i++) {
				carSpeed+=1;
				System.out.println("�ڵ����� ���ǵ�:"+carSpeed+"���Դϴ�.");
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
				 System.out.println("����Ⱑ �̷��մϴ�.");
				
			  }
			
			  @Override
			  public void speedup() {
				int airplanespeed=0;
				for(int i=1;i<=10;i++) {
					airplanespeed+=100;
					System.out.println("����� ���� ���ǵ�:"+airplanespeed+"km�Դϴ�.");
				}
				System.out.println("=================================");
			  }
		};
		
		field2.run();
		field2.speedup();
		
	}
		
  }
	
	

