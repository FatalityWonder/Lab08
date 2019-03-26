import org.junit.Assert;
import org.junit.jupiter.api.Test;

class GamePieceAppearanceTest 
{

	@Test
	void testGamePieceAppearance() 
	{
		GamePieceAppearance piece = new GamePieceAppearance(Color.RED, Shape.RACECAR);
		Assert.assertEquals("Constructor not working properly", piece.getColor(), Color.RED);
		Assert.assertEquals("Constructor not working properly", piece.getShape(), Shape.RACECAR);

	}

	@Test
	void testGetColor() 
	{
		GamePieceAppearance piece = new GamePieceAppearance(Color.BLUE, Shape.RACECAR);
		Assert.assertEquals("getColor not working properly", piece.getColor(), Color.BLUE);
	}

	@Test
	void testGetShape() 
	{
		GamePieceAppearance piece = new GamePieceAppearance(Color.RED, Shape.RACECAR);
		Assert.assertEquals("getShape not working properly", piece.getShape(), Shape.RACECAR);
	}

}
