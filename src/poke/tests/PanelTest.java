package poke.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import poke.tests.controller.PokemonController;
import poke.tests.view.PokemonPanel;


public class PanelTest
{
	private PokemonPanel testedPanel;
	
	@Before
	public void setUp() throws Exception
	{
		testedPanel = new PokemonPanel(new PokemonController());
	}

	@After
	public void tearDown() throws Exception
	{
		testedPanel = null;
	}

	@Test
	public void testPokemonPanel()
	{
		
	}
	
	@Test
	public void testSetupListeners()
	{
		
	}
	
	@Test
	public void testSetupPanel()
	{
		
	}

}