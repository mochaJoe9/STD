package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class STDGUI extends JFrame
{
	private final int mintWidth = 1000;
	private final int mintHeight = 400;
	
	private JFrame mguiWindow;
	
	private JPanel mguiListPanel, mguiItemPanel;
	
	/**
	 * Constructor
	 */
	public STDGUI()
	{
		
		//create the window
		mguiWindow = new JFrame();
				
		mguiWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		//set the window's title
		mguiWindow.setTitle("Shit To Do");
				
		//set the window size
		mguiWindow.setSize(mintWidth, mintHeight);
				
		//set background color
		mguiWindow.setBackground(Color.DARK_GRAY);
				
		//add the border layout to the window
		mguiWindow.setLayout(new BorderLayout());
		
		CreateListPanel();
		
		//add the list panel to the window
		
		mguiWindow.setVisible(true);
		
	}
	
	private void CreateListPanel()
	{
		mguiListPanel = new JPanel();
		
		mguiListPanel.setLayout(new FlowLayout(FlowLayout.LEADING));
		
		//get list names from the database
		
		//create a button for each list with a button listener
		
		//add buttons to panel
		
		//add scrolling to the panel
		
		
	}
	
	public static void main(String[] args) 
	{
		STDGUI std = new STDGUI();
	}

}
