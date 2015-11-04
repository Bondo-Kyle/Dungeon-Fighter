
public class CommandInvalid implements Command 
{
	public void execute(Dungeon dungeon, Player player) 
	{
		System.out.println("Invalid Command. Type HELP for a list of valid commands.");
	}
}
