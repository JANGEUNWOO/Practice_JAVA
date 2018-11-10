package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class menuDao {

	private Connection conn; // DB 커넥션(연결) 객체
	private static final String USERNAME = "root"; // DB접속시 ID
	private static final String PASSWORD = "1234"; // DB접속시 password
	// DB접속 경로(스키마=데이터베이스명)설정
	private static final String URL = "jdbc:mysql://localhost/burgerking";

	public menuDao() {
		// connection객체를 생성해서 DB에 연결함
		try {
			// 동적 객체르 만들어줌
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			System.out.println("드라이버 로딩 성공!!");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("드라이버 로드 실패!!");
		}

	}

	public ArrayList<Menu> memberSelect() {
		ArrayList<Menu> dtos = new ArrayList<Menu>();
		Connection con = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		String query = "select * from menu_tbl";
		try {
			// DB커넥션 및 쿼리문 실행
			con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			psmt = con.prepareStatement(query);
			rs = psmt.executeQuery();
			// DB에서 가져온 데이터를 아래와 같이 받아서 MemberDTO에 생성자의 매개값으로 대입하고
			// 아울러 그 객체를 ArrayList<MemberDTO>에 계속 추가하고 있다.
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
		// 다 추가된 ArrayList<MemberDTO>객체를 리턴하고 있다.
		return dtos;

	}

}
