public class SmallHPpotion extends Consumable {

	private String _name;
	
	public SmallHPpotion()
	{
		_name = "Small HP potion";
	}
	
	public String toString()
	{
		return _name;
	}
	
	@Override
	public int value() {
		return 5;
	}
	
	@Override
	public void use(Hero player)
	{
		System.out.println("Your "+ player.getName()+" used a " + this._name);
		player.setHealth(-25);
	}

	@Override
	public void name() {
		System.out.print("Small HP potion");
	}

	@Override
	public void use(Dungeon dungeon) {
		// TODO Auto-generated method stub
		
	}

}
