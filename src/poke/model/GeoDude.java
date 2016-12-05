package poke.model;

public class GeoDude extends Pokemon implements Rock
{
	public GeoDude()
	{
		super("GeoDude", 25);
	}
	
	public GeoDude(String name)
	{
		super(name, 25);
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
