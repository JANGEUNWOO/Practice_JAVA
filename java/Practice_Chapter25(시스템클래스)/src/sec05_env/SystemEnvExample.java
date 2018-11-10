package sec05_env;

public class SystemEnvExample {

	   public static void main(String[] args) {
	      //환경변수 읽어와 출력 
	      String javaHome = System.getenv("JAVA_HOME");
	      String path = System.getenv("Path");
	      String temp = System.getenv("TEMP");
	      
	      System.out.println("[JAVA_HOME]"+javaHome);
	      System.out.println("[Path]"+path);
	      System.out.println("[Temp]"+temp);
	   }
	}