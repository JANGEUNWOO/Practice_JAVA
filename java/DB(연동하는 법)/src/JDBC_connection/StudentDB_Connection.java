package JDBC_connection;

import java.util.List;

public class StudentDB_Connection {

	public static void main(String[] args) {

		StudentDao sDao = new StudentDao();
		sDao.insertStudent(new Student("5", "¿Â¿∫øÏ", "A++"));

		Student a = sDao.selectOne("1");
		System.out.println(a.toString());
		System.out.println();

		List<Student> list = sDao.selectAll();
		for (int i = 0; i < list.size(); i++) {
			Student s = list.get(i);
			System.out.println(s.toString());
		}

		sDao.deleteStudent("7");
		list = sDao.selectAll();
		for (int i = 0; i < list.size(); i++) {
			Student s = list.get(i);
			System.out.println(s.toString());
		}

	}

}
