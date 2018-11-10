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
	// DB���� ���(��Ű��=�����ͺ��̽���)����
	private static final String URL = "jdbc:mysql://localhost/sqldb";

	public StudentDao() {
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

	// DB�� �����͸� �����ϴ� �޼���
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

	// ���ǿ� �´� ���� DB���� 1�� �ุ �������� �޼���
	public Student selectOne(String id) {
		String sql = "select* from student where id=?;";
		PreparedStatement pstnt = null;
		Student re = new Student();
		try {
			pstnt = conn.prepareStatement(sql);
			pstnt.setString(1, id);
			// pstnt.serStrung(2, id); //and ������ ���� ������ �߰��Ѵ�.
			ResultSet rs = pstnt.executeQuery();
			// select�� ����� ResultSet�� ��� ���ϵȴ�.
			if (rs.next()) { // ������ ���� ������ true, ������ false
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

	// student���̺� �����ϴ� ��� ���� �������� �޼�����.
	public List<Student> selectAll() {
		String sql = "select * from student;";
		PreparedStatement pstnt = null;

		List<Student> list = new ArrayList<>();
		try {
			pstnt = conn.prepareStatement(sql);
			ResultSet re = pstnt.executeQuery();
			while (re.next()) {// �����ð� �ִ°�?
				Student s = new Student();
				s.setId(re.getString("id"));
				s.setName(re.getString("name"));
				s.setGrade(re.getString("grade"));
				list.add(s); // List<Student>���ٰ� �߰�
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
