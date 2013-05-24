package pl.edu.pw.elka.topt.gui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.Border;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.filechooser.FileNameExtensionFilter;

import pl.edu.pw.elka.topt.model.Matrix;

public class South extends JPanel {
	protected JButton openFileButton = new JButton("Wczytaj z pliku");
	protected JButton randomStruct = new JButton("Losuj");
	
	public South() {
		Border border = BorderFactory.createEtchedBorder();
		SpinnerModel rowNumer = new SpinnerNumberModel(Matrix.getRows(), 1, 10, 1);
		final JSpinner rowNumberSpinner = new JSpinner(rowNumer);
		rowNumberSpinner.setSize(30, 30);
		SpinnerModel colNumer = new SpinnerNumberModel(Matrix.getColumns(), 1, 10, 1);
		final JSpinner colNumberSpinner = new JSpinner(colNumer);
		setBorder(BorderFactory.createTitledBorder(border, "Ustawienia"));
		

		JLabel label1 = new JLabel("Rozmiar macierzy");

		setLayout(new GridLayout(3, 5, 10, 0));
		//1
		add(new JLabel());
		add(new JLabel("Wiersze"));
		add(new JLabel("Kolumny"));
		add(new JLabel());
		add(new JLabel());

		//2
		add(label1);
		add(rowNumberSpinner);
		add(colNumberSpinner);
		add(new JLabel());
		add(new JLabel());
		
		//3
		add(new JLabel("Zapotrzebowanie"));
		add(openFileButton);
		add(randomStruct);
		add(new JLabel("PrawdopodobieÄætwo blokady"));
		add(new JLabel());
		
		//4
		rowNumberSpinner.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				Matrix.setRows((Integer) rowNumberSpinner.getValue());
				Pane.CENTER.repaint();
			}
		});

		colNumberSpinner.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				Matrix.setColumns((Integer) colNumberSpinner.getValue());
				Pane.CENTER.repaint();
			}
		});
		
		openFileButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser fileChooser = new JFileChooser();
				fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("Text files", "txt"));
		        fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("MS Office Documents", "docx", "xlsx", "pptx"));
		        fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("Images", "jpg", "png", "gif", "bmp"));
		        fileChooser.setAcceptAllFileFilterUsed(false);
				int result = fileChooser.showOpenDialog(fileChooser);
				switch (result) {
				case JFileChooser.APPROVE_OPTION:
					File selectedFile = fileChooser.getSelectedFile();
					String path = selectedFile.getAbsolutePath();
					System.out.println(path);
					break;

				default:
					break;
				}
				
			}
		});
	}
}
