public class CommandGetItem implements Command
{
	public void execute(Dungeon dungeon, Player player)
	{
		GameItem i = dungeon.getPosition().getAddition();
		if(i instanceof InventoryItem)
		{
			player.pickUpItem((InventoryItem) i);
			dungeon.getPosition().removeAddition();
		}
		else
			System.out.println("You can't pick that up");
	}
}
