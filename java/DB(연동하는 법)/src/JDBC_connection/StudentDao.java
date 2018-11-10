package JDBC_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {

	private Connection conn; // DB Ŀ�ؼ�(����) ��ü
	private static final String USERNAME = "root"; // DB���ӽ� ID
	private static final String PASSWORD = "1234"; // DB���ӽ� password
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
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, student.getId());
			pstmt.setString(2, student.getName());
			pstmt.setString(3, student.getGrade());
			pstmt.executeUpdate();
			System.out.println("Student ������ ���� ����");

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null && !pstmt.isClosed()) {
					pstmt.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void updateStudent(Student student) {
		String sql = "update student set name=?,grade=? where id=?;";
		PreparedStatement pstmt = null;
		try {
			pstmt.setString(1, student.getName());
			pstmt.setString(2, student.getGrade());
			pstmt.setString(3, student.getId());
			pstmt.executeUpdate();
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null && !pstmt.isClosed()) {
					pstmt.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	 public void deleteStudent(String id) {
	      String sql = "delete from student where id=?;";
	      PreparedStatement pstmt = null;
	      try {
	         pstmt = conn.prepareStatement(sql);
	         pstmt.setString(1, id);
	         pstmt.executeUpdate();
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
	   }


	// ���ǿ� �´� ���� DB���� 1�� �ุ �������� �޼���
	public Student selectOne(String id) {
		String sql = "select * from student where id=?;";
		PreparedStatement pstmt = null;
		Student re = new Student();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			// pstmt.SetString(2, id); //and ������ ���������� �߰��Ѵ�.
			ResultSet rs = pstmt.executeQuery();
			// select�� ����� ResultSet�� ��� ���ϵȴ�.
			// ������ ���� ������ true ������ false
			if (rs.next()) {
				re.setId(rs.getString("id"));
				re.setName(rs.getString("name"));
				re.setGrade(rs.getString("grade"));
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return re;
	}

	// Student���̺� �����ϴ� ��� ���� �������� �޼�����
	public List<Student> selectAll() {
		String sql = "select * from student;";
		PreparedStatement pstmt = null;
		List<Student> list = new ArrayList<Student>();

		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet re = pstmt.executeQuery();

			while (re.next()) {// �����ð� �ִ���?
				Student s = new Student();
				s.setId(re.getString("id"));
				s.setName(re.getString("name"));
				s.setGrade(re.getString("grade"));
				list.add(s); // List<Student>���ٰ� �߰���
			}
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null && !pstmt.isClosed()) {
					pstmt.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

}
