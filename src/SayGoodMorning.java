
public class SayGoodMorning implements Command {
	
	private Greeting greeting;
	
	public SayGoodMorning(Greeting greeting) {
		
		this.greeting =greeting;
		
	}
	
	
	@Override
	public void execute() {

		this.greeting.GoodMorning();
		
	}

}
