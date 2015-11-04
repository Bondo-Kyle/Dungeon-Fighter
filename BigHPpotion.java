
public class BigHPpotion extends Consumable{

	private String _name;
	
	public BigHPpotion()
	{
		_name = "Big HP potion";
	}
	
	public String toString()
	{
		return _name;
	}
	
	@Override
	public int value() {
		return 10;
	}

	@Override
	public void name() 
	{
		System.out.print("Big HP potion");
	}

	@Override
	public void use(Hero player)
	{
		System.out.println("Your "+ player.getName()+" used a " + this._name);

		player.setHealth(-50);
	}

	@Override
	public void use(Dungeon dungeon) {
		// TODO Auto-generated method stub
		
	}

}
