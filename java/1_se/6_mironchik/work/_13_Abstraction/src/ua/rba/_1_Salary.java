package ua.rba;

// rukovoditel=dev-1 sozdaet abstraktnyy klass _1_Salary 
public abstract class _1_Salary {
	// dev-2 budet realizovat metot calcCharges() v svoem abstractnom klasse
	public abstract void calcCharges();

	// dev-3 budet realizovat metot reports() v svoem abstractnom klasse
	public abstract void reports();

	// dev-4 budet realizovat metot calcDeduction() v svoem abstractnom klasse
	public abstract void calcDeduction();

	// dev-5 budet override metot countSalary() v svoem klasse
	public void countSalary() {
		calcCharges();
		calcDeduction();
		reports();
	}
}
