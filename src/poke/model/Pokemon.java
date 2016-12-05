package poke.model;

public abstract class Pokemon
{
	private int healthPoints;
	private int attackPoints;
	private double speed;
	private int number;
	private String name;
	
	
	public Pokemon(String name, int number)
	{
		this.name = name;
		this.number = number;
	}

}
