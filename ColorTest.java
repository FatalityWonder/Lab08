import org.junit.Assert;
import org.junit.jupiter.api.Test;

class ColorTest 
{

	@Test
	void testGetR() 
	{
		Color color = null ;
		
		color = Color.RED;
		Assert.assertEquals("Incorrect r value in color" + color.name(), 255, color.getR());
		
		color = Color.GREEN;
		Assert.assertEquals("Incorrect r value in color" + color.name(), 0, color.getR());
		
		color = Color.BLUE;
		Assert.assertEquals("Incorrect r value in color" + color.name(), 0, color.getR());
		
		color = Color.YELLOW;
		Assert.assertEquals("Incorrect r value in color" + color.name(), 255, color.getR());
		
		color = Color.CYAN;
		Assert.assertEquals("Incorrect r value in color" + color.name(), 0, color.getR());
		
		color = Color.MAGENTA;
		Assert.assertEquals("Incorrect r value in color" + color.name(), 255, color.getR());
	}

	@Test
	void testGetG() 
	{
		Color color = null ;
		
		color = Color.RED;
		Assert.assertEquals("Incorrect g value in color" + color.name(), 0, color.getG());
		
		color = Color.GREEN;
		Assert.assertEquals("Incorrect g value in color" + color.name(), 255, color.getG());
		
		color = Color.BLUE;
		Assert.assertEquals("Incorrect g value in color" + color.name(), 0, color.getG());
		
		color = Color.YELLOW;
		Assert.assertEquals("Incorrect g value in color" + color.name(), 255, color.getG());
		
		color = Color.CYAN;
		Assert.assertEquals("Incorrect g value in color" + color.name(), 255, color.getG());
		
		color = Color.MAGENTA;
		Assert.assertEquals("Incorrect g value in color" + color.name(), 0, color.getG());
	}

	@Test
	void testGetB() 
	{
		Color color = null ;
		
		color = Color.RED;
		Assert.assertEquals("Incorrect b value in color" + color.name(), 0, color.getB());
		
		color = Color.GREEN;
		Assert.assertEquals("Incorrect b value in color" + color.name(), 0, color.getB());
		
		color = Color.BLUE;
		Assert.assertEquals("Incorrect b value in color" + color.name(), 255, color.getB());
		
		color = Color.YELLOW;
		Assert.assertEquals("Incorrect b value in color" + color.name(), 0, color.getB());
		
		color = Color.CYAN;
		Assert.assertEquals("Incorrect b value in color" + color.name(), 255, color.getB());
		
		color = Color.MAGENTA;
		Assert.assertEquals("Incorrect b value in color" + color.name(), 255, color.getB());
	}

}
