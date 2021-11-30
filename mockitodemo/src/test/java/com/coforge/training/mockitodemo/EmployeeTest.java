package com.coforge.training.mockitodemo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.spy;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

/* 
 @Spy is used to create a spy instance. We can use it instead spy(Object) method.
 Mockito provides option to create spy on real objects. When spy is called, then actual 
 method of real object is called.
 */
@RunWith(MockitoJUnitRunner.class)
public class EmployeeTest {

	private Employee spyEmp;
	private Employee emp;
	
	private static final String FIRST_NAME = "Joe";
	private static final String LAST_NAME = "M";
	private static final int AGE = 35;
	
	@Before
	public void buildSpy() {
	emp = new Employee(FIRST_NAME, LAST_NAME, AGE);
	spyEmp = spy(emp); //created by spy object of employee using static method spy
	}
	
	@Test
	public void verifySpyEffectOnRealInstance() {
	spyEmp.setAge(20);
	assertFalse(emp.getAge() == spyEmp.getAge());
	}
	
	@Test
	//@DisplayName("this is first name")
	public void verifySpyEffectOnRealInstance1() {
		spyEmp.setFirstName("Joe");
		assertTrue(emp.getFirstName() == spyEmp.getFirstName());
	}
	@Test
	public void verifySpyEffectOnRealInstance2() {
		spyEmp.setLastName("M");
		assertTrue(emp.getLastName() == spyEmp.getLastName());
	}
	public void fullname()
	{
	//String fName=spyEmp.getFullName();
	assertTrue(emp.getFullName().equals(spyEmp.getFullName()));
	}
}
