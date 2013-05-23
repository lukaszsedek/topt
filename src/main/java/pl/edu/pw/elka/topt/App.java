package pl.edu.pw.elka.topt;

import pl.edu.pw.elka.topt.gui.MyFrame;


/**
 * Hello world!
 *
 */
public class App 
{
	static MyFrame myF = null;
	
    public static void main( String[] args )
    {
    	javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	// JAVA SWING GUI Thread
            	myF = new MyFrame();
            	myF.setVisible(true);
            }
        });
    }
}
