public class Dungeon 
{
	private Room _dungeonEntrance;
	private Room _playerPosition;

	public Dungeon()
	{
		_dungeonEntrance = RoomFactory.generateDownRoom();
		_playerPosition = _dungeonEntrance;
	}
	
	public Room getPosition()
	{
		return _playerPosition;
	}
	
	public void showDoors()
	{
		RoomPrinter.printRoom(_playerPosition);
		_playerPosition.printRoom();
	}
	
	public void moveNorth()
	{
		if(_playerPosition.checkNorth())
			if(_playerPosition.getNorth() == null)
				_playerPosition = RoomFactory.generateNorthRoom(_playerPosition);
			else
				_playerPosition = _playerPosition.getNorth();
		else
			System.out.println("You can't go North here.\n");
	}
	
	public void moveEast()
	{
		if(_playerPosition.checkEast())
			if(_playerPosition.getEast() == null)
				_playerPosition = RoomFactory.generateEastRoom(_playerPosition);
			else
				_playerPosition = _playerPosition.getEast();
		else
			System.out.println("You can't go East here.\n");
	}
	
	public void moveSouth()
	{
		if(_playerPosition.checkSouth())
			if(_playerPosition.getSouth() == null)
				_playerPosition = RoomFactory.generateSouthRoom(_playerPosition);
			else
				_playerPosition = _playerPosition.getSouth();
		else
			System.out.println("You can't go South here.\n");
	}
	
	public void moveWest()
	{
		if(_playerPosition.checkWest())
			if(_playerPosition.getWest() == null)
				_playerPosition = RoomFactory.generateWestRoom(_playerPosition);
			else
				_playerPosition = _playerPosition.getWest();
		else
			System.out.println("You can't go West here.\n");
	}
	
	public void moveDown()
	{
		if(_playerPosition.checkDown())
			_playerPosition = RoomFactory.generateEmptyRoom(_playerPosition);
		else
			System.out.println("You can't go Down here.\n");
	}
}
