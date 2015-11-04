public class BronzeArmor extends Armor{
private String _name;
	
	public BronzeArmor()
	{
		_name = "Bronze Armor";
	}
	
	public String toString()
	{
		return _name;
	}
	@Override
	public int value() {
		return 35;
	}

	@Override
	public void name() {
		System.out.print("Bronze Armor");
	}

	@Override
	public int damageReduct() {
		return 10;
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
