package Monopoly;

import BoardTiles.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Collectors;

public class Board
{
	public ArrayList<Player> Players = new ArrayList<Player>();
	BoardTile[] boardTiles;
	PlayerInteracter PlayerInteracter = null;
	
	private int CurrentPlayer;
	private int Turn = 0;
	
	public Board(PlayerInteracter playerInteracter)
	{
		PlayerInteracter = playerInteracter;
	}
	
	public void nextTurn() 
	{
		//todo
	}
	
	private void initBoard()
	{
		boardTiles = new BoardTile[]
				{
					new GlobalAwarenessTile("GO"),
					new EnvironmentsAnimalsTile("Grey Wolf", 1000, 4000),
					new ResourceCardTile("Resource Card"),
					new EnvironmentsAnimalsTile("Eurasian Lynx", 1000, 4000),
					new NaturalDisasterTile("Tsunami Rescue"),
					new EnvironmentsAnimalsTile("Antarctica", 1000, 4000),
					new EventsActionsTile(""),
					new EnvironmentsAnimalsTile("Green Sea Turtle", 1000, 4000),
					new EnvironmentsAnimalsTile("Grey Reef Shark", 1000, 4000),
					new AnimalHospitalTile(""),
					new EnvironmentsAnimalsTile("Scottish Wild Cat", 1000, 4000),
					new EnvironmentsAnimalsTile("Titanis", 1000, 4000),
					new EnvironmentsAnimalsTile("Curlew", 1000, 4000),
					new EnvironmentsAnimalsTile("Red Squirrel", 1000, 4000),
					new EnvironmentsAnimalsTile("Mediterranean Sea", 1000, 4000),
					new EnvironmentsAnimalsTile("Narwhal", 1000, 4000),
					new EnvironmentsAnimalsTile("Saber-Toothed Tiger", 1000, 4000),
					new EnvironmentsAnimalsTile("Blue Whale", 1000, 4000),
					new EnvironmentsAnimalsTile("Atlantic Humpback Dolphin", 1000, 4000),
					new BoardTile("Nature Reserve"),
					new EnvironmentsAnimalsTile("Jaguar", 1000, 4000),
					new EventsActionsTile(""),
					new EnvironmentsAnimalsTile("Siamang Gibbon", 1000, 4000),
					new EnvironmentsAnimalsTile("Giant Otter", 1000, 4000),
					new ResourceCardTile(""),
					new EnvironmentsAnimalsTile("Bengal Tiger", 1000, 4000),
					new EnvironmentsAnimalsTile("Snow Leopard", 1000, 4000),
					new NaturalDisasterTile("Hurricane Rescue"),
					new EnvironmentsAnimalsTile("Asian Elephant", 1000, 4000),
					new PoacherTile("Jail"),
					new EnvironmentsAnimalsTile("Leopard", 1000, 4000),
					new EnvironmentsAnimalsTile("Black Rhino", 1000, 4000),
					new EnvironmentsAnimalsTile("Mammoth", 1000, 4000),
					new EnvironmentsAnimalsTile("Ethiopian Wolf", 1000, 4000),
					new EnvironmentsAnimalsTile("Carribean Coral Reef", 1000, 4000),
					new EventsActionsTile(""),
					new EnvironmentsAnimalsTile("Californian Condor", 1000, 4000),
					new EnvironmentsAnimalsTile("Megalodon", 1000, 4000),
					new EnvironmentsAnimalsTile("Bog Turtle", 1000, 4000),
				};
	}
	
	private int RollDice()
	{
		Random r = new Random();
		return r.nextInt((6-1)+1) + 1;
	}
	
	public void showPlayerInfo()
	{
		System.out.printf("{Starting turn %s} \n", Turn);
		
		for(Player player : Players)
		{
			String playerName = player.Name;
			if(player.OwnedProperties.size() == 0)
			{
				System.out.printf("{%s} does not own any properties.\n", playerName);
				continue;
			}
			
			String properties = String.join(", ", player.OwnedProperties.stream().map(x-> x.name).collect(Collectors.toList()));
			System.out.printf("{%s} has properties: %s\n", playerName, properties);
					
		}
	}
	
}
