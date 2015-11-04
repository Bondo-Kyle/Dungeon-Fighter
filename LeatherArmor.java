public class LeatherArmor extends Armor{

private String _name;
	
	public LeatherArmor()
	{
		_name = "Leather Armor";
	}
	
	public String toString()
	{
		return _name;
	}
	
	@Override
	public int value() {
		return 25;
	}

	@Override
	public void name() {
		System.out.print("Leather Armor");		
	}

	@Override
	public int damageReduct() {
		return 5;
	}
	@Override
	public void use(Hero hero) 
	{
		hero.setArmor(this);
	}

	@Override
	public void use(Dungeon dungeon) {
		// TODO Auto-generated method stub
		
	}
}
