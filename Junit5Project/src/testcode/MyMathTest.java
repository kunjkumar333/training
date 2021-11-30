package testcode;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import businesscode.MyMath;

public class MyMathTest {
	
	private MyMath m;

	@Before
	public void setUp() throws Exception {
		m=new MyMath();
	}

	@After
	public void tearDown() throws Exception {
		m=null;
	}

	@Test
	public void testSum() {
		System.out.println("Test with 3 NUmbers");
		assertEquals(12, m.sum(new int[] {5,4,3}));
	}
	@Test
	public void testSum2() {
		System.out.println("test with 5 nos");
         assertEquals(40, m.sum(new int [] {4,8,8,10,10}));
	}

}
