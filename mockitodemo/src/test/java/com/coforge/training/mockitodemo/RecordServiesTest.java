package com.coforge.training.mockitodemo;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

/* 
 @Mock is used for mock creation. It makes the test class more readable.
@Spy is used to create a spy instance. We can use it instead spy(Object) method.
@InjectMocks is used to instantiate the tested object automatically and inject all the @Mock or @Spy annotated 
field dependencies into it (if applicable).
@Captor is used to create an argument captor
 */

/* 
Mockito needs to be initialized, to mock and inject objects marked by Annotations.
Annotate the test with the @RunWith(MockitoJUnitRunner.class) so that mockito can process the annotations.
 */
@RunWith(MockitoJUnitRunner.class)
public class RecordServiesTest {
	
	/* 
Annotate service field with the @InjectMocks annotation to first
instantiate and then inject both mocked dependencies.
	 */
	@InjectMocks
	RecordService recordService;
	
	@Mock
	DatabaseDao databaseMock;
	
	@Mock
	NetworkDao networkMock;
	
	@Test
	public void SaveTest() {
		boolean saved= recordService.save("hello.txt");
		assertEquals(true,saved);
		
		//verify that method in mock objects have been involved
		verify(databaseMock,times(1)).save("hello.txt");
		verify(networkMock,times(1)).save("hello.txt");
	}

}
