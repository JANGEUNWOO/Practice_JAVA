package jnit_exam01_test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import jnit_exam01.Data;
import jnit_exam01.DataDao;

public class DataDaoTest {

	private DataDao dataDao;

	@Before
	public void setUp() throws Exception {

		/*
		 * DataDao ������ ȣ��� 2���� �����Ͱ� ����Ʈ������ �Էµȴ�. ��, db.size�� 2�� �ȴ�.
		 */
		dataDao = new DataDao();
	}

	@Test
	public void test() {
		// addDataȣ�� ��, db.size�� 3�� �Ǵ��� �׽�Ʈ�� �Ѵ�.
		dataDao.addData(new Data(0, 0));
		assertEquals(3, dataDao.getDataAll().size());
	}

}
