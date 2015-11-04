public abstract class Consumable extends GameItem implements InventoryItem{
	public abstract void use(Hero player);

	public abstract void use(Dungeon dungeon);
}
