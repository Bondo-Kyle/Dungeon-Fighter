
public class TreasureItem extends GameItem implements InventoryItem
{
	private String _name;
	
	public TreasureItem()
	{
		_name = "a FABULOUS treasure";
	}
	
	public String toString()
	{
		return _name;
	}
	
	@Override
	public int value()
	{
		return 100;
	}

	@Override
	public void name(){	}

	@Override
	public void use(Hero hero) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void use(Dungeon dungeon) {
		// TODO Auto-generated method stub
		
	}

}
