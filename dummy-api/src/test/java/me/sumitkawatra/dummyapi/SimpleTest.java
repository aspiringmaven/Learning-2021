package me.sumitkawatra.dummyapi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


/**
 * assert Examples
 * @author sumitkawatra
 *
 */
class SimpleTest {

	@Test
	void testCase1() {
	}
	
	@Test
	void testCase2() {
		
		int actual = 12;
		int expected = 12;
		
		Assertions.assertEquals(expected, actual, " expecting 12 here");
		
		int [] actualArray = {1,2,3,4};
		int [] expectedArray = {1,2,3,4};
		Assertions.assertArrayEquals(expectedArray, actualArray, "Expecting Equals Here");
		Assertions.assertNull(null);
		Assertions.assertNotNull(new Object());
	}
	
	@Test
	void TestCase3When() {
		Exception e = Assertions.assertThrows(NullPointerException.class, () -> {
			throw new NullPointerException("My error message");
		}, "It must be nullPOinteException");
		
		Assertions.assertEquals("My error message", e.getMessage());
	} 

}


