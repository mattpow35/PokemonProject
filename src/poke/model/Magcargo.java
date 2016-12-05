package poke.model;

public class Magcargo extends Pokemon implements Fire, Rock
{
	public Magcargo()
	{
		super("Magcargo", 219);
	}
	
	public Magcargo(String name)
	{
		super(name, 219);
	}
	
	public int blastFire()
	{
		return 15;
	}
	
	public int flareBlitz()
	{
		return 20;
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
