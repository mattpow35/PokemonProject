package poke.view;

import java.awt.Color;
import poke.controller.PokeController;
import javax.swing.*;
import java.awt.Dimension;

public class PokePanel extends JPanel
{
	private PokeController baseController;
	private ImageIcon pokemonIcon;
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
	
	public PokePanel(PokeController baseController)
	{
		super();
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		this.pokemonIcon = new ImageIcon(getClass().getResource("/poke/view/images/pokeBall.png"));
		this.updateButton = new JButton("update");
		this.pokedexSelector = new JComboBox(new String [] {"GeoDude", "Bulbasaur", "magcargo", "Blastoise", "Charizard"});
		this.pokemonLabel = new JLabel("The current pokemon", pokemonIcon, SwingConstants.CENTER);
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
		this.numberField = new JTextField(5);
		
		
		
		
		
		
		
		
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
		baseLayout.putConstraint(SpringLayout.EAST, updateButton, -189, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, numberLabel, 6, SpringLayout.NORTH, numberField);
		baseLayout.putConstraint(SpringLayout.EAST, numberLabel, -6, SpringLayout.WEST, numberField);
		baseLayout.putConstraint(SpringLayout.EAST, numberField, -272, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, healthField, 6, SpringLayout.SOUTH, numberField);
		baseLayout.putConstraint(SpringLayout.NORTH, numberField, 6, SpringLayout.SOUTH, nameField);
		baseLayout.putConstraint(SpringLayout.SOUTH, nameLabel, -6, SpringLayout.NORTH, nameField);
		baseLayout.putConstraint(SpringLayout.NORTH, nameField, 42, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, nameField, 0, SpringLayout.WEST, advancedArea);
		baseLayout.putConstraint(SpringLayout.SOUTH, advancedLabel, -6, SpringLayout.NORTH, advancedArea);
		baseLayout.putConstraint(SpringLayout.WEST, nameLabel, 0, SpringLayout.WEST, advancedArea);
		baseLayout.putConstraint(SpringLayout.WEST, advancedArea, 374, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, updateButton, 7, SpringLayout.SOUTH, advancedArea);
		baseLayout.putConstraint(SpringLayout.SOUTH, advancedArea, -46, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, speedLabel, 6, SpringLayout.NORTH, speedField);
		baseLayout.putConstraint(SpringLayout.NORTH, speedField, 6, SpringLayout.SOUTH, combatField);
		baseLayout.putConstraint(SpringLayout.EAST, speedField, 0, SpringLayout.EAST, healthField);
		baseLayout.putConstraint(SpringLayout.NORTH, combatLabel, 6, SpringLayout.NORTH, combatField);
		baseLayout.putConstraint(SpringLayout.NORTH, combatField, 6, SpringLayout.SOUTH, healthField);
		baseLayout.putConstraint(SpringLayout.EAST, combatField, 0, SpringLayout.EAST, healthField);
		baseLayout.putConstraint(SpringLayout.NORTH, healthLabel, 6, SpringLayout.NORTH, healthField);
		baseLayout.putConstraint(SpringLayout.EAST, healthField, -272, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, advancedLabel, 0, SpringLayout.WEST, nameLabel);
		baseLayout.putConstraint(SpringLayout.EAST, speedLabel, 0, SpringLayout.EAST, numberLabel);
		baseLayout.putConstraint(SpringLayout.EAST, combatLabel, 0, SpringLayout.EAST, healthLabel);
		baseLayout.putConstraint(SpringLayout.EAST, healthLabel, 0, SpringLayout.EAST, speedLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, pokedexSelector, 2, SpringLayout.NORTH, nameField);
		baseLayout.putConstraint(SpringLayout.EAST, pokedexSelector, -104, SpringLayout.WEST, nameField);
		baseLayout.putConstraint(SpringLayout.WEST, pokedexSelector, 38, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, pokemonLabel, 0, SpringLayout.WEST, pokedexSelector);
		baseLayout.putConstraint(SpringLayout.EAST, pokemonLabel, 326, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, pokemonLabel, -53, SpringLayout.NORTH, advancedLabel);
		
		
	}
	
	private void setupListeners()
	{
		
		
	}
	
	private void changeColorBasedOnData(String data)
	{
		
	}

}
