package sec05_verify;

public class MemberService {

        String id;
        String password;
		
		public boolean login(String id, String password) {
			this.id=id;
			this.password=password;
			if(id=="hong" && password=="12345") {
				System.out.println("hong�� �α��� �Ǿ����ϴ�.");
				return true;
			}else {
			    System.out.println("ID�� Ȯ�����ּ���!");
				return false;
			}
			
		}
		
		public void logout(String id) {
			this.id=id;
			if(id=="hong") {
				System.out.println("hong�α׾ƿ� �Ǿ����ϴ�.");
			}
		}
	}


