package sec_verify04;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {

	public List<Board> getBoardList() {
		
		
		List<Board> list=new ArrayList<>();
		list.add(new Board("�̰����ڹٴ�","�ſ��"));
		list.add(new Board("�ڹ��� ����","���ü�"));
		list.add(new Board("��ǰ �ڹ����α׷���","Ȳ����"));
		
		return list;
		
	       
	}

}
