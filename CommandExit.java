public class CommandExit implements Command
{
	public void execute(Dungeon dungeon, Player player)
	{
		System.out.println("You realize there's only one way out...");
		player.togglePlaying();
	}
}
