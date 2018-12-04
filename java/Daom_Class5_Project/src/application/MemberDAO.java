package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberDAO {

	private Connection con;
	private static final String username = "root";
	private static final String password = "1234";
	private static final String url = "jdbc:mysql://localhost/test";

	public MemberDAO() {
		// connection��ü�� �����ؼ� ��� ��������
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, username, password);
			System.out.println("����̹� ���� ����");

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("����̹� ���� ����");
		}

	}

	public void insertMember(Member member) {
		String sql = "insert into member(id,password,name,addr,phone) values(?,?,?,?,?);";
		PreparedStatement pstmt = null;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, member.getId());
			pstmt.setString(2, member.getPassword());
			pstmt.setString(3, member.getName());
			pstmt.setString(4, member.getAddr());
			pstmt.setString(5, member.getPhone());

			// ������ �����϶�
			pstmt.executeUpdate();
			System.out.println("Member ������ ���Լ���");
		} catch (SQLException e) {
			System.out.println("Member ������ ���Խ���");
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null && !pstmt.isClosed())
					pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public String login(String id, String password) {
		String sql = "select name from member where id=? and password=?;";
		PreparedStatement pstmt = null;
		String name = "";
		Member member = new Member();
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, password);
			ResultSet rs = pstmt.executeQuery();
			// select�� ����� ResultSet�� ��� ���ϵȴ�.
			if (rs.next()) {
				name = rs.getString("name");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null && !pstmt.isClosed())
					pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return name;

	}

}
