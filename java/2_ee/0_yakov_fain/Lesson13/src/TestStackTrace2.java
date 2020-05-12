import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

class TestStackTrace2 {
	private static final Logger LOGGER = Logger.getLogger(TestStackTrace2.class.getName());
	static {
		try {
			// Creating fileHandler
	        Handler fileHandler  = null;
			fileHandler = new FileHandler("./javacodegeeks.log");

			// Assigning handlers to LOGGER object
			LOGGER.addHandler(fileHandler);

			// Setting levels to handlers and LOGGER
			fileHandler.setLevel(Level.ALL);
			LOGGER.setLevel(Level.ALL);

			LOGGER.config("Configuration done.");

			LOGGER.log(Level.FINE, "Finer logged");
		} catch (IOException exception) {
			LOGGER.log(Level.SEVERE, "Error occur in FileHandler.", exception);
		}
	}

	TestStackTrace2() {

		try {
			divideByZero();
		} catch (ArithmeticException e) {
			LOGGER.log(Level.SEVERE, "Dear friend, don't divide by zero!");
			// System.out.println("Dear friend, don't divide by zero!");
		}
	}

	int divideByZero() {
		return 25 / 0;
	}

	public static void main(String[] args) {
		LOGGER.fine("Fine message logged");
		new TestStackTrace2();
		new TestStackTrace();

	}
}
