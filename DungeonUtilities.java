import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class DungeonUtilities 
{
	private static final double _EXIT_CHANCE = .5;

	private static final double _MONSTER_CHANCE = .8;	
	private static final double _POTION_CHANCE = .3;
	private static final double _EQUIPMENT_CHANCE = .5;
	private static final double _BOMB_CHANCE = .1;
	private static final double _TREASURE_CHANCE = .05;
	

	public static GameItem rollForItem(int _roomDepth)
	{
		Random additionRoll = new Random();
		double type = additionRoll.nextDouble();

		GameItem addition;

		if(type < _TREASURE_CHANCE)
			addition = ItemFactory.generateTreasure();
		else if(type < _BOMB_CHANCE)
			addition = ItemFactory.generateBomb();
		else if(type < _POTION_CHANCE)
			addition = ItemFactory.generatePotion();
		else if(type < _EQUIPMENT_CHANCE)
			addition = ItemFactory.generateEquipment();
		else if(type < _MONSTER_CHANCE)
			addition = ItemFactory.generateMonster(_roomDepth);
		else
			addition = ItemFactory.generateBlank();

		return addition;
	}

	public static boolean rollForExit() 
	{
		Random exitRoll = new Random();

		if(exitRoll.nextDouble() < _EXIT_CHANCE)
			return true;

		return false;
	}

	public static InventoryItem pickItem(LinkedList<InventoryItem> items)
	{
		System.out.println("Which item would you like to use?");

		InventoryItem temp = null;
		boolean used = false;

		Scanner kb = new Scanner(System.in);
		String choice = kb.nextLine();

		for(InventoryItem i : items)
			if(i.toString().equalsIgnoreCase(choice))
			{
				temp =  i;
				used = true;
			}

		if(used)
			items.remove(temp);
		else
			System.out.println("Item not found");

		return temp;
	}

	public static Hero pickHero(heroParty party)
	{
		int temp;
		Scanner kb = new Scanner(System.in);
		do
		{
			System.out.println("Choose which hero to apply potion to:\n"+party);
			temp = kb.nextInt();
			if(temp > party.size() || temp < 0)
				System.out.println("You have chosen an incorrect hero. Please try again\n\n");
		}while(temp > party.size() || temp < 0);
		kb.nextLine();
		return party.getHero(temp);

	}
}
