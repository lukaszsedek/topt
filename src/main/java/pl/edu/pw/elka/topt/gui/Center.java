package pl.edu.pw.elka.topt.gui;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

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
			URL url = getClass().getResource("/Empty.png");
			image = ImageIO.read(url);
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
						g.drawImage(image, 48*(i) + 16, 48*(j)+ 24 + 24, this);
					else
						g.drawImage(image, 48*(i) + 16, 48*(j)+ 24, this);
				}
		}
	}
	
	

}
