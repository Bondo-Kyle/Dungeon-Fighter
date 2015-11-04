public interface InventoryItem
{
	public int value();
	public void name();
	public void use(Hero hero);
	public void use(Dungeon dungeon);
}
