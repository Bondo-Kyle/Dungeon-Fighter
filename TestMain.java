import java.util.Scanner;

public class TestMain {

	public static void main(String[] args)
	{
		Dungeon testMe = new Dungeon();
		Player testPlayer = new Player("Tester");
		
		Scanner kb = new Scanner(System.in);
		Command playerInput = null;
		
		while(testPlayer.playing())
		{
			testMe.showDoors();
			System.out.print("<Player choice>? ");
			playerInput = commandInput(kb);
			playerInput.execute(testMe, testPlayer);
		}
	}

	public static Command commandInput(Scanner kb)
	{
		String input = kb.nextLine();
		return CommandParser.parseCommand(input);
	}
}
