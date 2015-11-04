public class CommandMoveNorth implements Command
{
	public void execute(Dungeon dungeon, Player player)
	{
		dungeon.moveNorth();
	}
}
