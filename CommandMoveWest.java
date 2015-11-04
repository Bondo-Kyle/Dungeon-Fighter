public class CommandMoveWest implements Command
{
	public void execute(Dungeon dungeon, Player player)
	{
		dungeon.moveWest();
	}
}
