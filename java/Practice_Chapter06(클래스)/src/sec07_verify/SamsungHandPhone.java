package sec07_verify;

public class SamsungHandPhone {

	
	      String company;
	      String model;
	      String color;
	      int release;
		public String getCompany() {
			return company;
		}
		public void setCompany(String company) {
			this.company = company;
		}
		public String getModel() {
			return model;
		}
		public void setModel(String model) {
			for(int i=3;i<8;i++) {
				if(model!="Galaxy"+i);
				else {
					this.model=model;
					break;
				}
			}
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public int getRelease() {
			return release;
		}
		public void setRelease(int release) {
			this.release = release;
		}
	      
	      
	    @Override
	    public String toString() {
			return this.company+"ȸ����"+this.color+"������"+this.model+
					"���̸� , �������"+this.release+"�Դϴ�.";
	
	    }
	
}
