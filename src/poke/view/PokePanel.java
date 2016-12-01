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
		baseLayout.putConstraint(SpringLayout.EAST, updateButton, -189, SpringLayout.EAST, this);
		this.pokedexSelector = new JComboBox(pokemon);
		baseLayout.putConstraint(SpringLayout.NORTH, pokedexSelector, 35, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, pokedexSelector, 65, SpringLayout.WEST, this);
		this.pokemonLabel = new JLabel("The current pokemon");
		baseLayout.putConstraint(SpringLayout.SOUTH, pokedexSelector, -468, SpringLayout.NORTH, pokemonLabel);
		baseLayout.putConstraint(SpringLayout.WEST, pokemonLabel, 97, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, pokemonLabel, -59, SpringLayout.SOUTH, this);
		this.healthLabel = new JLabel("HP:");
		this.combatLabel = new JLabel("CP:");
		baseLayout.putConstraint(SpringLayout.EAST, combatLabel, 0, SpringLayout.EAST, healthLabel);
		this.speedLabel = new JLabel("Speed:");
		baseLayout.putConstraint(SpringLayout.EAST, healthLabel, 0, SpringLayout.EAST, speedLabel);
		this.nameLabel = new JLabel("My Pokemons name:");
		this.numberLabel = new JLabel("Pokemon Number:");
		baseLayout.putConstraint(SpringLayout.EAST, speedLabel, 0, SpringLayout.EAST, numberLabel);
		this.advancedLabel = new JLabel("Advanced Information:");
		baseLayout.putConstraint(SpringLayout.WEST, advancedLabel, 0, SpringLayout.WEST, nameLabel);
		this.healthField = new JTextField(5);
		baseLayout.putConstraint(SpringLayout.NORTH, healthLabel, 6, SpringLayout.NORTH, healthField);
		baseLayout.putConstraint(SpringLayout.EAST, healthField, -272, SpringLayout.EAST, this);
		this.combatField = new JTextField(5);
		baseLayout.putConstraint(SpringLayout.NORTH, combatLabel, 6, SpringLayout.NORTH, combatField);
		baseLayout.putConstraint(SpringLayout.NORTH, combatField, 6, SpringLayout.SOUTH, healthField);
		baseLayout.putConstraint(SpringLayout.EAST, combatField, 0, SpringLayout.EAST, healthField);
		this.speedField = new JTextField(5);
		baseLayout.putConstraint(SpringLayout.NORTH, speedLabel, 6, SpringLayout.NORTH, speedField);
		baseLayout.putConstraint(SpringLayout.NORTH, speedField, 6, SpringLayout.SOUTH, combatField);
		baseLayout.putConstraint(SpringLayout.EAST, speedField, 0, SpringLayout.EAST, healthField);
		this.advancedArea = new JTextArea(10,25);
		baseLayout.putConstraint(SpringLayout.SOUTH, advancedLabel, -6, SpringLayout.NORTH, advancedArea);
		baseLayout.putConstraint(SpringLayout.WEST, nameLabel, 0, SpringLayout.WEST, advancedArea);
		baseLayout.putConstraint(SpringLayout.WEST, advancedArea, 374, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, updateButton, 7, SpringLayout.SOUTH, advancedArea);
		baseLayout.putConstraint(SpringLayout.SOUTH, advancedArea, -46, SpringLayout.SOUTH, this);
		this.nameField = new JTextField(20);
		baseLayout.putConstraint(SpringLayout.SOUTH, nameLabel, -6, SpringLayout.NORTH, nameField);
		baseLayout.putConstraint(SpringLayout.EAST, pokedexSelector, -142, SpringLayout.WEST, nameField);
		baseLayout.putConstraint(SpringLayout.NORTH, nameField, 42, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, nameField, 0, SpringLayout.WEST, advancedArea);
		this.numberField = new JTextField(5);
		baseLayout.putConstraint(SpringLayout.NORTH, numberLabel, 6, SpringLayout.NORTH, numberField);
		baseLayout.putConstraint(SpringLayout.EAST, numberLabel, -6, SpringLayout.WEST, numberField);
		baseLayout.putConstraint(SpringLayout.EAST, numberField, -272, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, healthField, 6, SpringLayout.SOUTH, numberField);
		baseLayout.putConstraint(SpringLayout.NORTH, numberField, 6, SpringLayout.SOUTH, nameField);
		
		
		
		
		
		
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setPreferredSize(new Dimension(900, 500));
		numberField.setEditable(false);
		advancedArea.setEditable(false);
		this.add(updateButton);
		this.add(pokedexSelector);
		this.add(pokemonLabel);
		this.add(healthLabel);
		this.add(combatLabel);
		this.add(speedLabel);
		this.add(nameLabel);
		this.add(numberLabel);
		this.add(advancedLabel);
		this.add(healthField);
		this.add(combatField);
		this.add(speedField);
		this.add(advancedArea);
		this.add(nameField);
		this.add(numberField);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
	

}
