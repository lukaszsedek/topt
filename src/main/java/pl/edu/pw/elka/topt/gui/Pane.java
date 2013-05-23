package pl.edu.pw.elka.topt.gui;

import java.awt.BorderLayout;

import javax.swing.JPanel;

public class Pane extends JPanel{

	protected West west = new West();
	protected East east = new East();
	protected South south = new South();
	protected North north = new North();
	static Center CENTER = new Center();
	
	
	public Pane(){
		setLayout(new BorderLayout());
		
	//	add(BorderLayout.WEST, west);
	//	add(BorderLayout.EAST, east);
		add(BorderLayout.SOUTH, south);
		add(BorderLayout.NORTH, north);
		add(BorderLayout.CENTER, CENTER);
	}
	
}
