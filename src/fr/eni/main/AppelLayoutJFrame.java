package fr.eni.main;

import javax.swing.SwingUtilities;

import fr.eni.layout.MesLayoutJFrame;

public class AppelLayoutJFrame {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				MesLayoutJFrame frame = new MesLayoutJFrame();
				
			}
		});

	}

}
