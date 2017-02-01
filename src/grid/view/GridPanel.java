package grid.view;

import grid.controller.GridController;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.*;
import javax.swing.table.*;

public class GridPanel extends JPanel
{
	private JTextField rowField;
	private JTextField columnField;
	private JTextField inputField;
	private JLabel inputLabel;
	private JLabel rowLabel;
	private JLabel columnLabel;
	private JButton submitButton;
	private SpringLayout baseLayout;
	private GridController baseController;
	
	private JTable gridTable;
	private JScrollPane gridPane;
	
	public GridPanel(GridController baseController)
	{
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		this.rowField = new JTextField (5);
		this.columnField = new JTextField (5);
		this.inputField = new JTextField (5);
	    this.inputLabel = new JLabel ("");
		this.rowLabel = new JLabel ("Row");
		this.columnLabel = new JLabel ("Column");
		this.submitButton = new JButton ("Submit");
		
		setupTable();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupTable()
	{
		//Load model
		DefaultTableModel data = new DefaultTableModel(baseController.getGrid(), new String []{"one","two","three","four","five"});
		gridTable = new JTable();
		gridTable.setModel(data);
		gridPane = new JScrollPane();
		gridPane.setViewportView(gridTable);
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setMinimumSize(new Dimension(700,700));
		this.setBackground(Color.CYAN);
		this.add(gridPane);
		this.add(columnField);
		this.add(rowField);
		this.add(inputField); 
		this.add(inputLabel);
		this.add(rowLabel);
		this.add(columnLabel);
		this.add(submitButton);
		
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, submitButton, 43, SpringLayout.SOUTH, gridPane);
		baseLayout.putConstraint(SpringLayout.WEST, gridPane, 0, SpringLayout.WEST, inputLabel);
		baseLayout.putConstraint(SpringLayout.SOUTH, gridPane, 363, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, gridPane, 0, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, gridPane, 0, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, inputField, 0, SpringLayout.NORTH, submitButton);
		baseLayout.putConstraint(SpringLayout.EAST, submitButton, -140, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, columnLabel, 6, SpringLayout.SOUTH, columnField);
		baseLayout.putConstraint(SpringLayout.WEST, columnLabel, 10, SpringLayout.WEST, columnField);
		baseLayout.putConstraint(SpringLayout.NORTH, rowLabel, 6, SpringLayout.SOUTH, rowField);
		baseLayout.putConstraint(SpringLayout.WEST, rowLabel, 89, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, inputField, 263, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, columnField, 0, SpringLayout.NORTH, inputField);
		baseLayout.putConstraint(SpringLayout.EAST, columnField, -26, SpringLayout.WEST, inputField);
		baseLayout.putConstraint(SpringLayout.NORTH, rowField, 0, SpringLayout.NORTH, columnField);
		baseLayout.putConstraint(SpringLayout.EAST, rowField, -29, SpringLayout.WEST, columnField);
	}
	
	private void setupListeners()
	{
		
	}
}
