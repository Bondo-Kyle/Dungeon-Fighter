
public class CommandShowCharacter implements Command
{
	public void execute(Dungeon dungeon, Player player)
	{
		player.showStats();
	}
}
