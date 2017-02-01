package grid.controller;

import javax.swing.JOptionPane;
import grid.model.*;
import grid.view.*;


public class GridController
{
	private GridFrame appFrame;
	private Theatre [][] grid;
	
	public GridController()
	{
		//Create Model Objects
		appFrame = new GridFrame(this);
		grid = new Theatre[6][5];
	}
	
	public void start()
	{
		JOptionPane.showMessageDialog(appFrame, "This is my 2D creation");
	}
	
	public Theatre[][] getGrid()
	{
		return grid;
	}
	
	public GridFrame getFrame()
	{
		return appFrame;
	}
}
