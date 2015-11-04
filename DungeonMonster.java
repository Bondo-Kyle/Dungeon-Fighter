
public class DungeonMonster extends GameItem implements DungeonItem
{
	private int _level;
	
	public DungeonMonster(int _roomDepth)
	{
		_level = _roomDepth;
		
	}
	
	public String toString()
	{
		return ("level " + _level + " monster");
	}

	@Override
	public void name() {
		// TODO Auto-generated method stub
		
	}
}
