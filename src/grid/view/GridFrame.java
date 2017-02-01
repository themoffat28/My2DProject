package grid.view;

import grid.controller.*;
import grid.model.*;
import grid.view.*;

import java.awt.Dimension;

import javax.swing.JFrame;

public class GridFrame extends JFrame
{
	private GridController baseController;
	private GridPanel appPanel;
	
	public GridFrame(GridController baseController)
	{
		this.baseController = baseController;
		appPanel = new GridPanel(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setTitle("Grid Theatre");
		this.setSize(new Dimension(500, 500));
		this.setVisible(true);
	}
	
	public GridController getBaseController()
	{
		return baseController;
	}
}
