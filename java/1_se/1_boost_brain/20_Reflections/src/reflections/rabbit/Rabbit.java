package reflections.rabbit;

public class Rabbit {
	@Deprecated
	@RabbitAnnotation
	private String rabbitName;
	
	@Deprecated
	@RabbitAnnotation
	private String rabbitAge;

	public String getRabbitName() {
		return rabbitName;
	}

	public String getRabbitAge() {
		return rabbitAge;
	}
	
	
}
