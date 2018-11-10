package junit_testcase;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import junit_exam.Num;


//NumTest라는 클래스는 Num클래스의 있는 생성자,매서드 등을
//일반 콘솔이 아닌JUNIT을 이용하여 
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
