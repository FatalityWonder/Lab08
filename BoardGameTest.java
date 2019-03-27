import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import org.junit.Test;
import org.junit.Assert;

public class BoardGameTest 
{

	@Test
	public void testAddPlayer() 
	{
		BoardGame bg = new BoardGame();
		
		Assert.assertEquals("addPlayer not working", true, bg.addPlayer("Mark", GamePiece.RED_RACER, Location.DINING_ROOM));
		Assert.assertEquals("addPlayer not working", false, bg.addPlayer("Mark", GamePiece.RED_RACER, Location.DINING_ROOM));
	}

	@Test
	public void testGetPlayerGamePiece() 
	{
		BoardGame bg = new BoardGame();
		bg.addPlayer("Mark", GamePiece.RED_RACER, Location.DINING_ROOM);

		Assert.assertEquals("getPlayerGamePiece not working", GamePiece.RED_RACER, bg.getPlayerGamePiece("Mark"));
	}

	@Test
	public void testGetPlayerWithGamePiece() 
	{
		BoardGame bg = new BoardGame();
		bg.addPlayer("Mark", GamePiece.RED_RACER, Location.DINING_ROOM);
		
		Assert.assertEquals("getPlayerWithGamePiece not working", "Mark", bg.getPlayerWithGamePiece(GamePiece.RED_RACER));
	}

	@Test
	public void testMovePlayer() 
	{
		BoardGame bg = new BoardGame();
		bg.addPlayer("Mark", GamePiece.RED_RACER, Location.DINING_ROOM);
		bg.movePlayer("Mark", Location.BALLROOM);

		Assert.assertEquals("movePlayer not working", Location.BALLROOM, bg.getPlayersLocation("Mark"));
	}

	@Test
	public void testMoveTwoPlayers() 
	{
		BoardGame bg = new BoardGame();
		bg.addPlayer("Mark", GamePiece.RED_RACER, Location.DINING_ROOM);
		bg.addPlayer("Bob", GamePiece.GREEN_BOOT, Location.BALLROOM);
		bg.addPlayer("Ron", GamePiece.RED_THIMBLE, Location.KITCHEN);
		
		String[] names = {"Mark", "Bob"};
		Location[] newLoc = {Location.BILLIARD_ROOM, Location.CONSERVATORY};

		String[] order = bg.moveTwoPlayers(names, newLoc);
		String[] namesExp = {"Mark", "Bob"};
		
		Assert.assertEquals("moveTwoPlayers not working", true, Arrays.equals(order, namesExp));
		Assert.assertEquals("moveTwoPlayers not working", Location.BILLIARD_ROOM, bg.getPlayersLocation("Mark"));
		Assert.assertEquals("moveTwoPlayers not working", Location.CONSERVATORY, bg.getPlayersLocation("Bob"));
		
		String[] names2 = {"Ron", "Bob"};
		Location[] newLoc2 = {Location.HALL, Location.LOUNGE};
		
		String[] order2 = bg.moveTwoPlayers(names2, newLoc2);
		String[] namesExp2 = {"Bob", "Ron"};
		
		Assert.assertEquals("moveTwoPlayers not working", true, Arrays.equals(order2, namesExp2));
		Assert.assertEquals("moveTwoPlayers not working", Location.HALL, bg.getPlayersLocation("Ron"));
		Assert.assertEquals("moveTwoPlayers not working", Location.LOUNGE, bg.getPlayersLocation("Bob"));
	}

	@Test
	public void testGetPlayersLocation() 
	{
		BoardGame bg = new BoardGame();
		bg.addPlayer("Mary", GamePiece.MAGENTA_RACER, Location.STUDY);

		Assert.assertEquals("getPlayersLocation not working", Location.STUDY, bg.getPlayersLocation("Mary"));
	}

	@Test
	public void testGetPlayersAtLocation()
	{
		BoardGame bg = new BoardGame();
		bg.addPlayer("Henry", GamePiece.BLUE_BOOT, Location.BALLROOM);
		bg.addPlayer("Harold", GamePiece.BLUE_RACER, Location.BALLROOM);
		
		ArrayList<String> players = new ArrayList<String>();
		players.add("Henry");
		players.add("Harold");

		Assert.assertEquals("getPlayersAtLocation not working", players, bg.getPlayersAtLocation(Location.BALLROOM));
	}

	@Test
	public void testGetGamePiecesAtLocation() 
	{
		BoardGame bg = new BoardGame();
		bg.addPlayer("Henry", GamePiece.BLUE_BOOT, Location.BALLROOM);
		bg.addPlayer("Harold", GamePiece.BLUE_RACER, Location.BALLROOM);
		
		ArrayList<GamePiece> players = new ArrayList<GamePiece>();
		players.add(GamePiece.BLUE_BOOT);
		players.add(GamePiece.BLUE_RACER);

		Assert.assertEquals("getGamePiecesAtLocation not working", players, bg.getGamePiecesAtLocation(Location.BALLROOM));
	}

	@Test
	public void testGetPlayers() 
	{
		BoardGame bg = new BoardGame();
		bg.addPlayer("Mark", GamePiece.RED_RACER, Location.DINING_ROOM);
		bg.addPlayer("Bob", GamePiece.GREEN_BOOT, Location.BALLROOM);
		bg.addPlayer("Ron", GamePiece.RED_THIMBLE, Location.KITCHEN);
		
		String[] temp = {"Mark", "Bob", "Ron"};
		Set<String> players = new HashSet<String>(Arrays.asList(temp));

		Assert.assertEquals("getPlayers not working", players, bg.getPlayers());
	}

	@Test
	public void testGetPlayerLocations() 
	{
		BoardGame bg = new BoardGame();
		bg.addPlayer("Mark", GamePiece.RED_RACER, Location.DINING_ROOM);
		bg.addPlayer("Bob", GamePiece.GREEN_BOOT, Location.BALLROOM);
		bg.addPlayer("Ron", GamePiece.RED_THIMBLE, Location.KITCHEN);
		
		Location[] temp = {Location.DINING_ROOM, Location.BALLROOM, Location.KITCHEN};
		Set<Location> locs = new HashSet<Location>(Arrays.asList(temp));

		Assert.assertEquals("getPlayerLocations not working", locs, bg.getPlayerLocations());
	}

	@Test
	public void testGetPlayerPieces() 
	{
		BoardGame bg = new BoardGame();
		bg.addPlayer("Mark", GamePiece.RED_RACER, Location.DINING_ROOM);
		bg.addPlayer("Bob", GamePiece.GREEN_BOOT, Location.BALLROOM);
		bg.addPlayer("Ron", GamePiece.RED_THIMBLE, Location.KITCHEN);
		
		GamePiece[] temp = {GamePiece.RED_RACER, GamePiece.GREEN_BOOT, GamePiece.RED_THIMBLE};
		Set<GamePiece> pieces = new HashSet<GamePiece>(Arrays.asList(temp));
		
		Assert.assertEquals("getPlayerPieces not working", pieces, bg.getPlayerPieces());
	}

}
