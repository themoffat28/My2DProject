package grid.view;

import javax.swing.*;
import grid.controller.GridController;
import javax.swing.table.*;
import java.awt.Color;
import java.awt.Dimension;

public class GridPanel extends JPanel
{
	public GridPanel() {
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
	
	private void GridPanel(GridController baseController)
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
		this.setSize(new Dimension(900,600));
		this.setBackground(Color.WHITE);
		
		rowField.setEditable(true);
		columnField.setEditable(true);
		inputField.setEditable(true);
		
		inputLabel.setVerticalTextPosition(JLabel.BOTTOM);
		inputLabel.setHorizontalAlignment(JLabel.CENTER);
		
		rowLabel.setVerticalTextPosition(JLabel.BOTTOM);
		rowLabel.setHorizontalAlignment(JLabel.CENTER);
		
		columnLabel.setVerticalTextPosition(JLabel.BOTTOM);
		columnLabel.setHorizontalAlignment(JLabel.CENTER);
		
		this.add(rowField);
		this.add(columnField);
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
