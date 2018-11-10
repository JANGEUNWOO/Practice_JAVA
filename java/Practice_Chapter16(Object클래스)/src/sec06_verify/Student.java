package sec06_verify;

public class Student implements Cloneable {

	private String nID;
	private String szName;
	
	public String getnID() {
		return nID;
	}

	public void setnID(String nID) {
		this.nID = nID;
	}

	public String getSzName() {
		return szName;
	}

	public void setSzName(String szName) {
		this.szName = szName;
	}

	public Student(String nID, String szName) {
		this.nID=nID;
		this.szName=szName;
	}
	
	public String toString() {
		try {
		if(nID.equals(null)&&szName.equals(null)) {
			return null;	
		}else { 
			return "Student인스턴스1 : ID는"+  this.nID+" , NAME은 "+this.szName;
	    }
	    }catch(NullPointerException e){
	    	return null;
	    }
	}
	public Student getStudent() {
		Student cloned=null;
		System.out.println("Student인스턴스2를 Student인스턴스1으로 얕은 복제를 함");
		try {
			cloned=(Student)this.clone();
		}catch(CloneNotSupportedException e) {}
		
		return cloned;
	}
	
	
}
