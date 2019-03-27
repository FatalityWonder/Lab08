import org.junit.Assert;
import org.junit.Test;

public class GamePieceTest {

	@Test
	public void testGetColor() 
	{
		Assert.assertEquals("getColor not working properly", Color.RED, GamePiece.RED_RACER.getColor());
		Assert.assertEquals("getColor not working properly", Color.BLUE, GamePiece.BLUE_RACER.getColor());
		Assert.assertEquals("getColor not working properly", Color.MAGENTA, GamePiece.MAGENTA_RACER.getColor());
		Assert.assertEquals("getColor not working properly", Color.RED, GamePiece.RED_THIMBLE.getColor());
		Assert.assertEquals("getColor not working properly", Color.BLUE, GamePiece.BLUE_BOOT.getColor());
		Assert.assertEquals("getColor not working properly", Color.GREEN, GamePiece.GREEN_BOOT.getColor());
		Assert.assertEquals("getColor not working properly", Color.YELLOW, GamePiece.YELLOW_BOOT.getColor());
	}

	@Test
	public void testGetShape() 
	{
		Assert.assertEquals("getShape not working properly", Shape.RACECAR, GamePiece.RED_RACER.getShape());
		Assert.assertEquals("getShape not working properly", Shape.RACECAR, GamePiece.BLUE_RACER.getShape());
		Assert.assertEquals("getShape not working properly", Shape.RACECAR, GamePiece.MAGENTA_RACER.getShape());
		Assert.assertEquals("getShape not working properly", Shape.THIMBLE, GamePiece.RED_THIMBLE.getShape());
		Assert.assertEquals("getShape not working properly", Shape.BOOT, GamePiece.BLUE_BOOT.getShape());
		Assert.assertEquals("getShape not working properly", Shape.BOOT, GamePiece.GREEN_BOOT.getShape());
		Assert.assertEquals("getShape not working properly", Shape.BOOT, GamePiece.YELLOW_BOOT.getShape());
	}

	@Test
	public void testMovesFirst() 
	{
		Assert.assertEquals("movesFirst not working", GamePiece.BLUE_BOOT, GamePiece.movesFirst(GamePiece.BLUE_BOOT, GamePiece.GREEN_BOOT));
		Assert.assertEquals("movesFirst not working", GamePiece.BLUE_BOOT, GamePiece.movesFirst(GamePiece.GREEN_BOOT, GamePiece.BLUE_BOOT));
	}

	@Test
	public void testToString() 
	{
		Assert.assertEquals("toString not working", "BLUE_RACER: a BLUE racecar with priority 2", GamePiece.BLUE_RACER.toString());
	}

}
