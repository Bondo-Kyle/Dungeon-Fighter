import java.util.*;


public class heroParty 
{
	private ArrayList<Hero> _heros;
	private Scanner kb = new Scanner(System.in);
	
	public heroParty()
	{
		_heros = new ArrayList<Hero>();
		heroSelect();	
		System.out.println(toString());
	}
	public heroParty(ArrayList<Hero> _heros)
	{
		this._heros = _heros;
	}
	
	public void heroSelect()
	{
		int count = 0;
		int temp;
		
		do
		{
			System.out.println("Please select a Hero class");
			System.out.println("1\tWarrior");
			System.out.println("2\tMage");
			System.out.println("3\tRogue");
			System.out.println("4\tBloold Knight");
			System.out.println("5\tChuck Norris");
			System.out.print("User Choice --> ");
			temp = kb.nextInt();
			kb.nextLine();
			count++;
			
			
			if(temp == 1)
			{
				_heros.add(new Warrior());
				System.out.println("You successfully added a Warrior to your party.");
			}
			else if(temp == 2)
			{
				_heros.add(new Mage());
				System.out.println("You successfully added a Mage to your party.");

			}
			else if(temp == 3)
			{
				_heros.add(new Rogue());
				System.out.println("You successfully added a Rogue to your party.");

			}
			else if(temp == 4)
			{
				_heros.add(new BloodKnight());
				System.out.println("You successfully added a Blood Knight to your party.");

			}
			else if(temp == 5)
			{
				_heros.add(new ChuckNorris());
				System.out.println("Your group has been added to Chuck Norris.");

			}
			else
			{
				System.out.println("You have choosen an incorrect value, please try again.");
				count--;
			}
								
		}while(count<3);
		
		

	}

	public ArrayList<Hero> getHeroParty()
	{
		return _heros;
	}

	public Hero getHero(int choice) {
		return _heros.get(choice);
	}

	public int size() 
	{
		return _heros.size();
	}

	public void remove(int temp) 
	{
		this._heros.remove(temp);
		
	}
	
	public String toString()
	{
		String temp ="Your Hero Party:\n";
		int i = 0;
		
		while(i < _heros.size())
		{
			temp +="[" + i + "] "+_heros.get(i) +"\t"+_heros.get(i).getHealth()+" Health Remaining\n";
			i++;
		}
		System.out.println("\n");
		return temp;
	}
}
