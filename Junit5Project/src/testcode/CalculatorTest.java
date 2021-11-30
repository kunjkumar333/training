package testcode;

import static org.junit.Assert.*;
import static org.junit.Assume.assumeFalse;
import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import businesscode.Calculator;

public class CalculatorTest {
	
	//Create a object of a class to be Tested
	private Calculator calc;
	
	/*@Before annotation in JUnit is used on a method containing Java code to run
	 *  before each test case. i.e it runs before each test execution.*/
	@Before
	public void setUp() throws Exception {
		calc=new Calculator();
	}

	
	/*@After annotation is used on a method containing java code to run after each test case. 
	 * These methods will run even if any exceptions are thrown in the test case or in the case of assertion failures.*/
	@After
	public void tearDown() throws Exception {
		calc=null;
	}

	@Test
	public void testAdd() {
		assumeTrue(5>10);
		double result=calc.add(10, 40);
		assertEquals(50,result,0);
	}

	@Test
	public void testSubtract() {
		assumeFalse(5<1);
		double result=calc.subtract(50, 30);
		assertEquals(20,result,0);
	}

	@Test
	public void testMultiply() {
		
		double result=calc.multiply(25, 5.00);
		
		String user="gosling";
		
		assumingThat(user.equals("kunj"),()->assertEquals(5.0,result,0));
	}

	@Test
	public void testDivide() {
		double result=calc.divide(20.00,10.00);
		assertEquals(2,result,0);
	}

}
