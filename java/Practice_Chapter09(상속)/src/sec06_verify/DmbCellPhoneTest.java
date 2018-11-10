package sec06_verify;

public class DmbCellPhoneTest {

	public static void main(String[] args) {
		
		DmbCellPhone dm=new DmbCellPhone("자바폰", "검정", 10);
		
		dm.powerOn();
		dm.bell();
		dm.sendVoice("여보세요.");
		dm.receiveVoice("네 안녕하세요! 저는 홍길동인데요.");
		dm.sendVoice("아~예 반갑습니다.");
		dm.hangUp();
		dm.turnonDmb();
		dm.changeChannelDmb();
		dm.turnoffDmb();
	}
}
