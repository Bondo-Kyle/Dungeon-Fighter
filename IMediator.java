

public interface IMediator 
{
	public monsterParty battle(heroParty _heros, monsterParty _monsters);
	public heroParty battle(monsterParty _monsters, heroParty _heros);
	public void printBattle();
	
}
