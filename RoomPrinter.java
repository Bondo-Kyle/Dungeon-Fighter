public class RoomPrinter 
{	
	public static void printRoom(Room playerPosition)
	{
		char[][] display = new char[11][11];
		
		for(int x = 0; x < 11; x++)
			for(int y = 0; y < 11; y++)
				display[x][y] = 35;
		
		if (playerPosition.checkNorth())
			addNorth(display, playerPosition.getNorth());
		if (playerPosition.checkEast())
			addEast(display, playerPosition.getEast());
		if (playerPosition.checkSouth())
			addSouth(display, playerPosition.getSouth());
		if (playerPosition.checkWest())
			addWest(display, playerPosition.getWest());
		
		for(int x = 4; x < 7; x++)
			for(int y = 4; y < 7; y++)
				display[x][y] = 32;
		
		display[5][5] = 64;
		
		for(int x = 0; x < 11; x++)
		{
			for(int y = 0; y < 11; y++)
				System.out.print(display[x][y] + " ");
			System.out.println();
		}
		
	}

	private static void addWest(char[][] display, Room west)
	{
		display[5][3] = 68;
		for(int x = 4; x < 7; x++)
			for(int y = 0; y < 3; y++)
				display[x][y] = 32;
		display[5][1] = 87;			
		
	}

	private static void addSouth(char[][] display, Room south)
	{
		display[7][5] = 68;
		for(int x = 8; x < 11; x++)
			for(int y = 4; y < 7; y++)
				display[x][y] = 32;
		display[9][5] = 83;		
	}

	private static void addEast(char[][] display, Room east)
	{
		display[5][7] = 68;
		for(int x = 4; x < 7; x++)
			for(int y = 8; y < 11; y++)
				display[x][y] = 32;
		display[5][9] = 69;		
	}

	private static void addNorth(char[][] display, Room north)
	{
		display[3][5] = 68;
		for(int x = 0; x < 3; x++)
			for(int y = 4; y < 7; y++)
				display[x][y] = 32;
		display[1][5] = 78;
	}
}
