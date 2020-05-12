package com.practicaljava.lesson6;

public interface Payable {
    final static int INCREASE_CAP = 20; // final static field, mojno i ne pisat
	boolean increasePay(int percent);
}
