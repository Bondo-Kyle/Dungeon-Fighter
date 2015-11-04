public class DiamondArmor extends Armor{

private String _name;
	
	public DiamondArmor()
	{
		_name = "Diamond Armor";
	}
	
	public String toString()
	{
		return _name;
	}
	
	@Override
	public int value() {
		return 100;
	}

	@Override
	public void name() {
		System.out.print("Diamond Armor");
	}

	@Override
	public int damageReduct() {
		return 55;
	}

	@Override
	public void use(Hero hero)
	{
		hero.setArmor(this);
		
	}

	@Override
	public void use(Dungeon dungeon)
	{
		// TODO Auto-generated method stub
		
	}

}
