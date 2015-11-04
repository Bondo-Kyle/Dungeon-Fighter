
public class CommandHelp implements Command
{
	public void execute(Dungeon dungeon, Player player)
	{
		System.out.println("\n\nWelcome to Death Dungeon\n"
				+ "The goal of Death Dungeon is to get a high score by delving as deep into the dungeon as you possibly can.\n"
				+ "You will probably (always) meet your death, so gather as much treasure as possible while you're here!!\n"
				+ "\nValid commands:\n"
				+ "Parenthesized commands require ONLY the first letter.\n"
				+ "Interaction commands MUST be followed by the name of the object you wish to interact with.\n"
				+ "--------------------------------------------------\n"
				+ "MOVEMENT\tINTERACTION\t\tOTHER\n"
				+ "N(orth)\t\tGET <ITEM>\t\tI(nventory)\n"
				+ "E(ast)\t\tUSE <ITEM>\t\tC(haracter stats)\n"
				+ "S(outh)\t\tFIGHT <MONSTER>\t\tEXIT\n"
				+ "W(est)\t\t\t\t\tHELP\n"
				+ "D(own)\n");
	}
}
