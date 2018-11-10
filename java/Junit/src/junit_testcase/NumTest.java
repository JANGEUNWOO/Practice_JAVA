package junit_testcase;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import junit_exam.Num;


//NumTest��� Ŭ������ NumŬ������ �ִ� ������,�ż��� ����
//�Ϲ� �ܼ��� �ƴ�JUNIT�� �̿��Ͽ� 
public class NumTest {

	@Before
	public void setUp() throws Exception {
		Num n = new Num(10);
	}

	@Test
	public void testGetValue() {
		Num n=new Num(10);
		assertEquals(10, n.getValue());
	}

/*	@Test
	public void testSetValue() {
		Num n=new Num(10);
		assertEquals(10, n.getValue(10));
	}*/

	@Test
	public void testNum() {
		Num n=new Num(10);
		assertEquals(10, n.getValue());
	}

	@Test
	public void addvalue() {
		Num n=new Num(10);
		assertEquals(20, n.addvalue(10));
	}

}
