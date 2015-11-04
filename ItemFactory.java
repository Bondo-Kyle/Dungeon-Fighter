import java.util.Random;


public class ItemFactory
{
	public static GameItem generateItem(int _roomDepth) 
	{
		return DungeonUtilities.rollForItem(_roomDepth);
	}

	public static GameItem generateTreasure()
	{
		return new TreasureItem();
	}

	public static GameItem generateBomb()
	{
		return new Bomb();
	}
	
	public static GameItem generateEquipment()
	{
		Random r = new Random();
		double d = r.nextDouble();
		if(d < .5){
			if(d < .25)
				return new Staff();
			if(d < .35)
				return new TwoHandedSword();
			if(d < .5)
				return new WarHammer();
			return new LongSword();
		}else {
			if(d < .75)
				return new BronzeArmor();
			if(d < .85)
				return new IronArmor();
			if(d < 1)
				return new DiamondArmor();
			return new LeatherArmor();
		}
	}
	
	public static GameItem generatePotion()
	{
		Random r = new Random();
		double d = r.nextDouble();
		if(d < .1)
			return new HugeHPpotion();
		if(d < .6)
			return new BigHPpotion();
		return new SmallHPpotion();
	}

	public static DungeonMonster generateMonster(int _roomDepth)
	{
		return MonsterFactory.generateMonster(_roomDepth);
	}

	public static GameItem generateBlank()
	{
		return new EmptyRoomAddition();
	}
}
