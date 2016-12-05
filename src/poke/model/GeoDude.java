package poke.model;

public class GeoDude extends Pokemon implements Rock
{
	public GeoDude()
	{
		super("GeoDude", 74);
	}
	
	public GeoDude(String name)
	{
		super(name, 74);
	}
	
	public int rockThrow()
	{
		return 5;
	}
	
	public int rockTomb()
	{
		return 10;
	}

}
