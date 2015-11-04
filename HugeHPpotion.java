public class HugeHPpotion extends Consumable{

	private String _name;
	
	public HugeHPpotion()
	{
		_name = "Huge HP potion";
	}
	
	@Override
	public int value() {
		return 50;
	}

	@Override
	public void name() {
		System.out.print("Huge HP potion");
	}

	@Override
	public void use(Hero player) 
	{
		System.out.println("Your "+ player.getName()+" used a " + this._name);
		player.setHealth(-100);
	}

	@Override
	public void use(Dungeon dungeon) {
		// TODO Auto-generated method stub
		
	}
	
	public String toString()
	{
		return _name;
	}

}
