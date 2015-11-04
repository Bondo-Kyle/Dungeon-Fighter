public class LongSword extends Weapon {

	private String _name;
	
	public LongSword()
	{
		_name = "Long Sword";
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
		System.out.print("Sword");
		
	}

	@Override
	public int getDmg() {
		return 10;
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
