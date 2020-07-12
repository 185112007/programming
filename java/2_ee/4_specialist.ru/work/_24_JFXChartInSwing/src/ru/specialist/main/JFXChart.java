package ru.specialist.main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager.LookAndFeelInfo;

import javafx.embed.swing.JFXPanel;

public class JFXChart extends JFrame {

	private static JFXPanel chartFxPanel;
	private static SimpleTModel tableModel;
	
	public JFXChart() {
		initComponents();
		
		tableModel = new SimpleTModel();
		
		chartFxPanel = new JFXPanel();
		chartFxPanel.setPreferredSize(new Dimension(600, 400));
		
		JTable table = new JTable(tableModel);
		table.setGridColor(Color.DARK_GRAY);
		
		for (int i = 0; i < table.getColumnCount(); i++) {
			table.getColumnModel().getColumn(i);
		}
		
		JScrollPane tablePanel = new JScrollPane(table);
		
		tablePanel.setPreferredSize(new Dimension(600, 100));
		JPanel chartTablePanel = new JPanel();
		chartTablePanel.setLayout(new BorderLayout());
	}
	
	private void initComponents() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(new Dimension(603, 542));
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
//		try {
//			for (LookAndFeelInfo info: ) {
//				
//			}
//		} catch (Exception e) {
//			JOptionPane.showMessageDialog(null, "Exception", "Error", JOptionPane.ERROR_MESSAGE);
//		}
		
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new JFXChart().setVisible(true);
			}
		});
	}

}
