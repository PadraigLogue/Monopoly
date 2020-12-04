package Monopoly;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import BoardTiles.*;

public class Program
{

	public static void main(String[] args) throws IOException
	{
		PlayerInteracter playerInteracter = new PlayerInteracter();
		Board board = new Board(playerInteracter);
		playerInteracter.initSetup(board);
		BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));  
		board.Players.get(0).OwnedProperties.add(new NaturalDisasterTile("Natural Disaster Falls"));
		board.Players.get(0).OwnedProperties.add(new ResourceCardTile("Resource Lodge"));

		board.showPlayerInfo();
		while(true)
		{
			board.nextTurn();
			obj.readLine();
		}
	}

}
