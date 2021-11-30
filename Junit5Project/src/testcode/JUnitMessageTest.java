package testcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import businesscode.JUnitMessage;

class JUnitMessageTest {
	
	String message="Java";
	
	JUnitMessage jm=new JUnitMessage(message);

	@Test
	void testJUnitMessage() {
		System.out.println("JUnit message is printing");
		jm.printHiMessage();
	}

	@Test
	void testPrintMessage() {
		message = "Hi " + message;
		System.out.println("Junit Hi Message is printing ");
		assertEquals(message, jm.printHiMessage());
		System.out.println("Suite Test 1 is successful " + message);
	}
	

}
