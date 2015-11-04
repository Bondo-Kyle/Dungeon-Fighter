import java.util.*;



public class BattleMediator implements IMediator
{




	private heroParty _heros;
	private monsterParty _monsters;


	public BattleMediator(heroParty _heros, monsterParty _monsters)
	{
		this._heros = _heros;
		this._monsters = _monsters;
	}

	public BattleMediator() 
	{
		// TODO Auto-generated constructor stub
	}

	//Heros are attacking first
	public monsterParty battle(heroParty _heros, monsterParty _monsters)
	{

		//printBattle();

		int i = 0;
		int _turns = _heros.size();
		int choice = 0;
		Scanner kb = new Scanner(System.in);
		do
		{

			Hero _attacker = _heros.getHero(i);
			Monster _defender;
			do
			{
			System.out.println("You have "+ _turns+" attacks left this turn.");
			System.out.println("You are attacking with your "+ _attacker.getName() + ".\nPlease choose a monster to attack.");
			System.out.print("Choice--> ");
			choice = kb.nextInt();
			kb.nextLine();

			if(choice >= _monsters.size())
			{
				System.out.println("\nInvalid Monster Selection! Please try again!\n");
				printBattle();
			}
			}while(choice >= _monsters.size());
			_defender = _monsters.getMonster(choice);

			//	printMonsterHealth(i);




			int damage = _attacker.attack();
			if(_defender.getHealth() - _attacker.attack() < 1)
			{
				_monsters.remove(choice);
				_monsters.getMonsterParty().trimToSize();
				System.out.println("YOU KILLED THE MONSTER!");
			}
			else
			{
				_defender.setHealthDmg(damage);
				System.out.println("\n" + _attacker.getName() + " hits the " + " for "+ _attacker.attack() +" damage!!!");

			}

			_turns--;
			i++;
			printBattle();
		}while(_turns > 0 && _monsters.size() > 0);
		//	kb.close();
		return _monsters;
	}

	// Monsters are attacking first.
	public heroParty battle(monsterParty _monsters, heroParty _heros)
	{


		int _turns = _monsters.size();
		int heroSize = _heros.size();
		int i = 0;

		do
		{
			
			Monster _attacker = _monsters.getMonster(i);

			Random r = new Random();

			int temp = r.nextInt(heroSize);
			
			Hero _defender = _heros.getHero(temp);
			int aDmg = _attacker.attack();
			System.out.println(_attacker.getName() + " hits your " + _defender.getName() + " for " + aDmg + " damage!!\n");
			_defender.setHealth(aDmg);

			if(_defender.isDead())
			{
				System.out.println(_attacker.getName() +" has killed your " +_defender.getName());
				_heros.remove(temp);
				_heros.getHeroParty().trimToSize();

			}
			
			
			if(_heros.size() == 0)
			{
				System.out.println("You have lost the game ahha");
				System.exit(0);
			}
			_turns--;
			i++;
			
			
		}while(_turns > 0);
		return _heros;


	}

	public void printBattle()
	{

		int i = 0;
		while(i < _heros.size())
		{
			System.out.println("["+i+"] "+_heros.getHero(i).getName() +"\t"+_heros.getHero(i).getHealth()+" Health Remaining");
			i++;
		}
		System.out.println("\n");


		i = 0;
		System.out.println("You battle the enemies: ");

		while(i < _monsters.size())
		{
			System.out.println("["+i+"] "+ _monsters.getMonster(i).getName()+"\t"+ _monsters.getMonster(i).getHealth()+" Health Remaining");
			i++;
		}
		System.out.println("\n");
	}



}

