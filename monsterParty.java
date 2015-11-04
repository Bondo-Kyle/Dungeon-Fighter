import java.util.*;

public class monsterParty 
{

	private ArrayList<Monster> _monsters;

	public monsterParty(int _roomDepth)
	{
		_monsters = new ArrayList<Monster>();


		Random r = new Random();
		double d;

		for(int i = 0; i < 3; i++)
		{
			d = r.nextDouble();
			if(d < .1)
				_monsters.add(new DeathWing());
			else if(d < .25)
				_monsters.add(new Stu());
			else if(d < .49)
				_monsters.add(new Ogre());
			else if(d < .5)
				_monsters.add(new Spider());
			else
				_monsters.add(new Goblin());
		}
		
		
		for(Monster m : _monsters)
		{
			m.setLevel(_roomDepth);
		}

	}

	public String toString()
	{
		String temp = "";
		for(int i = 0; i < _monsters.size(); i++)
		{
			temp += _monsters.get(i).getName() + "\n";
		}
		return temp;
	}
	public ArrayList<Monster> getMonsterParty()
	{
		return _monsters;
	}

	public void remove(int choice) 
	{
		_monsters.remove(choice);
	}

	public Monster getMonster(int choice) 
	{
		return _monsters.get(choice);
	}

	public int size() 
	{
		return _monsters.size();
	}



}
