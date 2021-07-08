package fr.eni.layout;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MesLayoutJFrame extends JFrame{

	private JPanel panel;
	private JLabel label;
	private JTextField textField;
	private JButton btn1;
	private JButton btn2;
	private JCheckBox checkBox;
	
	public MesLayoutJFrame() {

		this.setSize(450, 300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setVisible(true);
		
		panel = new JPanel();
		btn1 = new JButton("Bouton 1");
		btn2 = new JButton("Bouton 2");
		label = new JLabel("mon label");
		checkBox = new JCheckBox("Ma case à cocher");
		textField = new JTextField("Mon champ texte");
		
		
		//useFlowLayout();
		useBoxLayoutX();
		//useBoxLayoutY();
		//useGridLayout();
		//useBorderLayout();
		//useNullLayout();
		//useGridBagLayout();
	}

	private void useGridBagLayout() {
		GridBagLayout layout = new GridBagLayout();
		panel.setLayout(layout);
		this.getContentPane().add(panel);
		
		GridBagConstraints gbc = new GridBagConstraints();
		
		gbc.weightx = 3;
		gbc.weighty = 2;
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.insets = new Insets(10, 10, 10, 10);
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		panel.add(label, gbc);
		
		gbc.gridwidth = 2;
		gbc.gridx = 1;
		panel.add(btn1, gbc); 
		
		gbc.gridwidth = 1;
		gbc.gridx = 0;
		gbc.gridy = 1;
		panel.add(textField, gbc); 
		
		gbc.gridx = 1;
		gbc.gridy = 1;
		panel.add(btn2, gbc); 
		
		gbc.gridx = 2;
		gbc.gridy = 1;
		panel.add(checkBox, gbc); 
		
	}

	private void useFlowLayout() {
		FlowLayout layout = new FlowLayout();
		panel.setLayout(layout);
		this.getContentPane().add(panel);
		panel.add(btn1);
		panel.add(btn2);
		panel.add(label);
		panel.add(checkBox);
		panel.add(textField);
		
	}

	private void useBoxLayoutX() {
		BoxLayout layout = new BoxLayout(panel, BoxLayout.X_AXIS);
		panel.setLayout(layout);
		this.getContentPane().add(panel);
		panel.add(btn1);
		panel.add(btn2);
		panel.add(label);
		panel.add(checkBox);
		panel.add(textField);
		
	}
	

	private void useBoxLayoutY() {
		BoxLayout layout = new BoxLayout(panel, BoxLayout.Y_AXIS);
		panel.setLayout(layout);
		this.getContentPane().add(panel);
		panel.add(btn1);
		panel.add(btn2);
		panel.add(label);
		panel.add(checkBox);
		panel.add(textField);
		
	}
	
	

	private void useGridLayout() {
		GridLayout layout = new GridLayout(2, 3);
		panel.setLayout(layout);
		this.getContentPane().add(panel);
		
		JPanel panneauHG = new JPanel();
		panneauHG.setLayout(new FlowLayout());
		
		panneauHG.add(btn1);
		
		panel.add(panneauHG);
		panel.add(btn2);
		panel.add(label);
		panel.add(checkBox);
		panel.add(textField);
		
	}


	private void useBorderLayout() {
		BorderLayout layout = new BorderLayout();
		panel.setLayout(layout);
		this.getContentPane().add(panel);
		panel.add(btn1, BorderLayout.NORTH);
		panel.add(btn2, BorderLayout.WEST);
		panel.add(label, BorderLayout.SOUTH);
		panel.add(checkBox, BorderLayout.EAST);
		panel.add(textField, BorderLayout.CENTER);
		
	}


	private void useNullLayout() {
		panel.setLayout(null);
		this.getContentPane().add(panel);
		
		btn1.setSize(150, 50);
		btn2.setSize(150, 50);
		label.setSize(170, 30);
		btn1.setLocation(70, 70);
		btn2.setLocation(30, 120);
		label.setLocation(0, 0);
		
		checkBox.setBounds(40, 200, 70, 40);
		textField.setBounds(200, 200, 70, 40);
		

		panel.add(btn1);
		panel.add(btn2);
		panel.add(label);
		panel.add(checkBox);
		panel.add(textField);
		
	}
	
	
}
