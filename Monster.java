
public interface Monster
{

	public abstract int attack();
	public abstract int defend();
	public abstract String getName();
	public abstract void setHealthDmg(int damage);
	public abstract int getHealth();
	public abstract void setLevel(int _roomDepth);
}
