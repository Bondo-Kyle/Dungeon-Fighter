public class CommandParser
{
	public static Command parseCommand(String userInput)
	{
		Command temp = null;
		
		if (userInput.equalsIgnoreCase("n"))
			temp = new CommandMoveNorth();
		else if (userInput.equalsIgnoreCase("e"))
			temp = new CommandMoveEast();
		else if (userInput.equalsIgnoreCase("s"))
			temp = new CommandMoveSouth();
		else if (userInput.equalsIgnoreCase("w"))
			temp = new CommandMoveWest();
		else if (userInput.equalsIgnoreCase("d"))
			temp = new CommandMoveDown();
		else if (userInput.equalsIgnoreCase("exit"))
			temp = new CommandExit();
		else if (userInput.equalsIgnoreCase("get"))
			temp = new CommandGetItem();
		else if (userInput.equalsIgnoreCase("use"))
			temp = new CommandUseItem();
		else if (userInput.equalsIgnoreCase("i"))
			temp = new CommandShowInventory();
		else if (userInput.equalsIgnoreCase("c"))
			temp = new CommandShowCharacter();
		else if (userInput.equalsIgnoreCase("fight"))
			temp = new CommandFight();
		else if (userInput.equalsIgnoreCase("help"))
			temp = new CommandHelp();

		else
			temp = new CommandInvalid();
		
		return temp;
	}
}
