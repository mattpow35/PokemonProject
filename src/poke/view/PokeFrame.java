package poke.view;

import javax.swing.JFrame;
import poke.controller.PokeController;
import java.awt.Dimension;

public class PokeFrame extends JFrame
{
	private PokeController baseController;
	private PokePanel appPanel;
	
	
	public PokeFrame(PokeController baseController)
	{
		super();
		this.baseController = baseController;
		this.appPanel = new PokePanel(baseController);
		
		setupFrame();
	}
	 private void setupFrame()
	 {
		 this.setContentPane(appPanel);
		 this.setTitle("Pokemon");
		 this.setSize(new Dimension(900,500));
		 this.setVisible(true);
		 
	 }

}
