package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class menuDao {

	private Connection conn; // DB Ŀ�ؼ�(����) ��ü
	private static final String USERNAME = "root"; // DB���ӽ� ID
	private static final String PASSWORD = "1234"; // DB���ӽ� password
	// DB���� ���(��Ű��=�����ͺ��̽���)����
	private static final String URL = "jdbc:mysql://localhost/burgerking";

	public menuDao() {
		// connection��ü�� �����ؼ� DB�� ������
		try {
			// ���� ��ü�� �������
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			System.out.println("����̹� �ε� ����!!");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("����̹� �ε� ����!!");
		}

	}

	public ArrayList<Menu> memberSelect() {
		ArrayList<Menu> dtos = new ArrayList<Menu>();
		Connection con = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		String query = "select * from menu_tbl";
		try {
			// DBĿ�ؼ� �� ������ ����
			con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			psmt = con.prepareStatement(query);
			rs = psmt.executeQuery();
			// DB���� ������ �����͸� �Ʒ��� ���� �޾Ƽ� MemberDTO�� �������� �Ű������� �����ϰ�
			// �ƿ﷯ �� ��ü�� ArrayList<MemberDTO>�� ��� �߰��ϰ� �ִ�.
			while (rs.next()) {
				
				String id = rs.getString("id");
				String name = rs.getString("name");
				String cost = rs.getString("cost");
				
				Menu dto = new Menu(id, name, cost);
				dtos.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// �� �߰��� ArrayList<MemberDTO>��ü�� �����ϰ� �ִ�.
		return dtos;

	}

}
