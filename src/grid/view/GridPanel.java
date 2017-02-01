package grid.view;

import grid.controller.GridController;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.*;
import javax.swing.table.*;

public class GridPanel extends JPanel
{
	public GridPanel() 
	{
		
	}
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
		
		this.setLayout(baseLayout);
		this.setPreferredSize(new Dimension(900, 600));
		this.rowField = new JTextField (5);
		this.columnField = new JTextField (5);
		this.inputField = new JTextField (5);
		this.inputLabel = new JLabel ("");
		this.rowLabel = new JLabel ("Row");
		this.columnLabel = new JLabel ("Column");
		this.submitButton = new JButton ("Submit");
		
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
		
	}
	
	private void setupListeners()
	{
		
	}
}
