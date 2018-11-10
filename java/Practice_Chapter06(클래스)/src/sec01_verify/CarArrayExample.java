package sec01_verify;

public class CarArrayExample {

	public static void main(String[] args) {
		
		
		Car[] cArr=new Car[5];
		
		for(int i=0;i<cArr.length;i++) {
			cArr[i]=new Car();
			System.out.println("cArr["+i+"]인스턴스 생성");
	     
		
		
		
		if(i==0){
		     cArr[i].fixedSpeed=cArr[i].fixedSpeed;
	      }
	      else {
	    	 cArr[i].fixedSpeed=cArr[i].fixedSpeed+i;
	      }
        }  
		
	    
		
		for(int j=0;j<cArr.length;j++) {
			System.out.println("cArr["+j+"]="+j);
		}
		
		
		
		
		

	}

}
