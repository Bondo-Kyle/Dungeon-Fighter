public class Staff extends Weapon {

	private String _name;
	
	public Staff()
	{
		_name = "Staff";
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
		System.out.print("Staff");
	}

	@Override
	public int getDmg() {
		return 40;
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
