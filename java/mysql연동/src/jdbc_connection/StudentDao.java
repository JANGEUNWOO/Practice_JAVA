package jdbc_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {

	private Connection conn;
	private static final String USERNAME = "root";
	private static final String PASSWORD = "1234";
	// DB접속 경로(스키마=데이터베이스명)설정
	private static final String URL = "jdbc:mysql://localhost/sqldb";

	public StudentDao() {
		// connection객체를 생성해서 DB에 연결함
		try {
			// 동적 객체를 만들어줌
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			System.out.println("드라이버 로딩 성공!!");

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("드라이버 로드 실패!!");
		}
	}

	// DB에 데이터를 저장하는 메서드
	public void insertStudent(Student student) {
		String sql = "insert into student values(?,?,?);";
		PreparedStatement pstnt = null;
		try {
			pstnt = conn.prepareStatement(sql);
			pstnt.setString(1, student.getId());
			pstnt.setString(2, student.getName());
			pstnt.setString(3, student.getGrade());
			pstnt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstnt != null && !pstnt.isClosed())
					pstnt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void updateStudent(Student student) {
		String sql = "update student set name=?, grade=?, where id=?;";
		PreparedStatement pstnt = null;
		try {
			pstnt = conn.prepareStatement(sql);
			pstnt.setString(1, student.getName());
			pstnt.setString(2, student.getGrade());
			pstnt.setString(3, student.getId());
			pstnt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstnt != null && !pstnt.isClosed())
					pstnt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void deleteStudent(String id) {
		String sql = "delete from student where id = ?;";
		PreparedStatement pstnt = null;
		try {
			pstnt = conn.prepareStatement(sql);
			pstnt.setString(1, id);
			pstnt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstnt != null && !pstnt.isClosed())
					pstnt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	// 조건에 맞는 행을 DB에서 1개 행만 가져오는 메서드
	public Student selectOne(String id) {
		String sql = "select* from student where id=?;";
		PreparedStatement pstnt = null;
		Student re = new Student();
		try {
			pstnt = conn.prepareStatement(sql);
			pstnt.setString(1, id);
			// pstnt.serStrung(2, id); //and 조건이 붙을 때마다 추가한다.
			ResultSet rs = pstnt.executeQuery();
			// select한 결과는 ResultSet에 담겨 리턴된다.
			if (rs.next()) { // 가져올 행이 있으면 true, 없으면 false
				re.setId(rs.getString("id"));
				re.setName(rs.getString("name"));
				re.setGrade(rs.getString("grade"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstnt != null && !pstnt.isClosed())
					pstnt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return re;
	}

	// student테이블에 존재하는 모든 행을 가져오는 메서드임.
	public List<Student> selectAll() {
		String sql = "select * from student;";
		PreparedStatement pstnt = null;

		List<Student> list = new ArrayList<>();
		try {
			pstnt = conn.prepareStatement(sql);
			ResultSet re = pstnt.executeQuery();
			while (re.next()) {// 가져올게 있는가?
				Student s = new Student();
				s.setId(re.getString("id"));
				s.setName(re.getString("name"));
				s.setGrade(re.getString("grade"));
				list.add(s); // List<Student>에다가 추가
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstnt != null && !pstnt.isClosed())
					pstnt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
}
