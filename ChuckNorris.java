import java.util.Random;


public class ChuckNorris implements Hero
{
	


	private int _health;
	private Armor _armor;
	private int _damage;
	private String _name;
	private boolean _isDead;
	private Weapon _weapon;
	
	public ChuckNorris()
	{
		_weapon =  new RoundHouse();
		_health = 50;
		_armor = new Beard();
		_damage = 40000;
		//_damage += _weapon.getDmg();
		_name = "Chuck Norris";
		_isDead = false;
	}


	@Override
	public int attack() 
	{
		Random r = new Random();
		int temp = r.nextInt(_weapon.getDmg());
		return _damage + temp;
	}

	public void setWeapon(Weapon _weapon)
	{
		this._weapon = _weapon;
	}
	@Override
	public int defend() 
	{
		return 0;
	}

	
	public int getHealth() 
	{
		return _health;
	}


	public void setHealth(int _health) {
		this._health -= _health;
	}


	public int get_damage() {
		return _damage;
	}


	public void set_damage(int _damage) {
		this._damage = _damage;
	}


	public String get_name() {
		return _name;
	}


	public void set_name(String _name) {
		this._name = _name;
	}


	@Override
	public String getName() {
		return _name;
	}
	
	public boolean isDead()
	{
		if(_health <= 0)
			_isDead = true;
		return _isDead;
	}


	@Override
	public void setArmor(Armor leatherArmor) 
	{
		this._armor = leatherArmor;
	}
	public String toString()
	{	
		return this._name + " attacking with "+ this._weapon + " wearing " + this._armor;
	}


}
