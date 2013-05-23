package pl.edu.pw.elka.topt.gui;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class MyFrame extends JFrame {

	int width = 800, height = 600;
	String title = "Obliczanie blokowania macierzy";
	Pane panel = new Pane();
	
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Adjust window centrally on screen
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation((dim.width - width) / 2, (dim.height - height) / 2);

		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		
		getContentPane().add(panel);
	}

	public MyFrame() {
		setSize(width, height);
		setTitle(title);
	}

}
