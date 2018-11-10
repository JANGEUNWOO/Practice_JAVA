package sec05_verify;

public class MemberService {

        String id;
        String password;
		
		public boolean login(String id, String password) {
			this.id=id;
			this.password=password;
			if(id=="hong" && password=="12345") {
				System.out.println("hong이 로그인 되었습니다.");
				return true;
			}else {
			    System.out.println("ID를 확인해주세요!");
				return false;
			}
			
		}
		
		public void logout(String id) {
			this.id=id;
			if(id=="hong") {
				System.out.println("hong로그아웃 되었습니다.");
			}
		}
	}


