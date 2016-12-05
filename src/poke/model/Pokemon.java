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
	
	public String getPokemonTypes()
	{
		String pokemonTypes = "This Pokemon has the following tuypes:\n";
		Class<?> [] types = getClass().getInterfaces();
		String [] pokeTypes = new String[types.length];
		for(int index = 0; index < types.length; index++)
		{
			
		}
		
		
		return pokemonTypes;
	}

}
