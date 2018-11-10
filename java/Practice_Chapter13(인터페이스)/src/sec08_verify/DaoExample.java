package sec08_verify;

public class DaoExample {

	
	static void dbWork(DataAccessObject i) {
		i.delete();
		i.insert();
		i.select();
		i.update();
	}
	
	
	public static void main(String[] args) {
	
		
	   dbWork(new OracleDao());
	   dbWork(new MySqlDao());
	   
	}

}
