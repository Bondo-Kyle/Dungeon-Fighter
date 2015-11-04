
public class CommandUseItem implements Command
{
	public void execute(Dungeon dungeon, Player player)
	{
		InventoryItem item = DungeonUtilities.pickItem(player.getInventory());
		if(item instanceof HugeHPpotion || item instanceof SmallHPpotion || item instanceof BigHPpotion || 
				item instanceof Weapon || item instanceof Armor)
		{
			Hero hero = DungeonUtilities.pickHero(player.getParty());
			item.use(hero);
		}
		else if (item instanceof Bomb)
		{
			item.use(dungeon);
		}
		else if( item == null)
			System.out.println("Invalid selection");
	}
}
