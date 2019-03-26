import org.junit.Assert;
import org.junit.jupiter.api.Test;

class ShapeTest {

	@Test
	void testToString() 
	{
		Assert.assertEquals("Shape toString incorrect", "thimble", Shape.THIMBLE.toString());
		
		Assert.assertEquals("Shape toString incorrect", "boot", Shape.BOOT.toString());
		
		Assert.assertEquals("Shape toString incorrect", "racecar", Shape.RACECAR.toString());
	}

}
