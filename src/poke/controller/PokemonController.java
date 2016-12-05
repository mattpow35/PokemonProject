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
		pokedex.add(new GeoDude("GeoDude"));
		pokedex.add(new Blastoise("Blastoise"));
	}
}
