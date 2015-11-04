public class CommandMoveSouth  implements Command
{
	public void execute(Dungeon dungeon, Player player)
	{
		dungeon.moveSouth();
	}
}
