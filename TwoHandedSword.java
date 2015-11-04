public class TwoHandedSword extends Weapon {

	private String _name;
	
	public TwoHandedSword()
	{
		_name = "Two Handed Sword";
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
		System.out.print("Two Handed Sword");
	}

	@Override
	public int getDmg() {
		return 25;
	}
	@Override
	public void use(Hero hero) 
	{
		hero.setWeapon(this);
	}

	@Override
	public void use(Dungeon dungeon) 
	{
		// TODO Auto-generated method stub
		
	}
}
