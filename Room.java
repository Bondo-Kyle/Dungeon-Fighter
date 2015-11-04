public class Room 
{
	private boolean _hasNorth;
	private boolean _hasEast;
	private boolean _hasSouth;
	private boolean _hasWest;
	private boolean _hasDown;
	private Room _northExit;
	private Room _eastExit;
	private Room _southExit;
	private Room _westExit;
	private Room _downExit;
	private int _roomDepth;
	private GameItem _additional;
	private boolean _hostileRoom;
	
	public Room(int _depth)
	{
		_hasNorth = false;
		_hasEast = false;
		_hasSouth = false;
		_hasWest = false;
		_hasDown = false;
		_northExit = null;
		_eastExit = null;
		_southExit = null;
		_westExit = null;
		_downExit = null;
		_roomDepth = _depth;
		_additional = ItemFactory.generateItem(this._roomDepth);
		_hostileRoom = false;
	}
	
	public void setNorth(Room northernExit)	{ _northExit = northernExit;	_hasNorth = true; }
	public void setEast(Room easternExit)	{ _eastExit = easternExit;		_hasEast = true; }
	public void setSouth(Room southernExit) { _southExit = southernExit;	_hasSouth = true; }
	public void setWest(Room westernExit)	{ _westExit = westernExit;		_hasWest = true; }
	public void setDown(Room downExit)		{ _downExit = downExit;			_hasDown = true; }
	
	public boolean checkNorth()	{ return _hasNorth; }
	public boolean checkEast()	{ return _hasEast; }
	public boolean checkSouth()	{ return _hasSouth; }
	public boolean checkWest()	{ return _hasWest; }
	public boolean checkDown()	{ return _hasDown; }
	
	public void toggleNorth()	{ _hasNorth = !_hasNorth; }
	public void toggleEast()	{ _hasEast = !_hasEast; }
	public void toggleSouth()	{ _hasSouth = !_hasSouth; }
	public void toggleWest()	{ _hasWest = !_hasWest; }
	public void toggleDown()	{ _hasDown = !_hasDown; }
	
	public Room getNorth()	{ return _northExit; }
	public Room getEast()	{ return _eastExit; }
	public Room getSouth()	{ return _southExit; }
	public Room getWest()	{ return _westExit; }
	public Room getDown()	{ return _downExit; }
	
	public int getDepth() { return _roomDepth; }
	public void setDepth(int depth) { _roomDepth = depth; }
	
	public GameItem getAddition() { return _additional; }
	public void removeAddition() { _additional = new EmptyRoomAddition(); }
	
	public boolean isHostile() { return _hostileRoom; }
	public void toggleHostileRoom() { _hostileRoom = !_hostileRoom; }
	
	public void printRoom()
	{
		System.out.println("Room Depth: " + _roomDepth + 
							"\nThere is " + _additional + " here!!" +
							"\nAvailable Exits:");
		
		if (checkNorth())
			System.out.println("\tNorth.");
		if (checkEast())
			System.out.println("\tEast.");
		if (checkSouth())
			System.out.println("\tSouth.");
		if (checkWest())
			System.out.println("\tWest.");
		if (checkDown())
			System.out.println("\tDown. It's a one way trip...");
	}
}
