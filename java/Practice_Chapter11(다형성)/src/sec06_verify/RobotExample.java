package sec06_verify;

public class RobotExample {
	
	
	public static void main(String[] args) {
		
		action(new DanceRobot());
		action(new DrawRobot());
		action(new SongRobot());
		
	}
	
	static void action(Robot r) {
		if(r instanceof DanceRobot) {
			((DanceRobot) r).dance();
		}
		if(r instanceof DrawRobot) {
			((DrawRobot) r).draw();
		}
		
		if(r instanceof SongRobot) {
			((SongRobot) r).song();
		}	
		
	}

}
