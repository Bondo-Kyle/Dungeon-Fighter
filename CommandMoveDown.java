public class CommandMoveDown implements Command
{
	public void execute(Dungeon dungeon, Player player)
	{
		dungeon.moveDown();
	}
}
