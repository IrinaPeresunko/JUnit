package maven.junit.test.JUnit;

import org.junit.Test;
import junit.framework.TestCase;

public class CalculateTest extends TestCase{
	
	@Test
	public void testMultiply(){
		Calculate calculate = new Calculate();
		int result = calculate.multiplyOperands(5, 10);
		assertEquals("the answer should be 50",50,result);
	}
	@Test
	public void testEquals(){
		Calculate calculate = new Calculate();
		assertTrue(calculate.ifOperandsIsEquals(5, 5));
	}
}
