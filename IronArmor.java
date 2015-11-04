public class IronArmor extends Armor{

private String _name;
	
	public IronArmor()
	{
		_name = "Iron Armor";
	}
	
	public String toString()
	{
		return _name;
	}
	
	@Override
	public int value() {
		return 50;
	}

	@Override
	public void name() {
		System.out.print("Iron Armor");
	}

	@Override
	public int damageReduct() {
		return 20;
	}
	@Override
	public void use(Dungeon dungeon) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void use(Hero hero) {
		// TODO Auto-generated method stub
		
	}
}
