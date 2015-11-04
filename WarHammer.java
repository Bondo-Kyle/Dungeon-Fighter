public class WarHammer extends Weapon {

	private String _name;
	
	public WarHammer()
	{
		_name = "War Hammer";
	}
	
	public String toString()
	{
		return _name;
	}
	
	@Override
	public int value() {
		return 150;
	}

	@Override
	public void name() {
		System.out.print("War Hammer");
	}

	@Override
	public int getDmg() {
		return 35;
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
