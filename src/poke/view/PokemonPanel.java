package poke.view;

import java.awt.Color;
import poke.controller.PokemonController;
import javax.swing.*;
import java.awt.Dimension;
import java.awt.event.*;

public class PokemonPanel extends JPanel
{
	private PokemonController baseController;
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
	
	public PokemonPanel(PokemonController baseController)
	{
		super();
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		this.pokemonIcon = new ImageIcon(getClass().getResource("/poke/view/images/pokeBall.jpg"));
		this.updateButton = new JButton("update");
		this.pokedexSelector = new JComboBox(baseController.getPokedexNames());
		this.pokemonLabel = new JLabel("The current pokemon", new ImageIcon(PokemonPanel.class.getResource("/poke/view/images/pokeBall.jpg")), SwingConstants.CENTER);
		pokemonLabel.setVerticalAlignment(SwingConstants.BOTTOM);
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
		pokemonLabel.setVerticalTextPosition(JLabel.BOTTOM);
		pokemonLabel.setHorizontalTextPosition(JLabel.CENTER);
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
		baseLayout.putConstraint(SpringLayout.NORTH, pokedexSelector, 44, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, pokedexSelector, 38, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, numberField, -394, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, numberLabel, 5, SpringLayout.NORTH, numberField);
		baseLayout.putConstraint(SpringLayout.NORTH, healthField, 11, SpringLayout.SOUTH, numberField);
		baseLayout.putConstraint(SpringLayout.EAST, numberField, 0, SpringLayout.EAST, advancedArea);
		baseLayout.putConstraint(SpringLayout.WEST, nameLabel, 0, SpringLayout.WEST, nameField);
		baseLayout.putConstraint(SpringLayout.SOUTH, nameLabel, -5, SpringLayout.NORTH, nameField);
		baseLayout.putConstraint(SpringLayout.EAST, pokedexSelector, -262, SpringLayout.WEST, nameField);
		baseLayout.putConstraint(SpringLayout.NORTH, nameField, -1, SpringLayout.NORTH, pokedexSelector);
		baseLayout.putConstraint(SpringLayout.EAST, nameField, 0, SpringLayout.EAST, healthField);
		baseLayout.putConstraint(SpringLayout.NORTH, updateButton, 6, SpringLayout.SOUTH, advancedArea);
		baseLayout.putConstraint(SpringLayout.EAST, healthField, 0, SpringLayout.EAST, advancedArea);
		baseLayout.putConstraint(SpringLayout.NORTH, advancedArea, 12, SpringLayout.SOUTH, advancedLabel);
		baseLayout.putConstraint(SpringLayout.WEST, advancedArea, 482, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, speedLabel, 5, SpringLayout.NORTH, speedField);
		baseLayout.putConstraint(SpringLayout.EAST, speedLabel, -6, SpringLayout.WEST, speedField);
		baseLayout.putConstraint(SpringLayout.NORTH, speedField, 7, SpringLayout.SOUTH, combatField);
		baseLayout.putConstraint(SpringLayout.EAST, speedField, 0, SpringLayout.EAST, healthField);
		baseLayout.putConstraint(SpringLayout.NORTH, combatLabel, 5, SpringLayout.NORTH, combatField);
		baseLayout.putConstraint(SpringLayout.NORTH, combatField, 11, SpringLayout.SOUTH, healthField);
		baseLayout.putConstraint(SpringLayout.EAST, combatField, 0, SpringLayout.EAST, healthField);
		baseLayout.putConstraint(SpringLayout.EAST, updateButton, 0, SpringLayout.EAST, healthField);
		baseLayout.putConstraint(SpringLayout.NORTH, healthLabel, 5, SpringLayout.NORTH, healthField);
		baseLayout.putConstraint(SpringLayout.NORTH, advancedLabel, 0, SpringLayout.NORTH, pokemonLabel);
		baseLayout.putConstraint(SpringLayout.WEST, advancedLabel, 156, SpringLayout.EAST, pokemonLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, pokemonLabel, 148, SpringLayout.SOUTH, pokedexSelector);
		baseLayout.putConstraint(SpringLayout.WEST, pokemonLabel, 0, SpringLayout.WEST, pokedexSelector);
		baseLayout.putConstraint(SpringLayout.EAST, pokemonLabel, 326, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, numberLabel, 0, SpringLayout.EAST, healthLabel);
		baseLayout.putConstraint(SpringLayout.WEST, healthLabel, 0, SpringLayout.WEST, combatLabel);
		baseLayout.putConstraint(SpringLayout.EAST, combatLabel, 0, SpringLayout.EAST, speedLabel);
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	private void setupListeners()
	{
		pokedexSelector.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent selection)
			{
				int selected = pokedexSelector.getSelectedIndex();
				nameField.setText(baseController.getPokedex().get(selected).getName());
				numberField.setText(baseController.getPokedex().get(selected).getNumber() + "");
				combatField.setText(baseController.getPokedex().get(selected).getAttackPoints() + "");
				speedField.setText(baseController.getPokedex().get(selected).getSpeed() + "");
				healthField.setText(baseController.getPokedex().get(selected).getPokemonInformation() 
						+ "\n" + baseController.getPokedex().get(selected).getPokemonTypes());
				changeColorBasedOnData(baseController.getPokedex().get(selected).getPokemonTypes());
				changeImageDisplay(baseController.getPokedex().get(selected).getClass().getSimpleName());
			}
		});
		
		
		
		
		
		this.addMouseListener(new MouseListener()
		{
			public void mouseEntered(MouseEvent entered)
			{
//				JOptionPane.showMessageDialog(baseController.getBaseFrame(), "The mouse is in!");
			}
			
			public void mouseExited(MouseEvent exited)
			{
//				JOptionPane.showMessageDialog(baseController.getBaseFrame(), "The mouse is out!");
			}
			
			public void mousePressed(MouseEvent pressed)
			{
//				JOptionPane.showMessageDialog(baseController.getBaseFrame(), "The mouse was pressed!");
			}
			
			public void mouseReleased(MouseEvent released)
			{
//				JOptionPane.showMessageDialog(baseController.getBaseFrame(), "The mouse was released!");
			}
			
			public void mouseClicked(MouseEvent click)
			{
//				JOptionPane.showMessageDialog(baseController.getBaseFrame(), "The mouse was clicked!");
			}
		
		});
		
		this.addMouseMotionListener(new MouseMotionListener()
		{
			public void mouseDragged(MouseEvent dragged)
			{
				setRandomColor();
		
			}
			
			public void mouseMoved(MouseEvent moved)
			{

			}
			
		});
		
	}
	
	private void setRandomColor()
	{
		int red, green, blue;
		red = (int) (Math.random() * 256);
		green = (int) (Math.random() * 256);
		blue = (int) (Math.random() * 256);
		
		this.setBackground(new Color(red, green, blue));
		
		
		
	}
	
	private void changeColorBasedOnData(String data)
	{
		if (data.contains("Grass"))
		{
			this.setBackground(Color.GREEN);
		}
		else if (data.contains("Fire"))
		{
			this.setBackground(Color.RED);
		}
		else if (data.contains("Rock"))
		{
			this.setBackground(Color.GRAY);
		}
		else if (data.contains("Water"))
		{
			this.setBackground(Color.BLUE);
		}
		
		repaint();
	}
	
	private void changeImageDisplay(String name)
	{
		String path = "/poke/view/images/";
		String defaultName = "Blastoise";
		String extension = ".jpg";

		
		try
		{
			pokemonIcon = new ImageIcon(getClass().getResource(path + name + extension));
			
		}
		catch (NullPointerException missingFile)
		{
			pokemonIcon = new ImageIcon(getClass().getResource(path + defaultName + extension));
		}
		pokemonLabel.setIcon(pokemonIcon);
		repaint();
		
		
		
		
	}
}
