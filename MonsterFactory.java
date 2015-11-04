
public class MonsterFactory
{
	public static DungeonMonster generateMonster(int depth)
	{
		return new DungeonMonster(depth);
	}
}
