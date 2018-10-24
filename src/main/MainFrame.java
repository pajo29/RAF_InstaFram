package main;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JToolBar;
import javax.swing.WindowConstants;

import menu.MenuBar;
import statusBar.StatusBarView;
import toolbar.MainToolBar;

public class MainFrame extends JFrame {
	
	private static MainFrame instance = null;
	
	private MainFrame()
	{
		add(new MenuBar(), BorderLayout.NORTH);
		add(new MainToolBar());
		add(new MainSplitPane());
		add(new StatusBarView(), BorderLayout.SOUTH);
		
		Toolkit kit = Toolkit.getDefaultToolkit();
		setSize(1000, 1000);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setTitle("InstaFram RN75/18");
		
	}
	
	public static MainFrame getInstance()
	{
		if(instance == null)
		{
			instance = new MainFrame();
		}
		return instance;
	}

}
