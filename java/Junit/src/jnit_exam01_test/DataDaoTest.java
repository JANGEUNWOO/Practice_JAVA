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
		 * DataDao 생성자 호출시 2개의 데이터가 디폴트값으로 입력된다. 즉, db.size가 2가 된다.
		 */
		dataDao = new DataDao();
	}

	@Test
	public void test() {
		// addData호출 후, db.size가 3이 되는지 테스트를 한다.
		dataDao.addData(new Data(0, 0));
		assertEquals(3, dataDao.getDataAll().size());
	}

}
