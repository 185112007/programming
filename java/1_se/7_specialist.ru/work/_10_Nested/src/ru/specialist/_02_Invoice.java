package ru.specialist;

import java.util.ArrayList;

public class _02_Invoice {
	private double total;
	private String customer;
	
	private ArrayList<Line> lines = new ArrayList<>();
	
	public _02_Invoice(String customer) {
		setCustomer(customer);
	}

	public double getTotal() {
		return total;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("%-30s : %8.2f", getCustomer(), getTotal())).append("\n-----\n");
		for (Line line : lines) {
			sb.append(line.toString()).append("\n");
		}
		return sb.toString();
	}

	public class Line{
		private String good;
		private double price;
		private int quantity;
		private double sum;
		
		private void updateSum() {
			updateSum(false);
		}
		
		private void updateSum(boolean isNew) {
			
			if (!isNew) {
				total -= sum;
			}
			sum = price * quantity;
			total += sum;
		}
		
		public Line(String good, double price, int quantity) {
			setGood(good);
			this.price = price;
			this.quantity = quantity;
			updateSum(true);
			lines.add(this);
		}
		public String getGood() {
			return good;
		}
		public void setGood(String good) {
			this.good = good;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
			updateSum();
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
			updateSum();
		}
		public double getSum() {
			return sum;
		}
		
		@Override
		public String toString() {
			return String.format("%-20s %6.2f %4d %7.2f", getGood(), getPrice(), getQuantity(), getSum());
		}
	}
}
