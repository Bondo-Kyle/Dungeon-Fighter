public class Bomb extends Consumable{

	private String _name;
	
	public Bomb()
	{
		_name = "bomb";
	}
	
	public String toString()
	{
		return _name;
	}
	
	@Override
	public int value() {
		return 13;
	}

	@Override
	public void name() {
		System.out.print("Bomb");
	}

	@Override
	public void use(Dungeon dungeon) 
	{
		System.out.println("\n\n************************\nA BOMB GOES OFF\n***************************\n\n");
		RoomFactory.rollExits(dungeon.getPosition());
	}

	@Override
	public void use(Hero player) {
		// TODO Auto-generated method stub
		
	}

}
