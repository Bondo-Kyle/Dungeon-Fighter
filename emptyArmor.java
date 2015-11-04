public class emptyArmor extends Armor{
private String _name;
	
	public emptyArmor()
	{
		_name = "no armor.";
	}
	
	public String toString()
	{
		return _name;
	}
	@Override
	public int value() {
		return 0;
	}

	@Override
	public void name() {
		System.out.print("no armor");
	}

	@Override
	public int damageReduct() {
		return 0;
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
