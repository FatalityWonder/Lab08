import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Set;

public class BoardGame 
{
	protected LinkedHashMap<String, GamePiece> playerPieces;
	protected LinkedHashMap<String, Location> playerLocation;
	
	public boolean addPlayer(String playerNam, GamePiece gamePiece, Location initialLocation)
	{
		if (playerPieces.containsKey(playerNam) && playerLocation.containsKey(playerNam))
		{
			return false;
		}
		
		playerPieces.put(playerNam, gamePiece);
		playerLocation.put(playerNam, initialLocation);
		
		return true;
	}
	
	public GamePiece getPlayerGamePiece(String playerName)
	{
		return playerPieces.get(playerName);
	}
	
	public String getPlayerWithGamePiece(GamePiece gamePiece)
	{
		String player = null;
		
		for (String name : playerPieces.keySet())
		{
			if (gamePiece.equals(playerPieces.get(name)))
			{
				player = name;
				break;
			}
		}
		
		return player;
	}
	
	public void movePlayer(String playerName, Location newLocation)
	{
		playerLocation.put(playerName, newLocation);
	}
	
	public String[] moveTwoPlayers(String[] playerNames, Location[] newLocations)
	{
		GamePiece first = GamePiece.movesFirst(playerPieces.get(playerNames[0]), playerPieces.get(playerNames[1]));
		GamePiece second;
		Location firstloc;
		Location secondloc;
		String[] players = new String[2];
		
		if (first.equals(playerPieces.get(playerNames[0])))
		{
			second = playerPieces.get(playerNames[1]);
			secondloc = playerLocation.get(playerNames[1]);
			firstloc = playerLocation.get(playerNames[0]);
		}
		else
		{
			second = playerPieces.get(playerNames[0]);
			secondloc = playerLocation.get(playerNames[0]);
			firstloc = playerLocation.get(playerNames[1]);
		}
		
		players[0] = getPlayerWithGamePiece(first);
		playerLocation.put(players[0], newLocations[0]);
		
		players[1] = getPlayerWithGamePiece(first);
		
		
		
		return players;
	}
	
	public Location getPlayersLocation(String player)
	{
		return playerLocation.get(player);
	}
	
	public ArrayList<String> getPlayersAtLocation(Location loc)
	{
		ArrayList<String> players = new ArrayList<String>();
		
		for (String name : playerLocation.keySet())
		{
			if (loc.equals(playerLocation.get(name)))
			{
				players.add(name);
			}
		}
		
		return players;
	}
	
	public ArrayList<GamePiece> getGamePiecesAtLocation(Location loc)
	{
		ArrayList<GamePiece> pieces = new ArrayList<GamePiece>();
		
		for (String name : playerLocation.keySet())
		{
			if (loc.equals(playerLocation.get(name)))
			{
				pieces.add(playerPieces.get(name));
			}
		}
		
		return pieces;
	}
	
	public Set<String> getPlayers()
	{
		return playerPieces.keySet();
	}
	
	public Set<Location> getPlayerLocations()
	{
		return (Set<Location>) playerLocation.values();
	}
	
	public Set<GamePiece> getPlayerPieces()
	{
		return (Set<GamePiece>) playerPieces.values();
	}
	
}
