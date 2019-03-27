import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;

public class BoardGame 
{
	protected LinkedHashMap<String, GamePiece> playerPieces;
	protected LinkedHashMap<String, Location> playerLocations;
	
	public BoardGame()
	{
		playerPieces = new LinkedHashMap<String, GamePiece>();
		playerLocations = new LinkedHashMap<String, Location>();
	}
	
	public boolean addPlayer(String playerName, GamePiece gamePiece, Location initialLocation)
	{
		if (playerPieces.containsKey(playerName) && playerLocations.containsKey(playerName))
		{
			return false;
		}
		
		playerPieces.put(playerName, gamePiece);
		playerLocations.put(playerName, initialLocation);
		
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
		playerLocations.put(playerName, newLocation);
	}
	
	public String[] moveTwoPlayers(String[] playerNames, Location[] newLocations)
	{
		GamePiece first = GamePiece.movesFirst(playerPieces.get(playerNames[0]), playerPieces.get(playerNames[1]));
		String[] players = new String[2];
		
		if (first.equals(playerPieces.get(playerNames[0])))
		{
			movePlayer(playerNames[0], newLocations[0]);
			movePlayer(playerNames[1], newLocations[1]);
			players[0] = playerNames[0];
			players[1] = playerNames[1];
		}
		else
		{
			movePlayer(playerNames[1], newLocations[1]);
			movePlayer(playerNames[0], newLocations[0]);
			players[0] = playerNames[1];
			players[1] = playerNames[0];
		}
		
		return players;
	}
	
	public Location getPlayersLocation(String player)
	{
		return playerLocations.get(player);
	}
	
	public ArrayList<String> getPlayersAtLocation(Location loc)
	{
		ArrayList<String> players = new ArrayList<String>();
		
		for (String name : playerLocations.keySet())
		{
			if (loc.equals(playerLocations.get(name)))
			{
				players.add(name);
			}
		}
		
		return players;
	}
	
	public ArrayList<GamePiece> getGamePiecesAtLocation(Location loc)
	{
		ArrayList<GamePiece> pieces = new ArrayList<GamePiece>();
		
		for (String name : playerLocations.keySet())
		{
			if (loc.equals(playerLocations.get(name)))
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
		return new HashSet<Location>(playerLocations.values());
	}
	
	public Set<GamePiece> getPlayerPieces()
	{
		return new HashSet<GamePiece>(playerPieces.values());
	}
	
}
