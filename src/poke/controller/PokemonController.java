package poke.controller;

import poke.model.*;
import poke.view.PokemonFrame;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PokemonController
{
	private ArrayList<Pokemon> pokedex;
	private PokemonFrame baseFrame;
	
	public PokemonController()
	{
		pokedex = new ArrayList<Pokemon>();
		buildPokedex();
		
		baseFrame = new PokemonFrame(this);
	}
	
	
	public void start()
	{
		JOptionPane.showMessageDialog(baseFrame, "Welcome pokemon lover, to Pokemon Inheritence");
	}
	
	private void buildPokedex()
	{
		pokedex.add(new GeoDude("Geodude"));
		pokedex.add(new Blastoise("Blastoise"));
		pokedex.add(new Magcargo("Magcargo"));
		pokedex.add(new Bulbasaur("Bulbasaur"));
		pokedex.add(new Charizard("Charizard"));
		pokedex.add(new Blastoise("Mega Blastoise"));
	}
	
	public void updateSelected(int index, String name, int combat, int health, double speed)
	{
		Pokemon current = pokedex.get(index);
		current.setName(name);
		current.setAttackPoints(combat);
		current.setSpeed(speed);
		current.setHealthPoints(health);
	}


	public ArrayList<Pokemon> getPokedex() 
	{
		
		return pokedex;
	}


	public void setPokedex(ArrayList<Pokemon> pokedex) 
	{
		this.pokedex = pokedex;
	}


	public PokemonFrame getBaseFrame() 
	{
		return baseFrame;
	}


	public void setBaseFrame(PokemonFrame baseFrame) 
	{
		this.baseFrame = baseFrame;
	}
	
	public String[] getPokedexNames()
	{
		String[] names = new String [pokedex.size()];
		
		for (int index = 0; index < pokedex.size(); index ++)
		{
			names[index] = pokedex.get(index).getName();
		}
		
		return names;
	}
}
