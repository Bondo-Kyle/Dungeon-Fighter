 import java.util.Random;


public class DeathWing implements Monster
{
	
	private String _name;
	private int _health;
	private int _armor;
	private int _damage;

	
	public DeathWing()
	{
		_name = "Death Wing";
		_damage =70;
		_armor = 0;
		_health = 101;

	}
	public void setLevel(int _roomDepth)
	{
		this._damage += _roomDepth*2;
		this._health += Math.floor(_roomDepth / 2)*10;
	}
	@Override
	public int attack() 
	{
		int temp;
		Random r = new Random();
		temp = r.nextInt(_damage/3);
		return _damage + temp;
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
