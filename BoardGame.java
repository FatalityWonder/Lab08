import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Set;

public class BoardGame 
{
	protected LinkedHashMap<String, GamePiece> playerPieces;
	protected LinkedHashMap<String, Location> playerLocation;
	
	public boolean addPlayer(String playerNam, GamePiece gamePiece, Location intialLocation)
	{
		
		return true; //TODO Stubbed
	}
	
	public GamePiece getPlayerGamePiece(String playerName)
	{
		
		return null; //TODO Stubbed
	}
	
	public String getPlayerWithGamePiece(GamePiece gamePiece)
	{
		
		return null; //TODO Stubbed
	}
	
	public void movePlayer(String playerName, Location newLocation)
	{
		//TODO Complete
	}
	
	public String[] moveTwoPlayers(String[] playerNames, Location[] newLocations)
	{
		
		return null; //TODO Stubbed
	}
	
	public Location getPlayersLocation(String player)
	{
		
		return null; //TODO Stubbed
	}
	
	public ArrayList<String> getPlayersAtLocation(Location loc)
	{
		
		return null; //TODO Stubbed
	}
	
	public ArrayList<GamePiece> getGamePiecesAtLocation(Location loc)
	{
		
		return null; //TODO Stubbed
	}
	
	public Set<String> getPlayers()
	{
		
		return null; //TODO Stubbed
	}
	
	public Set<Location> getPlayerLocations()
	{
		
		return null; //TODO Stubbed
	}
	
	public Set<GamePiece> getPlayerPieces()
	{
		
		return null; //TODO Stubbed
	}
	
}
