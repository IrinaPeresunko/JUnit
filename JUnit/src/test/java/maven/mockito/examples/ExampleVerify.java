package maven.mockito.examples;

import static org.mockito.Mockito.*;
import org.junit.Test;
import junit.framework.TestCase;

public class ExampleVerify extends TestCase {
	
//	@Test
//	public void methodCallCheckSample(){
//		InterfaceForTest mockedObject = mock(InterfaceForTest.class);
//		mockedObject.setStringValue("value1");
//		mockedObject.actionMethod();
//		verify(mockedObject).setStringValue("value1");
//		verify(mockedObject).actionMethod();
//	}
	@Test
	public void methodCallCheckSample(){
		InterfaceForTest mockedObject = mock(InterfaceForTest.class);
		when(mockedObject.getStringValue()).thenReturn("expectedValue");
		when(mockedObject.processMethod("input1")).thenReturn("value1");
		when(mockedObject.processMethod("input3")).thenThrow(new Exception("new exception if input3"));
		
		assertEquals("value1",mockedObject.processMethod("input1"));
		try{
			mockedObject.processMethod("input3");
		}catch(Exception e){
			e.printStackTrace();
		}
		assertNull(mockedObject.processMethod("not mocked value"));
		assertEquals("get String Value","expectedValue",mockedObject.getStringValue());
		
	}
}
