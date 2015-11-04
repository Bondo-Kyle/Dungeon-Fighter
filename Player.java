import java.util.LinkedList;

public class Player
{
	private String _name;
	private boolean _playing;
	private LinkedList<InventoryItem> _inventory;
	private heroParty _heros;
	
	public Player(String name)
	{
		_name = name;
		_playing = true;
		_heros = new heroParty();
		_inventory = new LinkedList<InventoryItem>();
	}
	
	public boolean playing() { return _playing; }
	public void togglePlaying() { _playing = !_playing; }
	
	public String toString()
	{
		return _name;
	}

	public LinkedList<InventoryItem> getInventory()
	{
		return _inventory;		
	}
	
	public void showInventory()
	{
		System.out.println("\n\nYour inventory:");
		for(InventoryItem i : _inventory)
			System.out.println(i);
		System.out.println("\n\n");
	}
	
	public void pickUpItem(InventoryItem item)
	{
		System.out.println("You pick up " + item);
		_inventory.add(item);
	}
	
	public heroParty getParty()
	{
		return _heros;
	}
	
	public void showStats()
	{
		System.out.println(_heros);
		System.out.println("\nCurrent Score: " + calculateScore() + "\n");
	}
	public heroParty getHeroParty()
	{
		return _heros;
	}
	public int calculateScore()
	{
		int score = 0;
		
		for(InventoryItem i : _inventory)
			score += i.value();
		
		return score;
	}
}
