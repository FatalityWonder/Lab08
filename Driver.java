import java.util.Set;

public class Driver 
{

	public static void main(String[] args) 
	{
		System.out.println(GamePiece.BLUE_BOOT);
		
		BoardGame bg = new BoardGame();
		bg.addPlayer("Mark", GamePiece.RED_RACER, Location.DINING_ROOM);
		bg.addPlayer("Bob", GamePiece.GREEN_BOOT, Location.BALLROOM);
		bg.addPlayer("Ron", GamePiece.RED_THIMBLE, Location.KITCHEN);
		
		Set<Location> locs = bg.getPlayerLocations();
		
		System.out.println(locs);
		
	}

}
