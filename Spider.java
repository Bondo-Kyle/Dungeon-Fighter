 import java.util.Random;


public class Spider implements Monster
{
	
	private String _name;
	private int _health;
	private int _armor;
	private int _damage;

	
	public Spider()
	{
		_name = "Spider";
		_damage =25;
		_armor = 0;
		_health = 20;

	}
	@Override
	public int attack() 
	{
		int temp;
		Random r = new Random();
		temp = r.nextInt(_damage/3);
		return _damage + temp;
	}
	public void setLevel(int _roomDepth)
	{
		this._damage += Math.floor(_roomDepth / 3);
		this._health += Math.floor(_roomDepth / 2)*7;
	}
	@Override
	public int defend() {
		return _armor;
	}
	
	 @Override
	public int getHealth()
	{
		return _health;
	}
	public String getName()
	{
		return _name;
	}
	@Override
	public void setHealthDmg(int damage) 
	{
		_health -= damage;
		
	}

}
