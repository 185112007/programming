package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class App1 {

	private JFrame frame;
	private JTextField txt2;
	private JTextField txt1;
	private JComboBox lstOp;
	private JLabel labelResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App1 window = new App1();
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
	public App1() {
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
		
		txt1 = new JTextField();
		txt1.setBounds(10, 11, 96, 20);
		frame.getContentPane().add(txt1);
		txt1.setColumns(10);
		
		lstOp = new JComboBox();
		lstOp.setModel(new DefaultComboBoxModel(new String[] {"+", "-", "*", "/"}));
		lstOp.setBounds(114, 10, 34, 22);
		frame.getContentPane().add(lstOp);
		
		txt2 = new JTextField();
		txt2.setBounds(153, 11, 96, 20);
		frame.getContentPane().add(txt2);
		txt2.setColumns(10);
		
		JButton btnNewButton = new JButton("=");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double x1 = Double.parseDouble(txt1.getText());
					double x2 = Double.parseDouble(txt2.getText());
					String op = lstOp.getSelectedItem().toString();
					double xr = 0d;
					switch (op) {
						case "+": xr = x1 + x2; break;
						case "-": xr = x1 - x2; break;
						case "*": xr = x1 * x2; break;
						case "/": xr = x1 / x2; break;
					}
					labelResult.setText(String.valueOf(xr));
				} catch (NumberFormatException e1) {
					JOptionPane.showMessageDialog(frame, e1.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnNewButton.setBounds(260, 10, 91, 23);
		frame.getContentPane().add(btnNewButton);
		
		labelResult = new JLabel("");
		labelResult.setBounds(372, 14, 48, 14);
		frame.getContentPane().add(labelResult);
	}
}
