package poke.view;

import java.awt.Color;
import poke.controller.PokeController;
import javax.swing.*;
import java.awt.Dimension;

public class PokePanel extends JPanel
{
	private PokeController baseController;
	private SpringLayout baseLayout;
	private JButton updateButton;
	private JComboBox pokedexSelector;
	private JLabel pokemonLabel;
	private JLabel healthLabel;
	private JLabel combatLabel;
	private JLabel speedLabel;
	private JLabel nameLabel;
	private JLabel numberLabel;
	private JLabel advancedLabel;
	private JTextField healthField;
	private JTextField combatField;
	private JTextField speedField;
	private JTextField nameField;
	private JTextField numberField;
	private JTextArea advancedArea;
	private String GeoDude;
	private String Bulbasaur;
	private String magcargo;
	private String Blastoise;
	private String Charizard;
	private String [] pokemon = {GeoDude, Bulbasaur, magcargo, Blastoise, Charizard};
	
	public PokePanel(PokeController baseController)
	{
		super();
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		this.updateButton = new JButton("update");
		this.pokedexSelector = new JComboBox(pokemon);
		this.pokemonLabel = new JLabel("The current pokemon");
		this.healthLabel = new JLabel("HP:");
		this.combatLabel = new JLabel("CP:");
		this.speedLabel = new JLabel("Speed:");
		this.nameLabel = new JLabel("My Pokemons name:");
		this.numberLabel = new JLabel("Pokemon Number:");
		this.advancedLabel = new JLabel("Advanced Information:");
		this.healthField = new JTextField(5);
		this.combatField = new JTextField(5);
		this.speedField = new JTextField(5);
		this.advancedArea = new JTextArea(10,25);
		this.nameField = new JTextField(20);
		this.
		
		
		
		
		
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setPreferredSize(new Dimension(900, 500));
		
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
	

}
