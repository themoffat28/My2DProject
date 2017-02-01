package grid.controller;

import javax.swing.JOptionPane;
import grid.model.*;
import grid.view.*;
import grid.controller.GridRunner;


public class GridController
{
	private GridFrame appFrame;
	private Theatre [][] grid;
	
	public GridController()
	{
		grid = new Theatre[6][5];
		fillGrid();
		appFrame = new GridFrame(this);
	}
	
	private void fillGrid()
	{
		for (int row = 0; row < grid.length; row++)
		{
			for (int col = 0; col < grid[0].length; col++)
			{
				grid[row][col] = new Theatre();
			}
		}
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
