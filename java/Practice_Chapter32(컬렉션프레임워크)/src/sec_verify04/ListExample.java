package sec_verify04;

public class ListExample {

	public static void main(String[] args) {

	
		
		BoardDao bd=new BoardDao();
		bd.getBoardList();
		
		System.out.println("현재 list에 저장되어있는 Board객체들입니다.");
		
		for(int i=0;i<bd.getBoardList().size();i++) {
			System.out.println(bd.getBoardList().get(i).getTitle()+":"
		+bd.getBoardList().get(i).getContent());
		}
		
		
	}

}
