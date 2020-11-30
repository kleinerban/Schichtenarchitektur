package userInterface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import BL.Preis;

import javax.swing.JCheckBox;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class UI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UI window = new UI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public UI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Pfanne");
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JCheckBox chckbxNewCheckBox = (JCheckBox) e.getSource();
				if (chckbxNewCheckBox.isSelected()) {
					try {
						BL.Preis.PreisBerechnenPfanne();
						System.out.println(Preis.Brutto);
					}
					catch (SQLException e1) {
						e1.printStackTrace();
					}
				}
			}
		});
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chckbxNewCheckBox.setBounds(23, 29, 132, 37);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JCheckBox cb_1 = new JCheckBox("Topf");
		cb_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JCheckBox cb_1 = (JCheckBox) e.getSource();
				if (cb_1.isSelected()) {
					try {
						BL.Preis.PreisBerechnenTopf();
						System.out.println(Preis.Brutto);
					}
					catch (SQLException e1) {
						e1.printStackTrace();
					}
				}
			}
		});
		cb_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cb_1.setBounds(23, 102, 99, 23);
		frame.getContentPane().add(cb_1);
		
		JCheckBox cb_2 = new JCheckBox("Messer");
		cb_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JCheckBox cb_2 = (JCheckBox) e.getSource();
				if (cb_2.isSelected()) {
					try {
						BL.Preis.PreisBerechnenMesser();
						System.out.println(Preis.Brutto);
					}
					catch (SQLException e1) {
						e1.printStackTrace();
					}
				}
			}
		});
		cb_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cb_2.setBounds(23, 177, 99, 23);
		frame.getContentPane().add(cb_2);
		
		JButton btnNewButton = new JButton("Preis berechnen");
		btnNewButton.setFont(new Font("Stencil", Font.PLAIN, 14));
		btnNewButton.setBounds(186, 104, 157, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
