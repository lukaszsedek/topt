package pl.edu.pw.elka.topt.gui;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;

import pl.edu.pw.elka.topt.model.Matrix;

public class Center extends JPanel{
	
	BufferedImage image = null;
	
	{
		try {
			image = ImageIO.read(new File("Empty.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Border border = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);	
		setBorder(BorderFactory.createTitledBorder(border, "Matryca prze¸ˆczajˆca"));

	}
	
	public Center()
	{
		
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		if (image!=null)
		{
			for(int i = 0; i < Matrix.getColumns(); ++i)
				for(int j = 0; j < Matrix.getRows(); ++j)
				{
					if( i%2 == 1)
						g.drawImage(image, 64*(i) + 16, 64*(j)+ + 32+ 16, this);
					else
						g.drawImage(image, 64*(i) + 16, 64*(j)+ 16, this);
					System.out.println("col = " + i +  "row = " + j);
				}
		}
	}
	
	

}
