package sec08_verify;

public class NotExistIDException extends Exception {

	NotExistIDException(){
		
	}
	
	NotExistIDException(String id){
		super(id);
		 
    }
}



