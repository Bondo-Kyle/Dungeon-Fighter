public class Beard extends Armor{

private String _name;
	
	public Beard()
	{
		_name = "his Beard";
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
		System.out.print("Beard");
	}

	@Override
	public int damageReduct() {
		return 10000;
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
