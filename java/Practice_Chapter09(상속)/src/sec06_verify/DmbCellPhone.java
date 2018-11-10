package sec06_verify;

public class DmbCellPhone extends CellPhone {

	
	int channel;
	
	DmbCellPhone(String model, String color, int channel){
		
	}
	
	void turnonDmb() {
		System.out.println("DMB 10번 방송 수신을 시작합니다.");
	}
	
	void changeChannelDmb() {
		System.out.println("채널을 12번으로  바꿉니다.");
	}
	
	void turnoffDmb() {
		System.out.println("DMB 방송수신을 멈춥니다.");
	}
	
}
