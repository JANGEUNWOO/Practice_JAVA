package sec_verify04;

public class ListExample {

	public static void main(String[] args) {

	
		
		BoardDao bd=new BoardDao();
		bd.getBoardList();
		
		System.out.println("���� list�� ����Ǿ��ִ� Board��ü���Դϴ�.");
		
		for(int i=0;i<bd.getBoardList().size();i++) {
			System.out.println(bd.getBoardList().get(i).getTitle()+":"
		+bd.getBoardList().get(i).getContent());
		}
		
		
	}

}
