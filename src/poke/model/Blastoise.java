package poke.model;

public class Blastoise extends Pokemon implements Water
{
	public Blastoise()
	{
		super("Blastoise", 9);
	}
	
	public Blastoise(String name)
	{
		super(name, 9);
	}
	
	public int shootWater()
	{
		return 20;
	}
	
	public int bubbleAttack()
	{
		return 30;
	}

}
