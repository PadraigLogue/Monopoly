package BoardTiles;
import Monopoly.Player;


public class BuyableTile extends BoardTile
{
	public Player Owner = null;
	public boolean Owned = false;
	public int TilePrice = 0;
	public int TileUpgradeCost = 0;
	
	public BuyableTile(String _name, int _tilePrice, int _UpgradeCost)
	{
		super(_name);
	}

}
