
public class CommandShowInventory implements Command
{
	public void execute(Dungeon dungeon, Player player)
	{
		player.showInventory();
	}
}
