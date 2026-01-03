package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class CodewarsCatchingCarMileageNumbersTest {

	@Test 
	  public void testTooSmall() {
	    assertEquals(0, CodewarsCatchingCarMileageNumbers.isInteresting(3, new int[]{1337, 256}));
	  }
	  
	  @Test 
	  public void testAlmostAwesome() {
	    assertEquals(1, CodewarsCatchingCarMileageNumbers.isInteresting(1336, new int[]{1337, 256}));
	  }
	  
	  @Test 
	  public void testAwesome() {
	    assertEquals(2, CodewarsCatchingCarMileageNumbers.isInteresting(1337, new int[]{1337, 256}));
	  }
	  
	  @Test 
	  public void testFarNotInteresting() {
	    assertEquals(0, CodewarsCatchingCarMileageNumbers.isInteresting(11208, new int[]{1337, 256}));
	  }
	  
	  @Test 
	  public void testAlmostInteresting() {
	    assertEquals(1, CodewarsCatchingCarMileageNumbers.isInteresting(11209, new int[]{1337, 256}));
	  }
	  
	  @Test 
	  public void testInteresting() {
	    assertEquals(2, CodewarsCatchingCarMileageNumbers.isInteresting(11211, new int[]{1337, 256}));
	  }

}
