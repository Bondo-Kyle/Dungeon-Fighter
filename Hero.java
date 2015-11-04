public abstract interface Hero
{
	public int attack();
	public int defend();
	public String getName();
	public int getHealth();
	public void setHealth(int n);
	public boolean isDead();
	public void setWeapon(Weapon _weapon);
	public void setArmor(Armor diamondArmor);




}