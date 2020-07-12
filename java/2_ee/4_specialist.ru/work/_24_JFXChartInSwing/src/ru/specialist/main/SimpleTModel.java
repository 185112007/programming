package ru.specialist.main;

import javax.swing.table.AbstractTableModel;

import javafx.collections.ObservableList;
import javafx.scene.chart.BarChart;

public class SimpleTModel extends AbstractTableModel {

	private static ObservableList<BarChart<?, ?>> bcData;
	private final String[] names = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
	private final Integer[][] data = {{23,45,56,77,60},
									  {56,77,47,88,37}};
	
	@Override
	public int getRowCount() {
		return data.length;
	}

	@Override
	public int getColumnCount() {
		return names.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		return data[rowIndex][columnIndex];
	}

}
