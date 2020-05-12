package reflections;

import reflections.rabbit.Rabbit;

public class TestMain {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, InstantiationException {
		ReflectionChecker checker = new ReflectionChecker();
		Rabbit rabbit = new Rabbit();
		
		checker.showClassName(rabbit);
		checker.showClassFields(rabbit);
		checker.showClassMethods(checker);
		checker.showFieldsAnnotations(rabbit);
		
		
		checker.fillPrivateFields(rabbit);
		
		System.out.println("\n" + rabbit.getRabbitAge());
		System.out.println(rabbit.getRabbitName());
		
		Object clone = checker.createNewObject(rabbit);
		checker.showClassName(clone);
	}

}
