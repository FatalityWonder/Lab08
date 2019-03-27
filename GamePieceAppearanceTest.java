import org.junit.Assert;
import org.junit.Test;

public class GamePieceAppearanceTest 
{

	@Test
	public void testGamePieceAppearance() 
	{
		GamePieceAppearance piece = new GamePieceAppearance(Color.RED, Shape.RACECAR);
		Assert.assertEquals("Constructor not working properly", Color.RED, piece.getColor());
		Assert.assertEquals("Constructor not working properly", Shape.RACECAR, piece.getShape());

	}

	@Test
	public void testGetColor() 
	{
		GamePieceAppearance piece = new GamePieceAppearance(Color.BLUE, Shape.RACECAR);
		Assert.assertEquals("getColor not working properly", Color.BLUE, piece.getColor());
	}

	@Test
	public void testGetShape() 
	{
		GamePieceAppearance piece = new GamePieceAppearance(Color.RED, Shape.RACECAR);
		Assert.assertEquals("getShape not working properly", Shape.RACECAR, piece.getShape());
	}

}
