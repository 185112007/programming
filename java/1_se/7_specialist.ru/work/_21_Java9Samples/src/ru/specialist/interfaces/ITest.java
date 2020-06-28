package ru.specialist.interfaces;

public interface ITest {
	
	// java 9: private methods with realization
	private void testImpl() {
		System.out.println("ITest.testImpl");
	}
	
	// java 8: default method
	default void test() {
		System.out.println("Test.test()");
		testImpl();
	}
}
