package pl.edu.pw.elka.topt.gui;

import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.Border;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import pl.edu.pw.elka.topt.model.Matrix;

public class South extends JPanel {

	public South() {
		Border border = BorderFactory.createEtchedBorder();
		JButton applyButton = new JButton("Zastosuj");
		SpinnerModel rowNumer = new SpinnerNumberModel(2, 1, 10, 1);
		final JSpinner rowNumberSpinner = new JSpinner(rowNumer);
		rowNumberSpinner.setSize(30, 30);
		SpinnerModel colNumer = new SpinnerNumberModel(2, 1, 10, 1);
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
		add(new JLabel());
		add(new JLabel("Zapotrzebowanie"));
		add(new JLabel());
		add(new JLabel("PrawdopodobieÄætwo blokady"));
		add(new JLabel());
		
		//4
		rowNumberSpinner.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				System.out.println("rows: " + rowNumberSpinner.getValue());
				Matrix.setRows((Integer) rowNumberSpinner.getValue());
				Pane.CENTER.repaint();
			}
		});

		colNumberSpinner.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				System.out.println("col: " + colNumberSpinner.getValue());
				Matrix.setColumns((Integer) colNumberSpinner.getValue());
				Pane.CENTER.repaint();
			}
		});
	}
}
