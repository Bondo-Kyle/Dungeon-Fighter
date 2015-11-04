public class CommandMoveEast implements Command
{
	public void execute(Dungeon dungeon, Player player)
	{
		dungeon.moveEast();
	}
}
