public class RoundHouse extends Weapon {

	private String _name;
	
	public RoundHouse()
	{
		_name = "a Round House Kick";
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
		System.out.print("War Hammer");
	}

	@Override
	public int getDmg() {
		return 1000;
	}

	@Override
	public void use(Hero hero) 
	{
		hero.setWeapon(this);
	}

	@Override
	public void use(Dungeon dungeon) {
		// TODO Auto-generated method stub
		
	}

}
